Factory.define(:insurance_application, :default_strategy => :build) do |a|
  a.first_name         'first'
  a.last_name          'last'
  a.make               'Cadillac'
  a.model              'Seville'
  a.vin                '12345'
  a.completion_option  'send'
  a.signer_email       'foobar@baz.com'
  a.cc_email           'barbaz@qux.com'
end