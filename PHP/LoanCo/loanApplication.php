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
     include("log.php");
    AddToLog("Get Loan - ".$_POST["LoanPdf"]);
 
    session_start();
    $Amount = $_POST["Amount"];
    $LoanPdf = $_POST["LoanPdf"];
    $FullName = $_POST["FullName"];
    $EMail = $_POST["EMail"];
    $Phone = $_POST["Phone"];
    
    $_SESSION["Amount"] = $Amount;
    $_SESSION["HomePhone"] = $Phone;
    $_SESSION["eMail"] = $EMail;
    
    $ini_array = parse_ini_file("Credentials.ini");
    $username = $ini_array["APIUserEmail"];
    $password = $ini_array["Password"];
    $IntegratorsKey = $ini_array["IntegratorsKey"];
    $APIAccountId = $ini_array["APIAccountId"];
    $APIUrl = $ini_array["APIUrl"];
    
    
    function curPageURL() {
         $pageURL = 'http';
         //if ($_SERVER["HTTPS"] == "on") {$pageURL .= "s";}
         $pageURL .= "://";
         if ($_SERVER["SERVER_PORT"] != "80") {
          $pageURL .= $_SERVER["SERVER_NAME"].":".$_SERVER["SERVER_PORT"].$_SERVER["REQUEST_URI"];
         } else {
          $pageURL .= $_SERVER["SERVER_NAME"].$_SERVER["REQUEST_URI"];
         }
         
         $pageURL = str_replace("loanApplication.php", "",$pageURL); 
         
         return $pageURL;  
        }
    
    
    function current_millis() {
              list($usec, $sec) = explode(" ", microtime());
              return round(((float)$usec + (float)$sec) * 1000);
          }    
    
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
        
        $CreateAndSendEnvelopeParam = array();
        $CreateAndSendEnvelopeParam["Envelope"]["AccountId"] = $AccountID;
        
        $CreateAndSendEnvelopeParam["Envelope"]["Documents"]["Document"]["ID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Documents"]["Document"]["Name"] = $LoanPdf;    
        $fail = file_get_contents($LoanPdf.".pdf");
        $CreateAndSendEnvelopeParam["Envelope"]["Documents"]["Document"]["PDFBytes"] = $fail;
        
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["ID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["Email"] = $EMail;
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["UserName"] = $FullName;
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["RequireIDLookup"] = "";
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["Type"] = "Signer";
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["CaptiveInfo"]["ClientUserId"] = session_id();
        $i = strpos($FullName," ");
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["SignatureInitials"] = $FullName[0].$FullName[$i+1];
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["SignatureName"] = $FullName;
        $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["FontStyle"] = "BradleyHandITC";
        
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["DocumentID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["RecipientID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["PageNumber"] = "1";        
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["Type"] = "Custom";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["Name"] = "E-mail";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["TabLabel"] = "E-mail";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["Value"] = $EMail;
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["AnchorTabItem"]["AnchorTabString"] = "E-mail:";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["AnchorTabItem"]["XOffset"] = "200";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["AnchorTabItem"]["YOffset"] = "-2";
        
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["DocumentID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["RecipientID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["PageNumber"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["Type"] = "Custom";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["Name"] = "Phone";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["TabLabel"] = "Phone";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["Value"] = $Phone;
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["AnchorTabItem"]["AnchorTabString"] = "Phone:";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["AnchorTabItem"]["XOffset"] = "200";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["AnchorTabItem"]["YOffset"] = "-2";
        
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["DocumentID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["RecipientID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["PageNumber"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["Type"] = "FullName";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["AnchorTabItem"]["AnchorTabString"] = "Name:";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["AnchorTabItem"]["XOffset"] = "200";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["AnchorTabItem"]["YOffset"] = "-2";
        
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["DocumentID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["RecipientID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["PageNumber"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["Type"] = "Custom";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["Name"] = "Amount:";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["TabLabel"] = "Amount:";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["Value"] = $Amount;
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["AnchorTabItem"]["AnchorTabString"] = "Amount:";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["AnchorTabItem"]["XOffset"] = "200";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["AnchorTabItem"]["YOffset"] = "-2";
        
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["DocumentID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["RecipientID"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["PageNumber"] = "1";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["Type"] = "SignHere";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["AnchorTabItem"]["AnchorTabString"] = "X:";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["AnchorTabItem"]["XOffset"] = "30";
        $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["AnchorTabItem"]["YOffset"] = "8";
        
        $CreateAndSendEnvelopeParam["Envelope"]["EnvelopeIdStamping"] = "true";
        $CreateAndSendEnvelopeParam["Envelope"]["Subject"] = "Loan Application";
        $CreateAndSendEnvelopeParam["Envelope"]["EmailBlurb"] = "Sign the Loan application to submit.";
        
        //print_r($CreateAndSendEnvelopeParam);
        
        $Envelopes = $envelope->CreateAndSendEnvelope($CreateAndSendEnvelopeParam);
        $envelopeId = $Envelopes->CreateAndSendEnvelopeResult->EnvelopeID;
        
        $_SESSION["envelopeId"] = $envelopeId;
        //print_r($envelopeId);
        
        $RequestRecipientTokenparam = array();
        $RequestRecipientTokenparam["EnvelopeID"] = $envelopeId;
        $RequestRecipientTokenparam["ClientUserID"] = session_id();
        $RequestRecipientTokenparam["Username"] = $FullName;
        $RequestRecipientTokenparam["Email"] = $EMail;
        $RequestRecipientTokenparam["AuthenticationAssertion"]["AssertionID"] = current_millis();
        $m = date("m");
        $d = date("Y")."-".$m."-".date("d")."T00:00:00.00";
        $RequestRecipientTokenparam["AuthenticationAssertion"]["AuthenticationInstant"] = $d;
        $RequestRecipientTokenparam["AuthenticationAssertion"]["AuthenticationMethod"] = "Password";
        $RequestRecipientTokenparam["AuthenticationAssertion"]["SecurityDomain"] = $_SERVER['HTTP_HOST'];
        $RequestRecipientTokenparam["ClientURLs"]["OnViewingComplete"] = curPageURL()."signingReturn.php?id=2";
        $RequestRecipientTokenparam["ClientURLs"]["OnCancel"] = curPageURL()."signingReturn.php?id=3";
        $RequestRecipientTokenparam["ClientURLs"]["OnDecline"] = curPageURL()."signingReturn.php?id=4";
        $RequestRecipientTokenparam["ClientURLs"]["OnSessionTimeout"] = curPageURL()."signingReturn.php?id=5";
        $RequestRecipientTokenparam["ClientURLs"]["OnTTLExpired"] = curPageURL()."signingReturn.php?id=6";
        $RequestRecipientTokenparam["ClientURLs"]["OnException"] = curPageURL()."signingReturn.php?id=7";
        $RequestRecipientTokenparam["ClientURLs"]["OnAccessCodeFailed"] = curPageURL()."signingReturn.php?id=8";
        $RequestRecipientTokenparam["ClientURLs"]["OnSigningComplete"] = curPageURL()."signingReturn.php?id=9";
        $RequestRecipientTokenparam["ClientURLs"]["OnIdCheckFailed"] = curPageURL()."signingReturn.php?id=1";
        
        $Env = $envelope->RequestRecipientToken($RequestRecipientTokenparam);
        $URL = $Env->RequestRecipientTokenResult;
        $url1 = "DocuSign.php?url=".$URL;
        header( 'Location: '.$url1 ) ;
?>