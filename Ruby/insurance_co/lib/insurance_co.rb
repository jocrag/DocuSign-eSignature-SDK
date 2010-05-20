module InsuranceCo
  TEMPLATE_NAME = 'Auto Insurance Application'
  
  def self.template_path
    Rails.root.join('public', 'ds_templates', 'autoInsuranceApplication.dpd')
  end
  
  def self.test_connection
    @connection ||= Docusign::Base.login(
      :integrators_key => Docusign::Config[:integrators_key],
      :email           => Docusign::Config[:email],
      :password        => Docusign::Config[:password],
      :endpoint_url    => Docusign::Config[:default_endpoint_url],
      :wiredump_dev    => Docusign::Config[:debug] ? STDOUT : nil
    )
  end
end