require 'spec_helper'

describe TemplatesController do
  integrate_views
  
  def stub_template_request(template_name)
    Docusign::Base.stubs(:login).returns(
      connection_stub(template_name)
    )
  end
  
  def connection_stub(template_name = nil)
    @connection_stub ||= stub(
      :request_templates => stub(
        :request_templates_result => [
          stub(
            :template_id => '12345',
            :name => template_name
          )
        ]
      ),
      
      :request_template => stub(
        :request_template_result => Docusign::EnvelopeTemplate.new
      )
    )
  end
  
  def mock_template_upload(success = true)
    connection_stub.expects(:upload_template).returns(
      stub(
        :upload_template_result => stub(
          :name => 'Template Name',
          :template_id => '12345',
          :success => success
        )
      )
    )
  end
  
  describe "#new" do
    context "with no account in the session" do
      before(:each) do
        session.stubs(:account).returns(nil)
      end
      
      it "should redirect to login" do
        get :new
        response.should redirect_to(new_login_path)
      end
    end
    
    context "with an account in the session" do
      before(:each) do
        session.account = {:a => 'b'}
        session.password = 'foobar'
      end
      
      context "with an existing template in the session" do
        before(:each) do
          session.template_id = '12345'
        end

        it "should redirect to account" do
          get :new
          response.should redirect_to(account_path)
        end
      end

      context "with no existing template in the session but a template in the account matching the template name" do
        before(:each) do
          session.account = {:a => 'b'}
          stub_template_request(InsuranceCo::TEMPLATE_NAME)
        end

        it "should redirect to account_path" do
          get :new
          response.should redirect_to(account_path)
        end
        
        it "should put the template_id in the session" do
          get :new
          session.template_id.should be_present
        end
      end

      context "with no matching template" do
        before(:each) do
          stub_template_request('This is not the template you are looking for')
        end
        
        it "should render new" do
          get :new
          response.should render_template('new')
        end
      end
    end
  end
  
  describe "#create" do
    context "with an account in the session" do
      before(:each) do
        session.account = {:account_id => '12345'}
        session.password = 'foobar'
        stub_template_request('foobar')
      end
      
      context "with a successful response" do
        before(:each) do
          mock_template_upload
        end
        
        it "should redirect to account_path" do
          post :create
          response.should redirect_to(account_path)
        end
      end
    end
  end
end
