require 'spec_helper'

describe InsuranceApplication do
  before(:each) do
    @app = Factory(:insurance_application)
    
    # This is in spec_helper.rb
    @envelope = build_test_envelope
  end
  
  describe "#fill_envelope" do
    let(:envelope) { @app.fill_envelope(@envelope) }
    let(:signature_info) { envelope.recipients.first.signature_info }
    
    it "should return a Docusign::Envelope" do
      envelope.should be_an_instance_of(Docusign::Envelope)
    end
    
    it "should set envelope stamping to true" do
      envelope.envelope_id_stamping.should be_true
    end
    
    it "should set the subject to InsuranceApplication::SUBJECT" do
      envelope.subject.should == InsuranceApplication::SUBJECT
    end
    
    it "should set the email_blurb to InsuranceApplication::BLURB" do
      envelope.email_blurb.should == InsuranceApplication::BLURB
    end
    
    it "should set signature_info for the recipient" do
      signature_info.should be_an_instance_of(Docusign::RecipientSignatureInfo)
    end
    
    it "should set the signature_info font style" do
      signature_info.font_style.should == Docusign::FontStyleCode::BradleyHandITC
    end
    
    it "should set the signature name" do
      signature_info.signature_name.should == "#{@app.first_name} #{@app.last_name}"
    end
    
    it "should set the signature initials" do
      signature_info.signature_initials.should == "FL"
    end
    
    %w[Make Model VIN].each do |attr|
      it "should set the the #{attr} tab value" do
        envelope.tabs.find { |t| t.tab_label == attr }.value.should == @app.send(attr.downcase)
      end
    end
  end
end
 