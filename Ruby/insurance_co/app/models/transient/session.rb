module Transient
  module Session
    
    def self.sattr_accessor(*args)
      args.each do |arg|
        module_eval %Q{
          def #{arg}
            self[:#{arg}]
          end
          
          def #{arg}=(value)
            self[:#{arg}] = value 
          end
        }
      end
    end
    
    sattr_accessor :accounts, :account, :email, :password, :template_id, :envelope_id
    attr_writer    :template
    
    def template(options = {})
      # We can't serialze the template itself into the session, so we'll have to get it
      # from the API when it's requested.
      
      @template ||= (
        response = ds_connection.request_template :templateID => template_id, :includeDocumentBytes => options[:include_document_bytes]
        returning response.request_template_result do |t|
          # This is odd... SOAP4R seems to double-encode the templates
          t.envelope.documents.each { |d| d.pdf_bytes = Base64.decode64 d.pdf_bytes } if options[:include_document_bytes]
        end
      )
    end
    
    def ds_connection
      if account && password
        @connection ||= Docusign::Base.login(
          :integrators_key => Docusign::Config[:integrators_key],
          :email           => account[:email],
          :password        => password,
          :endpoint_url    => Docusign::Config[:default_endpoint_url],
          :wiredump_dev    => Docusign::Config[:debug] ? Rails.logger.instance_variable_get(:@log) : nil
        )
      else
        missing = []
        missing << "account" unless session[:account]
        missing << "password" unless session[:password]

        raise "Attempted to create a Docusign connection without: #{missing.join(', ')} "
      end
    end
  end
end