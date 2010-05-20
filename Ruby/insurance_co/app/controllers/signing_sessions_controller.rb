class SigningSessionsController < ApplicationController
  before_filter :verify_account, :verify_template
  
  STATUS_MESSAGES = HashWithIndifferentAccess.new(
    :signing_complete   => 'Signing was successfully completed',
    :viewing_complete   => 'Viewing was successfully completed',
    :cancel             => 'The user cancelled the signing process',
    :decline            => 'The user declined to sign the document(s)',
    :session_timeout    => 'The signing session has timed out',
    :ttl_expired        => 'The signing session TTL has expired',
    :exception          => 'The signing service raised an exception',
    :access_code_failed => 'Access code failed',
    :id_check_failed    => 'Identification check failed'
  )
  
  def show
    redirect_to root_path unless @status_message = STATUS_MESSAGES[params[:status]]
  end
end
