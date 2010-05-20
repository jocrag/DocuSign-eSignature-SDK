# Be sure to restart your server when you modify this file.

# Your secret key for verifying cookie session data integrity.
# If you change this key, all old sessions will become invalid!
# Make sure the secret is at least 30 characters and all random, 
# no regular words or you'll be exposed to dictionary attacks.
ActionController::Base.session = {
  :key         => '_insurance_co_session',
  :secret      => '5483c08c2b2ee50b805ea3adf8ca5291e45a9d23f18bf5f41fc748dcceb8fd5eec13ad93faa85bad48dfa6d1f8b5f8cf3d5f1085864c7cd53610a02e4ab10c30'
}

# Use the database for sessions instead of the cookie-based default,
# which shouldn't be used to store highly confidential information
# (create the session table with "rake db:sessions:create")
# ActionController::Base.session_store = :active_record_store
