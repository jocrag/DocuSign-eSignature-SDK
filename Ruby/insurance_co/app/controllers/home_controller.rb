class HomeController < ApplicationController
  before_filter :redirect_if_logged_in
  
  def index; end
  
  protected
  
  def redirect_if_logged_in
    redirect_to account_path if session.account
  end
end
