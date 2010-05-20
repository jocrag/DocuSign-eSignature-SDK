# Filters added to this controller apply to all controllers in the application.
# Likewise, all the methods added will be available for all controllers.

class ApplicationController < ActionController::Base
  include Intercession
    
  helper :all # include all helpers, all the time
  protect_from_forgery # See ActionController::RequestForgeryProtection for details
  
  # Scrub sensitive parameters from your log
  # filter_parameter_logging :password
  def ds_connection
    session.ds_connection
  end
  
  def ds_credential_connection
    Docusign::Credential::CredentialSoap.new.tap do |c|
      c.endpoint_url = Docusign::Config[:credential_endpoint_url]
    end
  end
    
  def verify_account
    redirect_to new_login_path unless session.account && session.password
  end
  
  def verify_template
    redirect_to new_template_path unless session.template_id
  end
end
