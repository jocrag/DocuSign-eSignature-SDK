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
include_once 'WSSESoap.php';
include_once 'WSASoap.php';

class Docusign_Client extends SoapClient 
{
    private $_username;
    private $_password;

    
    public function setCredentials($username, $password)
    {
        $this->_username = $username;
        $this->_password = $password;
    }

    function __doRequest($request, $location, $saction, $version) 
    {
        $dom = new DOMDocument('1.0');
        $dom->loadXML($request);
        // $dom->loadXML(file_get_contents($_SERVER['DOCUMENT_ROOT'] . '/tmp/test.trace.xml'));
        $objWSA = new WSASoap($dom);
        $objWSA->addAction($saction);
        $objWSA->addTo($location);
        $objWSA->addMessageID();
        $objWSA->addReplyTo();

        $dom = $objWSA->getDoc();

        $objWSSE = new WSSESoap($dom);
        if (isset($this->_username) && isset($this->_password)) {
            $objWSSE->addUserToken($this->_username, $this->_password);
        }
        /* Sign all headers to include signing the WS-Addressing headers */
        $objWSSE->signAllHeaders = TRUE;

        $objWSSE->addTimestamp(300);

        /* create new XMLSec Key using RSA SHA-1 and type is private key */
        // $objKey = new XMLSecurityKey(XMLSecurityKey::RSA_SHA1, array('type'=>'private'));

        /* load the private key from file - last arg is bool if key in file (TRUE) or is string (FALSE) */
        // $objKey->loadKey(PRIVATE_KEY, TRUE);

        /* Sign the message - also signs appropraite WS-Security items */
        // $objWSSE->signSoapDoc($objKey);

        /* Add certificate (BinarySecurityToken) to the message and attach pointer to Signature */
        // $token = $objWSSE->addBinaryToken(file_get_contents(CERT_FILE));
        // $objWSSE->attachTokentoSig($token);

        $request = $objWSSE->saveXML();
        // $objWSSE->save('./tmp/request.xml');
        return parent::__doRequest($request, $location, $saction, $version);
   }
}