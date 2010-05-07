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
    $ini_array = parse_ini_file("Credentials.ini");
    $username = $ini_array["APIUserEmail"];
    $password = $ini_array["Password"];
    $IntegratorsKey = $ini_array["IntegratorsKey"];
    $APIAccountId = $ini_array["APIAccountId"];
    $APIUrl = $ini_array["APIUrl"];
    
    $envelopeId = $_POST["envelopeId"];
    
    include("Envelope.php");
    $client = new SoapClient("https://demo.docusign.net/API/3.0/Credential.asmx?WSDL");
    $arr = array("Email" => $username, "Password" => $password);
    $response = $client->Login($arr);
    
    $AccountID = $APIAccountId;//$response->LoginResult->Accounts->Account[0]->AccountID;
    $UserID = "[".$IntegratorsKey."]".$response->LoginResult->Accounts->Account[0]->UserID;
    $UserName = $response->LoginResult->Accounts->Account[0]->UserName;
    $Email = $response->LoginResult->Accounts->Account[0]->Email;
    $AccountName = $response->LoginResult->Accounts->Account[0]->AccountName;
    
    $config = array("userId" =>$UserID, "password" => $password, "accountId" => $AccountID, "subject" => "Loan Application", "blurb" => "Sign the Loan application to submit.");
    $envelope = new Docusign_Envelope($APIUrl."?wsdl", $config);
    $envelope->AccountId = $config['accountId'];
    $envelope->Subject = $config['subject'];
    $envelope->EmailBlurb = $config['blurb'];
    
    $RequestPDFParam = array();
    $RequestPDFParam["EnvelopeID"] = $envelopeId;
    
    $EnvelopePDF = $envelope->RequestPDF($RequestPDFParam);
    $PDFBytes = $EnvelopePDF->RequestPDFResult->PDFBytes;
    header("Content-type:application/pdf");
    echo($PDFBytes);
?>