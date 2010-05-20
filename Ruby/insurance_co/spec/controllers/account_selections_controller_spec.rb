require 'spec_helper'

describe AccountSelectionsController do
  integrate_views
  
  def put_accounts_into_session
    session[:accounts] = [
      {
        :account_id   => '12345',
        :user_id      => '12345',
        :user_name    => 'Joe User',
        :account_name => 'Test Account'
      },
      
      {
        :account_id   => '23456',
        :user_id      => '23456',
        :user_name    => 'Bob User',
        :account_name => 'Test Account Two'
      }
    ]
  end
  
  describe "#new" do
    context "with an account in the session" do
      before(:each) do
        session[:account] = {}
      end
      
      it "should redirect to account_path" do
        get :new
        response.should redirect_to(account_path)
      end
    end
    
    context "with no accounts to disambiguate" do
      it "should redirect to login" do
        get :new
        response.should redirect_to(new_login_path)
      end
    end
    
    context "with accounts in the session" do
      before(:each) do
        put_accounts_into_session
      end
      
      it "should render new" do
        get :new
        response.should render_template('new')
      end
    end
  end
  
  describe "#create" do
    context "passing in a valid account" do
      before(:each) do
        put_accounts_into_session
      end
      
      it "should put the account into the session" do
        post :create, :account_id => '12345'
        session[:account][:account_id].should == '12345'
      end
      
      it "should remove the disambiguation from the session" do
        post :create, :account_id => '12345'
        session[:accounts].should be_nil
      end
      
      it "should redirect to templates_controller#new" do
        post :create, :account_id => '12345'
        response.should redirect_to(new_template_path)
      end
    end
  end
end
