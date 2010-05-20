require 'spec_helper'

describe LoginsController do
  integrate_views
  
  describe "#new" do
    it "should succeed" do
      get :new
      response.should be_success
    end
  end
  
  describe "#create" do
    context "with an invalid login" do
      before(:each) do
        Docusign::Base.stubs(:credentials).returns(stub(:success? => false, :authentication_message => 'oh noes'))
      end
      
      it "should redirect to new" do
        post :create, :email => 'foo@bar.com', :password => 'baz'
        response.should redirect_to(new_login_path)
      end
    end
    
    context "with a valid login and one account" do
      before(:each) do
        Docusign::Base.stubs(:credentials).returns(stub(:success? => true, :accounts => [
          Docusign::Credential::ArrayOfAccount::Account.new.tap do |a| 
            a.account_id   = '12345'
            a.user_id      = '12345'
            a.user_name    = 'Joe User'
            a.account_name = 'Test Account'
          end
        ]))
      end
      
      it "should store the account information in the session" do
        post :create, :email => 'foo@bar.com', :password => 'baz'
        session[:account][:account_id].should == '12345'
      end
      
      it "should store the password in the session" do
        post :create, :email => 'foo@bar.com', :password => 'baz'
        session[:password].should == 'baz'
      end
      
      it "should redirect to templates controller" do
        post :create, :email => 'foo@bar.com', :password => 'baz'
        response.should redirect_to(new_template_path)
      end
    end
    
    context "with a valid login and more than one account" do
      before(:each) do
        Docusign::Base.stubs(:credentials).returns(stub(:success? => true, :accounts => [
          Docusign::Credential::ArrayOfAccount::Account.new.tap do |a| 
            a.account_id   = '12345'
            a.user_id      = '12345'
            a.user_name    = 'Joe User'
            a.account_name = 'Test Account'
          end,
          
          Docusign::Credential::ArrayOfAccount::Account.new.tap do |a| 
            a.account_id   = '23456'
            a.user_id      = '23456'
            a.user_name    = 'Bob User'
            a.account_name = 'Test Account Two'
          end
        ]))
      end
      
      it "should store both accounts in the session" do
        post :create, :email => 'foo@bar.com', :password => 'baz'
        session[:accounts].all? { |a| a.is_a?(Hash) }.should be_true
      end
      
      it "should redirect to account_selections_controller" do
        post :create, :email => 'foo@bar.com', :password => 'baz'
        response.should redirect_to(new_account_selection_path)
      end
    end
  end
  
  describe "#destroy" do
    context "with an account in the session" do
      before(:each) do
        session.account = {}
      end
      
      it "should destroy the session" do
        delete :destroy
        session.account.should be_nil
      end
      
      it "should redirect to new" do
        delete :destroy
        response.should redirect_to(new_login_path)
      end
    end
  end
end
