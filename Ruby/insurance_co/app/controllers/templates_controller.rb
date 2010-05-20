class TemplatesController < ApplicationController
  before_filter :verify_account, :find_template
    
  def new; end
  
  def create
    template_file = File.read(InsuranceCo.template_path)
    
    ds_connection.upload_template(:templateXML => template_file, :accountID => session.account[:account_id], :shared => true)
    
    redirect_to account_path
  end
  
  protected
  
  def verify_account
    redirect_to new_login_path unless session.account
  end
  
  def find_template
    redirect_to account_path and return if session.template_id
    
    response  = ds_connection.request_templates :accountID => session.account[:id]
    templates = response.request_templates_result
    
    if t = templates.find { |t| t.name == InsuranceCo::TEMPLATE_NAME }
      session.template_id = t.template_id      
      redirect_to account_path
    end
  end
end
