# See lib/active_record/tableless for parent class implementation

class InsuranceApplication < ActiveRecord::Tableless
  COMPLETE_OPTIONS = [
    ['Send Application', 'send'],
    ['Send and Sign Application', 'complete'], 
    ['Send and Customize Application', 'customize']
  ]
  
  SUBJECT = "Automobile Insurance Application"
  BLURB   = "Please review and complete this automobile insurance application"
  
  column :first_name
  column :last_name
  column :make
  column :model
  column :vin
  column :completion_option, :string, 'send'
  column :signer_email
  column :cc_email
  
  validates_presence_of :first_name, :last_name, :make, :model, :vin, :completion_option, :signer_email
  
  def fill_envelope(envelope)
    returning envelope do |e|
      e.subject     = SUBJECT
      e.email_blurb = BLURB

      e.envelope_id_stamping = true
      
      e.recipients.each do |r|
        r.signer_name = full_name
        r.user_name   = full_name
        r.email = signer_email if signer_email
        
        r.signature_info = Docusign::RecipientSignatureInfo.new.tap do |i|
          i.signature_initials = initials(r.signer_name)
          i.font_style         = Docusign::FontStyleCode::BradleyHandITC
          i.signature_name     = r.user_name
        end       
      end
      
      if cc_email.present?
        e.recipients << Docusign::Recipient.new.tap do |r|
          r.id                = Time.now.to_i
          r.signer_name       = 'CC Recipient'
          r.user_name         = 'CC Recipient'
          r.type              = Docusign::RecipientTypeCode::CarbonCopy
          r.email             = cc_email
          r.access_code       = ''
          r.require_id_lookup = false
        end
      end
      
      %w[Make Model VIN].each do |attr|
        tab = e.tabs.find { |t| t.tab_label == attr }
        tab.value = send(attr.downcase)
      end
    end
  end
  
  protected
  
  def full_name
    "#{first_name} #{last_name}"
  end
  
  def initials(name)
    name.to_s.split(' ').map(&:first).map(&:upcase).join
  end
end