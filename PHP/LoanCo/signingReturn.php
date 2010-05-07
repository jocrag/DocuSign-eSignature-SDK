<?php
    session_start();
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <title>Signing Status - DocuSign, Inc. ESIGN Sample</title>
  </head>
  <body>
    <form id="form1" method="post"  action="viewPDF.php">
      <input name="envelopeId" type="hidden" value="<?php echo($_SESSION["envelopeId"])?>" />
      <div style="margin: 10px; font-size: 10pt;">
        The integrated signing has returned to the LoanCo.com.
        <br />
        
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
    
    $envelopeId = $_SESSION["envelopeId"];
    
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
    
    $RequestStatus = array();
    $RequestStatus["EnvelopeID"] = $envelopeId;
    
    $EnvelopeDate = $envelope->RequestStatus($RequestStatus);    
    //$PDFBytes = $EnvelopePDF->RequestPDFResult->PDFBytes;
    //header("Content-type:application/pdf");
    //echo($PDFBytes);

                                    
                                        $id = $_GET["id"];
                                        $msg = "";
                                        if ($id==1) $msg = "The ID Check has failed.  The user was denied an opportunity to view or sign the document.";
                                        if ($id==2) $msg = "The user has viewed the document without signing it.";
                                        if ($id==3) $msg = "The user has cancelled out of the signing experience.";
                                        if ($id==4) $msg = "The user has declined to sign the document.";
                                        if ($id==5) $msg = "The user did not sign the document in time.  The timeout is set to 20 minutes.";
                                        if ($id==6) $msg = "Trusted connection has experied.  The server communication might be a problem.";
                                        if ($id==7) $msg = "An exception has occurred on the server.  Please check the parameters passed to the Web Service Methods.";
                                        if ($id==8) $msg = "The access code verification has failed.  The user was denied an opportunity to view or sign the document.";
                                        if ($id==9) $msg = "The user has completed the signing.  The legally binding document with signatures is stored on the DocuSign, Inc. server.";                                    
                                        echo($msg);
                                        
                                        include("log.php");
                                        AddToLog($msg);
                                    ?>
        <br/>
        <br/>
        <span>Completed Information</span>
        <br/>
        <?php if (count($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus)>5) {  ?>
        AddressLine1: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[1]->TabValue); ?><br/>
        AddressLine2: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[2]->TabValue); ?><br/>
        City: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[3]->TabValue); ?><br/>
        State: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[4]->TabValue); ?><br/>
        Zip: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[5]->TabValue); ?><br/>
        Phone: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[6]->TabValue); ?><br/>
        E-mail: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[8]->TabValue); ?><br/>
        <?php } ?>
        <?php if (count($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus)<=5) {  ?>
        Name: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[0]->TabValue); ?><br/>
        Phone: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[1]->TabValue); ?><br/>
        E-mail: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[2]->TabValue); ?><br/>
        Amount: <?php  echo($EnvelopeDate->RequestStatusResult->RecipientStatuses->RecipientStatus->TabStatuses->TabStatus[3]->TabValue); ?><br/>
        <?php } ?>
        <br/>
        <input name="submit" type="submit" value="Download Pdf" />
      </div>
    </form>
  </body>
</html>
<?php
    
    unset($_SESSION["AddressLine1"]);
    unset($_SESSION["AddressLine2"]);
    unset($_SESSION["City"]);
    unset($_SESSION["State"]);
    unset($_SESSION["Zip"]);
    unset($_SESSION["HomePhone"]);
    unset($_SESSION["eMail"]);
    unset($_SESSION["Amount"]);
?>