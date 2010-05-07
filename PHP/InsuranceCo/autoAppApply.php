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
     include("Envelope.php");
    session_start();
    include("log.php");
    $ini_array = parse_ini_file("Credentials.ini");    
    $APIUrl = $ini_array["APIUrl"];
    if (!isset($_SESSION["OPENED_SITE"])) AddToLog("Open site");

    $_SESSION["OPENED_SITE"] = "1";
    
    function curPageURL() {
         $pageURL = 'http';
         //if ($_SERVER["HTTPS"] == "on") {$pageURL .= "s";}
         $pageURL .= "://";
         if ($_SERVER["SERVER_PORT"] != "80") {
          $pageURL .= $_SERVER["SERVER_NAME"].":".$_SERVER["SERVER_PORT"].$_SERVER["REQUEST_URI"];
         } else {
          $pageURL .= $_SERVER["SERVER_NAME"].$_SERVER["REQUEST_URI"];
         }
         
         $pageURL = str_replace("autoAppApply.php", "",$pageURL); 
         
         return $pageURL;  
        }
    
    if ($_SESSION["DS_LOGED"]) {
        if($_SESSION["DS_LOGED"]=="1") {
            
        } else {header( 'Location: login.php' ) ; }
    } else {header( 'Location: login.php' ) ; }
    
    
        if (isset($_POST["Submit"]) && isset($_POST["emailDestination"])) 
    if ( !( (isset($_POST["lastName"])) && (($_POST["firstName"]=="") || ($_POST["lastName"]=="") || ($_POST["carMake"]=="") || ($_POST["carModel"]=="") || ($_POST["carVIN"]=="") || ($_POST["emailDestination"]=="")) )) {
        
        $config = array("userId" => $_SESSION["UserID"], "password" => $_SESSION["password"], "accountId" => $_SESSION["AccountID"], "subject" => "Automobile Insurance Application", "blurb" => "Please review and complete this auto-mobile insurance application.");
        $envelope = new Docusign_Envelope($APIUrl."?wsdl", $config);
        $envelope->AccountId = $config['accountId'];
        $envelope->Subject = $config['subject'];
        $envelope->EmailBlurb = $config['blurb'];
        
        $URL = curPageURL()."autoAppStatus.php";
        
        if ((!isset($_POST["embeddedSending"])) or (isset($_POST["embeddedSigning"]))) {
            
        AddToLog($_SESSION["email"]." Complete Application");    
        $RequestTemplateParams = array();
        
        
        function object_to_array($object)
            {
              if(is_array($object) || is_object($object))
              {
                $array = array();
                foreach($object as $key => $value)
                {
                  $array[$key] = object_to_array($value);
                }
                return $array;
              }
              return $object;
            }
            
        $RequestTemplateParams = array();
        $RequestTemplateParams["TemplateID"] = $_SESSION["TEMPLATE_ID"];
        $RequestTemplateParams["IncludeDocumentBytes"] = "false";
        try {
        $Envelopes = $envelope->RequestTemplate($RequestTemplateParams);
        } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    window.location = "autoAppApply.php";
                </script>
                
            <?php
            die(1);
        }
        $arrTemplEnvelopes = object_to_array($Envelopes);
        
        $arrEnvelope["Envelope"] = $arrTemplEnvelopes["RequestTemplateResult"]["Envelope"];
        
        $arrEnvelope["Envelope"]["Recipients"]["Recipient"]["UserName"] = $_POST["firstName"]." ".$_POST["lastName"];
        $arrEnvelope["Envelope"]["Recipients"]["Recipient"]["Email"] = $_POST["emailDestination"];
        //$arrEnvelope["Envelope"]["Recipients"]["Recipient"]["RequireIDLookup"] ="false";    
        if (isset($_POST['idCheck'])) {
                    $arrEnvelope["Envelope"]["Recipients"]["Recipient"]["RequireIDLookup"] ="true";         
            }
        if (isset($_POST['accessCode'])) {
                    $arrEnvelope["Envelope"]["Recipients"]["Recipient"]["AccessCode"] = $_POST["accessCode"];         
            }
        if (isset($_POST["embeddedSigning"])) {
            $arrEnvelope["Envelope"]["Recipients"]["Recipient"]["CaptiveInfo"]['ClientUserId'] = session_id();
        }
        $arrEnvelope["Envelope"]["Subject"] = "Automobile Insurance Application";
        $arrEnvelope["Envelope"]["EmailBlurb"] = "Please review and complete this auto-mobile insurance application.";
        $arrEnvelope["Envelope"]["Online"] = "Online";
        
        $arrEnvelope["Envelope"]["Tabs"]["Tab"][0]["Value"] = $_POST["carMake"];
        $arrEnvelope["Envelope"]["Tabs"]["Tab"][1]["Value"] = $_POST["carModel"];
        $arrEnvelope["Envelope"]["Tabs"]["Tab"][2]["Value"] = $_POST["carVIN"];
        
        //print_r($arrEnvelope);
        try {
        $Envelopes = $envelope->CreateAndSendEnvelope($arrEnvelope);
        } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    //window.location = "autoAppApply.php";
                </script>
                
            <?php
            die(1);
        }
        $envelopeId = $Envelopes->CreateAndSendEnvelopeResult->EnvelopeID;
        
        
        
        
        
        if (isset($_POST["embeddedSigning"])) {
            
            function current_millis() {
              list($usec, $sec) = explode(" ", microtime());
              return round(((float)$usec + (float)$sec) * 1000);
          }                  
        $RequestRecipientTokenparam = array();
        $RequestRecipientTokenparam["EnvelopeID"] = $envelopeId;
        $RequestRecipientTokenparam["ClientUserID"] = session_id();
        $RequestRecipientTokenparam["Username"] = $_POST["firstName"]." ".$_POST["lastName"];
        $RequestRecipientTokenparam["Email"] = $_POST["emailDestination"];
        $RequestRecipientTokenparam["AuthenticationAssertion"]["AssertionID"] = current_millis();
        $m = date("m");
        $d = date("Y")."-".$m."-".date("d")."T00:00:00.00";
        $RequestRecipientTokenparam["AuthenticationAssertion"]["AuthenticationInstant"] = $d;
        $RequestRecipientTokenparam["AuthenticationAssertion"]["AuthenticationMethod"] = "Password";
        $RequestRecipientTokenparam["AuthenticationAssertion"]["SecurityDomain"] = $_SERVER['HTTP_HOST'];
        $RequestRecipientTokenparam["ClientURLs"]["OnViewingComplete"] = curPageURL()."complete.php?id=2";
        $RequestRecipientTokenparam["ClientURLs"]["OnCancel"] = curPageURL()."complete.php?id=3";
        $RequestRecipientTokenparam["ClientURLs"]["OnDecline"] = curPageURL()."complete.php?id=4";
        $RequestRecipientTokenparam["ClientURLs"]["OnSessionTimeout"] = curPageURL()."complete.php?id=5";
        $RequestRecipientTokenparam["ClientURLs"]["OnTTLExpired"] = curPageURL()."complete.php?id=6";
        $RequestRecipientTokenparam["ClientURLs"]["OnException"] = curPageURL()."complete.php?id=7";
        $RequestRecipientTokenparam["ClientURLs"]["OnAccessCodeFailed"] = curPageURL()."complete.php?id=8";
        $RequestRecipientTokenparam["ClientURLs"]["OnSigningComplete"] = curPageURL()."complete.php?id=9";
        $RequestRecipientTokenparam["ClientURLs"]["OnIdCheckFailed"] = curPageURL()."complete.php?id=1";
        
        try {
        $Env = $envelope->RequestRecipientToken($RequestRecipientTokenparam);
        } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    window.location = "autoAppApply.php";
                </script>
                
            <?php
            die(1);
        }
        $URL = $Env->RequestRecipientTokenResult;
        
        }}
            else {
            
        AddToLog($_SESSION["email"]." Customize Insurance Application");
        $RequestTemplateParams = array();
        $RequestTemplateParams["Envelope"]["AccountId"] = $_SESSION["AccountID"];
        $RequestTemplateParams["Envelope"]["Subject"] = "Automobile Insurance Application";
        $RequestTemplateParams["Envelope"]["EmailBlurb"] = "Please review and complete this auto-mobile insurance application.";
        $RequestTemplateParams["Envelope"]["Documents"]["Document"]["ID"] = "1";
        $RequestTemplateParams["Envelope"]["Documents"]["Document"]["FileExtension"] = "pdf";
        $RequestTemplateParams["Envelope"]["Documents"]["Document"]["Name"] = "Manual Insurance Document";
        
        
        $fail = file_get_contents("customInsuranceApplication.pdf");
        
        $RequestTemplateParams["Envelope"]["Documents"]["Document"]["PDFBytes"] = $fail;
        
        if ($_POST["emailDestinationCC"]!="") {
            
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["ID"] = "1";
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["Email"] = $_POST["emailDestination"];                        
            
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["UserName"] = $_POST["firstName"]." ".$_POST["lastName"];
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["RequireIDLookup"] = "0";
            
            if (isset($_POST['idCheck'])) {
                    $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["RequireIDLookup"] ="true";         
            }
            if (isset($_POST['accessCode'])) {
                    $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["AccessCode"] = $_POST["accessCode"];         
            }
            
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["Type"] = "Signer";
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["SignatureInfo"]["SignatureInitials"] = "YG";
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["SignatureInfo"]["FontStyle"] = "BradleyHandITC";
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][0]["SignatureInfo"]["SignatureName"] = substr($_POST["firstName"],0,1)." ".substr($_POST["lastName"],0,1);
            
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][1]["ID"] = "2";
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][1]["RequireIDLookup"] = "0";
            
            /*if (isset($_POST['idCheck'])) {
                    $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][1]["RequireIDLookup"] ="true";         
            }
            if (isset($_POST['accessCode'])) {
                    $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][1]["AccessCode"] = $_POST["accessCode"];         
            }*/
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][1]["Email"] = $_POST["emailDestinationCC"];;
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][1]["UserName"] = "Any Signer";
            $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"][1]["Type"] = "CarbonCopy";    

            
            
        } else {
        
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["ID"] = "1";
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["Email"] = $_POST["emailDestination"];        
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["UserName"] = $_POST["firstName"]." ".$_POST["lastName"];
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["RequireIDLookup"] = "0";
        
        if (isset($_POST['idCheck'])) {
                $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["RequireIDLookup"]="true";         
        }
        if (isset($_POST['accessCode'])) {
                $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["AccessCode"] = $_POST["accessCode"];         
        }
        
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["Type"] = "Signer";
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["SignatureInitials"] = "YG";
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["FontStyle"] = "BradleyHandITC";
        $RequestTemplateParams["Envelope"]["Recipients"]["Recipient"]["SignatureInfo"]["SignatureName"] = substr($_POST["firstName"],0,1)." ".substr($_POST["lastName"],0,1);
        }
        
        
        
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["CustomTabRequired"] = "true";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["CustomTabWidth"] = "360";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["DocumentID"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["Name"] = "vehicleMake";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["PageNumber"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["RecipientID"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["TabLabel"] = "Make";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["Type"] = "Custom";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["XPosition"] = "210";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["YPosition"] = "115";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][0]["Value"] = $_POST["carMake"];;
        
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["CustomTabRequired"] = "true";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["CustomTabWidth"] = "360";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["DocumentID"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["Name"] = "vehicleModel";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["PageNumber"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["RecipientID"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["TabLabel"] = "Model";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["Type"] = "Custom";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["XPosition"] = "210";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["YPosition"] = "135";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][1]["Value"] = $_POST["carModel"];
        
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["CustomTabRequired"] = "true";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["CustomTabWidth"] = "360";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["DocumentID"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["Name"] = "vehicleVIN";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["PageNumber"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["RecipientID"] = "1";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["TabLabel"] = "VIN";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["Type"] = "Custom";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["XPosition"] = "210";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["YPosition"] = "155";
        $RequestTemplateParams["Envelope"]["Tabs"]["Tab"][2]["Value"] = $_POST["carVIN"];
        
        try {
        $Envelopes = $envelope->CreateEnvelope($RequestTemplateParams);
        } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    window.location = "autoAppApply.php";
                </script>
                
            <?php
            die(1);
        }
        $envelopeId = $Envelopes->CreateEnvelopeResult->EnvelopeID;
        //print_r($envelopeId);
        
        $RequestSenderTokenParam = array();
        $RequestSenderTokenParam["EnvelopeID"] = $envelopeId;
        $RequestSenderTokenParam["AccountID"] = $_SESSION["AccountID"];
        $RequestSenderTokenParam["ReturnURL"] = curPageURL()."autoAppStatus.php";
        
        try {
        $Env = $envelope->RequestSenderToken($RequestSenderTokenParam);
        } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    window.location = "autoAppApply.php";
                </script>
                
            <?php
            die(1);
        }
        
        $URL = $Env->RequestSenderTokenResult;
        
            }
        
        
        header( 'Location: '.$URL ) ;
    }
?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>

    
        <title>InsuranceCo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
        <script type="text/javascript" src="scripts/webservice-status.js"></script>
        <script type="text/javascript" src="scripts/util.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        
    </head><body>
        <div class="header" style=" background:url(images/fond.jpg); background-repeat:repeat-x; background-position:top">
            <div class="floatLeft">
                <img src="images/logo.png" alt="InsuranceCo - Insuring the security of your future">
            </div>
            <div class="userBox">
                <table cellspacing="0" border="0">

                    <tr style="border-bottom: 2px; solid #000000">
                        <td>Username:</td>
                        <td><?php echo($_SESSION["UserName"]) ?></td>
                        <td>Account:</td>
                        <td><?php echo($_SESSION["AccountName"]) ?></td>
                    </tr>
                    <tr>

                        <td colspan="4" align="right">
                            <img id="ws3_0_img" src="images/spinner.gif" /><span style="font-size: 0.75em;">(WS3_0 webservice)</span>
                            <img id="credential_img" src="images/spinner.gif" /><span style="font-size: 0.75em;">(Credential webservice)</span>
                            <a href="InsuranceCo.log" target="_blank"><img src="images/script.png" style="border: 0px;" /><span style="font-size: 0.75em;">View InsuranceCo Event Log</span></a>
                        </td>
                    </tr>
                </table>

            </div>
        </div>
    
        <div class="gutter"></div>
    
        <div class="sidebar">
            <h1>What we offer?</h1>
    
            <div id="navcontainer">
                <ul id="navlist">
                    <li><a href="index.php">Products</a></li>
                    <li><a href="home.php">My Account Home</a></li>
                    <li><a href="autoAppStatus.php">&nbsp;&nbsp;- Application Status</a></li>
                    <li><a href="logout.php">&nbsp;&nbsp;- Log Out</a></li>
                </ul>
            </div>
        </div>
        
        <div>
            <span class="col1">
                <h1>Automobile Insurance Application</h1>
                
                <span class="error">&nbsp;&nbsp;</span>
                <?php
                            $firstName = "";
                            $lastName = "";
                            $carMake = "";
                            $carModel = "";
                            $carVIN = "";
                            $emailDestination = "";
                            
                            if ( (isset($_POST["lastName"])) && (($_POST["firstName"]=="") || ($_POST["lastName"]=="") || ($_POST["carMake"]=="") || ($_POST["carModel"]=="") || ($_POST["carVIN"]=="") || ($_POST["emailDestination"]=="")) ) {
                            $firstName = $_POST["firstName"];
                            $lastName = $_POST["lastName"];
                            $carMake = $_POST["carMake"];
                            $carModel = $_POST["carModel"];
                            $carVIN = $_POST["carVIN"];
                            $emailDestination = $_POST["emailDestination"];
                            $emailDestinationCC = $_POST["emailDestinationCCS"];
                                                            
                        ?>
                        <p><strong style="color:#F00">Please fill in the missing fields.</strong></p>
                        <?php } ?>
                <form id="applicationForm" method="post" action="autoAppApply.php">
                    <fieldset>
                        <legend class="heading">Insured Motorist Details</legend>
    
                        <p>Please fill in all fields:</p>
                        
                        <label for="firstName">
                            <input name="firstName" value="<?php echo($firstName); ?>" tabindex="1" size="50" id="firstName" type="text">
                            First Name:                        </label>
                        <label for="lastName">
                            <input name="lastName" value="<?php echo($lastName); ?>" tabindex="2" size="50" id="lastName" type="text">
                            Last Name:                        </label>
                    </fieldset>
                    <br>
                    <fieldset>
                        <legend class="heading">Car Details</legend>
    
                        <p>Please fill in all fields:</p>
                        <label for="carMake">
                            <input name="carMake" value="<?php echo($carMake); ?>" tabindex="3" size="50" id="carMake" type="text">
                            Car Make:                        </label>
                        <label for="carModel">
                            <input name="carModel" value="<?php echo($carModel); ?>" tabindex="4" size="50" id="carModel" type="text">
                            Car Model:                        </label>
                        <label for="carVIN">
                            <input name="carVIN" value="<?php echo($carVIN); ?>" tabindex="5" size="50" id="carVIN" type="text">
                            Car VIN #:                        </label>
                        <div id="embeddedSigningFieldSection">
                            <label for="embeddedSigning">
                                <input type="checkbox" onClick="ShowHide()" name="embeddedSigning" tabindex="6" id="embeddedSigning" />
                                <span>Complete Application now? (Embedded Signing)</span>
                            </label>
                        </div>
                        <div id="embeddedSendingFieldSection">

                            <label for="embeddedSending">
                                <input type="checkbox" onClick="ShowHide1()" name="embeddedSending" tabindex="6" id="embeddedSending" />
                                <span>Customize Insurance Application? (Embedded Sending)</span>
                            </label>
                        </div>
                        <div id="emailDestinationFieldSection">
                            <label for="emailDestination">
                                <input name="emailDestination" value="<?php echo($emailDestination); ?>" tabindex="6" id="emailDestination" type="text">
                                <span>What email address should receive the application?</span>
                            </label>
                            <label for="emailDestinationCC">
                            <input type="text" name="emailDestinationCC" tabindex="6" id="emailDestinationCC" value="" />
                            <span>What is the email address of the carbon copied recipient?</span>
                        </label>
                        </div>
                        
                    </fieldset>
                    <br />
                    <fieldset>

                        <legend class="heading">Authorization Options</legend>

                        <p>Following fields are optional:</p>
                        <label for="idCheck">
                            <input type="checkbox" name="idCheck" tabindex="7" id="idCheck" />
                            <span>Should we require Id verification?</span>
                        </label>
                        <label for="accessCode">

                            <input type="text" name="accessCode" tabindex="8" id="accessCode" value="" />
                            <span>Application Access Code</span>
                        </label>
                    </fieldset>
                    
                            <input name="Submit" id="submit" tabindex="7" value="Submit" type="submit">
                        
                </form>
            </span>
        </div>
    
        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>