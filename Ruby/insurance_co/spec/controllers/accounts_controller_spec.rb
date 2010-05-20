require 'spec_helper'

describe AccountsController do
  integrate_views
  
  describe "#show" do
    context "no account in the session" do
      it "should redirect to login" do
        get :show
        response.should redirect_to(new_login_path)
      end
    end
    
    context "with an account but no template in the session" do
      before(:each) do
        session.account = {}
        session.password = 'password'
      end
      
      it "should redirect to new_template_path" do
        get :show
        response.should redirect_to(new_template_path)
      end
    end
  end
end
