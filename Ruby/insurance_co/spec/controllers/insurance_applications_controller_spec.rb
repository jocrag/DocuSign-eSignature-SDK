require 'spec_helper'

describe InsuranceApplicationsController do
  integrate_views
  
  describe "#new" do
    context "without an account or template_id in the session" do
      it "should redirect to new_login_path" do
        get :new
        response.should redirect_to(new_login_path)
      end
    end
    
    context "with an account and no template_id in the session" do
      before(:each) do
        session.account = {}
        session.password = 'password'
      end

      it "should redirect to new_template_path" do
        get :new
        response.should redirect_to(new_template_path)
      end
    end
    
    context "with both an account and template_id in the session" do
      before(:each) do
        session.account = {}
        session.password = 'password'
        session.template_id = '12345'
      end
      
      it "should render new" do
        get :new
        response.should render_template('new')
      end
    end
  end
  
  describe "create" do
    context "with both an account and template in the session" do
      before(:each) do
        session.account = {
          :account_id => '12345',
          :email => 'some@email.com'          
        }
        session.password = 'password'
        session.template_id = '12345'
      end
      
      context "submitting invalid data" do
        it "should render new" do
          post :create, :insurance_application => {}
          response.should render_template('new')
        end
      end
      
      context "submitting valid data" do
        before(:each) do
          session.stubs(:template).returns(stub(:envelope => build_test_envelope))
        end
        
        let(:valid_data) { Factory.attributes_for(:insurance_application) }
        
        context "sending the envelope" do
          def create_and_send_stub
            stub(
              :create_and_send_envelope_result => stub(
                :envelope_id => '12345',
                :status => 'pending'
              )
            )
          end
          
          before(:each) do
            Docusign::APIServiceSoap.any_instance.stubs(:create_and_send_envelope).returns(create_and_send_stub)
          end
          
          let(:send_envelope) { post :create, :insurance_application => valid_data.merge(:completion_option => 'send') }
          
          it "should redirect to envelope path" do
            send_envelope
            response.should redirect_to(envelope_path('12345'))
          end
          
          it "should create and send the envelope" do
            Docusign::APIServiceSoap.any_instance.expects(:create_and_send_envelope).returns(create_and_send_stub)
            send_envelope
          end
        end
      end
    end
  end
end
