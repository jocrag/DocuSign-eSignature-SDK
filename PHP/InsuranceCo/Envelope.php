<?php
/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */
include('StringEncrypt.php');
include('Client.php');

class Docusign_Envelope
{    
    protected $_docusignClient;
    protected $_config = array();
    protected $_endpoint;

    protected $_envelopeId;
    protected $_isEmbedded;

    protected $_tempateData;
    
    protected $_envelopeParams = array();
    protected $_preparedEnvelopeParams = array();
    protected $_recipientTokenParams = array();
    protected $_preparedRecipientTokenParams = array();

    protected $_callbackUrls = array();
    protected $_allowedCallbackUrlProperties = array(
        'OnSigningComplete',
        'OnViewingComplete',
        'OnCancel',
        'OnDecline',
        'OnSessionTimeout',
        'OnTTLExpired',
        'OnException',
        'OnAccessCodeFailed',
        'OnIdCheckFailed',
        );

    protected $_authAssertions = array();
    protected $_allowedAuthAssertionProperties = array(
        'AssertionID',
        'AuthenticationInstant',
        'AuthenticationMethod',
        'SecurityDomain',
        );

    protected $_allowedEnvelopeProperties = array(
        'AccountId',
        'Subject',
        'EmailBlurb',
        'SigningLocation',
        );

    protected $_recipients = array();
    protected $_recipientRoles = array();
    protected $_documents = array();
    protected $_tabs = array();

    
    public function __construct($endpoint, array $config)
    {
        $this->_endpoint = $endpoint;
        $this->_config = $config;
        $this->_connectToApi();
    }
    

    /**
     * This will setup a default MVC like callback URL structure base on the passed domain name
     */
    public function setupDefaultCallbackUrls($domain = null, $basePath = null, $controller = null, $useSsl = true)
    {
        $domain = (null === $domain) ? (isset($_SERVER['HTTP_HOST']) ? $_SERVER['HTTP_HOST'] : $domain) : $domain;
        $controller = (null === $controller) ? 'ds-signing' : $controller;
        $basePath = (null !== $basePath) ? ltrim($basePath, '/') .'/' : '';
        $callbackUrl = "{$basePath}{$controller}";
        
        $urls = array();
        foreach ($this->_allowedCallbackUrlProperties as $callbackName) {
            $callback = substr($callbackName, 2);    // remove 'On'
            $urls[$callbackName] = ($useSsl ? 'https://' : 'http://') . "{$domain}/{$callbackUrl}/$callback";
        }
        $this->_callbackUrls = $urls;
    }
        
    public function setEnvelopeId($id) 
    {
        $this->_envelopeId = $id;
    }
    
    public function getCreateAndSendEnvelopeParams()
    {
        $this->_prepareEnvelopeParams();
        return $this->_preparedEnvelopeParams;
    }
    
    public function getCreateEnvelopeFromTemplatesParams()
    {
        // $this->_prepareEnvelopeParams();
        // $this->_preparedEnvelopeParams['TemplateReferences']['TemplateReference']['TemplateLocation'] = 'SOAP';
        // $this->_preparedEnvelopeParams['TemplateReferences']['TemplateReference']['Template'] = new SoapVar('<ns1:Template><![CDATA[' . $this->_tempateData . ']]></ns1:Template>', XSD_ANYXML);
        $this->_preparedEnvelopeParams['TemplateReferences']['TemplateReference']['Template'] = new SoapVar($this->_tempateData, XSD_STRING);

        // $this->_preparedEnvelopeParams['TemplateReferences']['TemplateReference']['Template'] = $this->_tempateData;
        
        $this->_preparedEnvelopeParams['ActivateEnvelope'] = true;
        $this->_preparedEnvelopeParams['EnvelopeInformation'] = $this->_envelopeParams;
        // Zend_Debug::dump($this->_recipients);
        // Zend_Debug::dump($this->_recipientRoles);
        // die;
        if (!empty($this->_recipients)) {
            $this->_preparedEnvelopeParams['Recipients'] = $this->_recipients;
        }
        if (!empty($this->_recipientRoles)) {
            $this->_preparedEnvelopeParams['TemplateReferences']['TemplateReference']['RoleAssignments'] = $this->_getRoleAssigments();
        }
        return $this->_preparedEnvelopeParams;
    }

    public function getRequestRecipientTokenParams()
    {
        $this->_prepareRecipientTokenParams();
        return $this->_preparedRecipientTokenParams;
    }
    
    /**
     * Set simple string Envelope parameters
     */
    public function __set($name, $value) 
    {
        $isEnvelopeProperty = in_array($name, $this->_allowedEnvelopeProperties);
        $isCallbackUrlProperty = in_array($name, $this->_allowedCallbackUrlProperties);
        $isAuthAssertionsProperty = in_array($name, $this->_allowedAuthAssertionProperties);
        
        if (false === $isEnvelopeProperty 
            && false === $isCallbackUrlProperty
            && false === $isAuthAssertionsProperty) 
        {
            throw new Exception($name . ' is not a valid Envelope, CallbackUrl, or AuthAssertions property.');
        }
        
        if ($isEnvelopeProperty) {
            $this->_envelopeParams[$name] = $value;
        } elseif ($isCallbackUrlProperty) {
            $this->_callbackUrls[$name] = $value;
        } elseif ($isAuthAssertionsProperty) {
            $this->_authAssertions[$name] = $value;
        }
    }
    
    public function addTemplate($data)
    {
        $this->_tempateData = $data;
    }
    
    public function addRecipient($name, $email, $role = null, $captiveInfo = array())
    {
        $recipient = array();
        $recipient['ID'] = count($this->_recipients) + 1;
        $recipient['UserName'] = $name;
        $recipient['Email'] = strToLower($email);        // DocuSign does not liked mixed case domain names
        $recipient['Type'] = 'Signer';                // TODO use contstants for different types
        $recipient['RequireIDLookup'] = false;
        $recipient['CaptiveInfo']['ClientUserId'] = session_id();

        // The captiveInfo is used if you're embedding the application
        if (!empty($captiveInfo)) {
            $recipient['CaptiveInfo'] = $captiveInfo;
        }

        array_push($this->_recipients, $recipient);
        
        // Store the Ids of the roles to recipients
        if ($role) {
            $this->_recipientRoles[$role] = $recipient['ID'];
        }
    }

    public function addDocument($name, $filePath)
    {
        $cnt = count($this->_documents);
        $this->_documents[$cnt]['ID'] = $cnt + 1;
        $this->_documents[$cnt]['Name'] = $name;
        $this->_documents[$cnt]['PDFBytes'] = new SoapVar($this->_encodeFileToBase64String($filePath), XSD_STRING);
    }
    
    public function __call($name, array $arguments)
    {
        switch ($name) {
            case 'CreateAndSendEnvelope':
                $this->_isEmbedded = false;
                break;
            case 'RequestRecipientToken':
                $this->_isEmbedded = true;
                break;
            default: 
                break;
        }
        
        return $this->_docusignClientCallMethod($name, $arguments[0]);
    }
    
    protected function _getRoleAssigments()
    {
        $roleAssigments = array();
        foreach($this->_recipientRoles as $roleName => $recipientId) {
            $recipientRoles = array();
            $recipientRoles['RoleName'] = $roleName;
            $recipientRoles['RecipientID'] = $recipientId;
            $roleAssigments[] = $recipientRoles;
        }
        return $roleAssigments;
    }
    
    protected function _prepareEnvelopeParams()
    {
        $this->_envelopeParams['Recipients'] = $this->_recipients;
        if ($this->_documents) {
            $this->_envelopeParams['Documents'] = $this->_documents;
        }
        
        // Put the parameters in an Envelope complex type
        $this->_preparedEnvelopeParams['Envelope'] = $this->_envelopeParams;
    }
    
    protected function _prepareRecipientTokenParams()
    {
        // Check that all callback URLs were setup
        if (count($this->_allowedCallbackUrlProperties) != count($this->_callbackUrls)) {
            throw new Exception('You must set all ClientURLs ' . join($this->_allowedCallbackUrlProperties, ', '));
        }
        
        $this->_preparedRecipientTokenParams =
            array(
                'EnvelopeID' => $this->_envelopeId,
                'Username' => $this->_recipients[0]['UserName'],
                'Email' => $this->_recipients[0]['Email'],
                'ClientUserID' => $this->_recipients[0]['CaptiveInfo']['ClientUserId'],
                'AuthenticationAssertion' => $this->_authAssertions,
                'ClientURLs' => $this->_callbackUrls,
                );
    }
    
    protected function _docusignClientCallMethod($methodName, array $params, $debug = true)
    {
        $this->_connectToApi();
    
        $response = $this->_docusignClient
                            ->__soapCall($methodName, array('parameters' => $params));
        //print_r($response);
        return $response;
    }
    
    protected function _setDefaults()
    {
        
    }

    protected function _connectToApi()
    {
        if ($this->_docusignClient instanceof SoapClient) {
            return;
        }
        $debug = false;
        $stringEncrypt = new StringEncrypt();
        $options = (true === $debug) ? array('trace' => TRUE,'exceptions' => true) : array();
        $this->_docusignClient = new Docusign_Client($this->_endpoint, $options);
        $this->_docusignClient->setCredentials($this->_config['userId'], $this->_config['password']);
    }
    
    /**
     * Takes a file path and returns base64 encoded string
     */
    private function _encodeFileToBase64String($filePath)
    {
        $string = file_get_contents($filePath);
        return base64_encode($string);
    }
}