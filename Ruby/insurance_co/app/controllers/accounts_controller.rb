class AccountsController < ApplicationController
  before_filter :verify_account, :verify_template
  
  def show; end
end
