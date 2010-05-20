class AccountSelectionsController < ApplicationController
  before_filter :check_account, :check_accounts
  
  def new
    @accounts = session[:accounts]
  end
  
  def create
    session[:account]  = session[:accounts].find { |a| a[:account_id] == params[:account_id] }
    session[:accounts] = nil
    
    redirect_to new_template_path
  end
  
  protected
  
  def check_account
    redirect_to account_path if session[:account]
  end
  
  def check_accounts
    redirect_to new_login_path unless session[:accounts]
  end
end
