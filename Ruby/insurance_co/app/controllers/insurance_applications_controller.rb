class InsuranceApplicationsController < ApplicationController
  before_filter :verify_account, :verify_template, :new_insurance_application
  
  def new; end
  
  def create
    if @insurance_application.valid?
      @envelope  = @insurance_application.fill_envelope(session.template(:include_document_bytes => true).envelope)
      @recipient = @envelope.recipients.first
      
      # There are three options here: Deferred Sending, Embedded Signing, and Embedded Sending (customization)      
      case @insurance_application.completion_option
      when 'send'
        # Deferred sending
        response        = ds_connection.create_and_send_envelope :envelope => @envelope
        envelope_status = response.create_and_send_envelope_result

        redirect_to envelope_path(envelope_status.envelope_id)
        
      when 'complete'
        # Embedded signing
        @recipient.captive_info = Docusign::RecipientCaptiveInfo.new.tap do |i|
          i.client_user_id = Time.now.to_i
        end
        
        response        = ds_connection.create_and_send_envelope :envelope => @envelope
        envelope_status = response.create_and_send_envelope_result
        
        # Store the envelope_id so we can refer to it later
        session.envelope_id = envelope_status.envelope_id
        
        token = generate_recipient_token @recipient, envelope_status
        token_response = ds_connection.request_recipient_token token
        
        redirect_to token_response.request_recipient_token_result
        
      when 'customize'
        # Embedded sending
        response        = ds_connection.create_envelope :envelope => @envelope
        envelope_status = response.create_envelope_result
        
        # Store the envelope_id so we can refer to it later
        session.envelope_id = envelope_status.envelope_id
        
        token_response = ds_credential_connection.request_sender_token(
          :email      => session.email,
          :password   => session.password,
          :accountID  => session.account[:account_id],
          :envelopeID => envelope_status.envelope_id,
          :returnURL  => envelopes_url
        )
        
        redirect_to token_response.request_sender_token_result
      end    
    else
      render :new      
    end
  end
  
  protected
  
  def new_insurance_application
    @insurance_application = InsuranceApplication.new(params[:insurance_application])
  end
  
  def generate_recipient_token(signer, envelope_status)
    token = Docusign::RequestRecipientToken.new.tap do |t|
      t.authentication_assertion = Docusign::RequestRecipientTokenAuthenticationAssertion.new.tap do |a|
        a.assertion_id           = Time.now.to_i.to_s
        a.authentication_instant = Time.now
        a.authentication_method  = Docusign::RequestRecipientTokenAuthenticationAssertionAuthenticationMethod::Biometric # because let's be honest, biometrics are awesome.
        a.security_domain        = "#{request.domain}:80"
      end
            
      # Set all the callback URLs in one fell swoop..
      t.client_urls = Docusign::RequestRecipientTokenClientURLs.new.tap do |u|
        Docusign::RequestRecipientTokenClientURLs::CALLBACKS.each do |result|
          # Example: u.on_signing_complete = signing_session_url(:status => 'signing_complete')
          u.send "on_#{result}=", signing_session_url(:status => result)
        end
      end
      
      t.client_user_id = signer.captive_info.client_user_id
      t.email          = signer.email
      t.envelope_id    = envelope_status.envelope_id
      t.username       = signer.user_name
    end
    
    token
  end
end
