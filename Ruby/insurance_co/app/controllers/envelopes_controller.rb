class EnvelopesController < ApplicationController
  before_filter :verify_account, :verify_template
  
  def index
    # Request statuses in the last week
    status_filter = Docusign::EnvelopeStatusFilter.new.tap do |f|
      f.begin_date_time = XSD::XSDDateTime.new(1.week.ago).to_s
      f.account_id = session.account[:account_id]
    end
    
    response  = ds_connection.request_statuses :envelopeStatusFilter => status_filter
    @statuses = response.request_statuses_result.envelope_statuses
  end
  
  def show
    @envelope_info = ds_connection.request_status(:envelopeID => params[:id]).request_status_result
    
    recipient_status = @envelope_info.recipient_statuses.first
    
    @tab_label_info = %w[Make Model VIN].inject({}) do |hash, field|
      tab = recipient_status.tab_statuses.find { |t| t.tab_label == field }
      hash[field] = tab.tab_value if tab
      hash
    end
  end
end
