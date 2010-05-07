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
    AddToLog("Get SampleDoc");
    
    
    session_start();
    $First_Name = $_POST["FirstName"];
    $Last_Name = $_POST["LastName"];
    $Address1 = $_POST["AddressLine1"];
    $Address2 = $_POST["AddressLine2"];
    $City = $_POST["City"];
    $State = $_POST["State"];
    $ZIP = $_POST["Zip"];
    $Phone = $_POST["HomePhone"];
    $email = $_POST["eMail"];
    
    $_SESSION["FirstName"] = $First_Name;
    $_SESSION["LastName"] = $Last_Name;
    $_SESSION["AddressLine1"] = $Address1;
    $_SESSION["AddressLine2"] = $Address2;
    $_SESSION["City"] = $City;
    $_SESSION["State"] = $State;
    $_SESSION["Zip"] = $ZIP;
    $_SESSION["HomePhone"] = $Phone;
    $_SESSION["eMail"] = $email;
    
            
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
         
         $pageURL = str_replace("simpleSign.php", "",$pageURL); 
         
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
    $CreateAndSendEnvelopeParam["Envelope"]["Documents"]["Document"]["Name"] = "Sample PDF";    
    $fail = file_get_contents("SampleDoc.pdf");
    $CreateAndSendEnvelopeParam["Envelope"]["Documents"]["Document"]["PDFBytes"] = $fail;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["ID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["Email"] = $email;
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["UserName"] = $First_Name." ".$Last_Name;
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["RequireIDLookup"] = "";
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["Type"] = "Signer";
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["CaptiveInfo"]["ClientUserId"] = session_id();
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["SignatureInitials"] = $First_Name[0].$Last_Name[0];
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["SignatureName"] = $First_Name." ".$Last_Name;
    $CreateAndSendEnvelopeParam["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["FontStyle"] = "BradleyHandITC";
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["YPosition"] = "186";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["Type"] = "Custom";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["Name"] = "E-mail";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["TabLabel"] = "E-mail";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][0]["Value"] = $email;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["YPosition"] = "173";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["Type"] = "Custom";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["Name"] = "Phone";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["TabLabel"] = "Phone";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][1]["Value"] = $Phone;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["XPosition"] = "342";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["YPosition"] = "160";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["Type"] = "Custom";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["Name"] = "Zip";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["TabLabel"] = "Zip";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][2]["Value"] = $ZIP;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["XPosition"] = "255";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["YPosition"] = "160";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["Type"] = "Custom";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["Name"] = "State";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["TabLabel"] = "State";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][3]["Value"] = $State;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["YPosition"] = "160";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["Type"] = "Custom";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["Name"] = "City";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["TabLabel"] = "City";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][4]["Value"] = $City;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["YPosition"] = "147";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["Type"] = "Custom";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["Name"] = "AddressLine2";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["TabLabel"] = "AddressLine2";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][5]["Value"] = $Address2;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["YPosition"] = "134";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["Type"] = "Custom";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["Name"] = "AddressLine1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["TabLabel"] = "AddressLine1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][6]["Value"] = $Address1;
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][7]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][7]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][7]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][7]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][7]["YPosition"] = "118";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][7]["Type"] = "FullName";
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][8]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][8]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][8]["PageNumber"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][8]["XPosition"] = "373";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][8]["YPosition"] = "185";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][8]["Type"] = "SignHere";
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][9]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][9]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][9]["PageNumber"] = "2";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][9]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][9]["YPosition"] = "532";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][9]["Type"] = "DateSigned";
    
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][10]["DocumentID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][10]["RecipientID"] = "1";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][10]["PageNumber"] = "2";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][10]["XPosition"] = "190";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][10]["YPosition"] = "465";
    $CreateAndSendEnvelopeParam["Envelope"]["Tabs"]["Tab"][10]["Type"] = "InitialHereOptional";
    
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
        $RequestRecipientTokenparam["Username"] = $First_Name." ".$Last_Name;;
        $RequestRecipientTokenparam["Email"] = $email;
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