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

    if (!isset($_SESSION["OPENED_SITE"])) AddToLog("Open site");

    $_SESSION["OPENED_SITE"] = "1";
    if ($_SESSION["DS_LOGED"]) {
        if($_SESSION["DS_LOGED"]=="1") {
            
        } else {header( 'Location: login.php' ) ; }
    } else {header( 'Location: login.php' ) ; }
    
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
    
    $config = array("userId" => $_SESSION["UserID"], "password" => $_SESSION["password"], "accountId" => $_SESSION["AccountID"], "subject" => "Automobile Insurance Application", "blurb" => "Please review and complete this auto-mobile insurance application.");
    $envelope = new Docusign_Envelope("https://demo.docusign.net/api/3.0/api.asmx?wsdl", $config);
    $TemplateID = "";
    $TmplParam = array();
    $TmplParam["AccountID"] = $_SESSION["AccountID"];
    try {
    $Tmlp = $envelope->RequestTemplates($TmplParam);    
    } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    window.location = "autoAppTemplate.php";
                </script>
                
            <?php
            die(1);
        }
    if (isset($Tmlp->RequestTemplatesResult)) {
    //echo("test");
    //print_r($Tmlp);
    if (is_array($Tmlp->RequestTemplatesResult->EnvelopeTemplateDefinition)) {
    foreach ($Tmlp->RequestTemplatesResult->EnvelopeTemplateDefinition as $Template) {
        //print_r($Template->Name);
        if ($Template->Name == "Auto Insurance Application") {
            $TemplateID = $Template->TemplateID;
            $_SESSION["TEMPLATE_ID"] = $TemplateID;
        }
    }    
     } else {
        if (isset($Tmlp->RequestTemplatesResult->EnvelopeTemplateDefinition)) {
            if ($Tmlp->RequestTemplatesResult->EnvelopeTemplateDefinition->Name == "Auto Insurance Application") {
                $TemplateID = $Tmlp->RequestTemplatesResult->EnvelopeTemplateDefinition->TemplateID;
                $_SESSION["TEMPLATE_ID"] = $TemplateID;
            }
        }}
    
    } else {
        if ($Tmlp->RequestTemplatesResult->EnvelopeTemplateDefinition->Name == "Auto Insurance Application") {
            $TemplateID = $Tmlp->RequestTemplatesResult->EnvelopeTemplateDefinition->TemplateID;
            $_SESSION["TEMPLATE_ID"] = $TemplateID;
        }
    }
    
    if (isset($_POST["Submit"])) {
        if (isset($_POST['authorizeTemplateOverwrite'])) {
        try {
            AddToLog($_SESSION["email"]." Save Template");
            $TemplateID = $_SESSION["AccountID"];
            $RequestTemplateParams = array();
            $SaveTemplateParams = array();
            $RequestTemplateParams["TemplateID"] = $_SESSION["TEMPLATE_ID"];
            $RequestTemplateParams["IncludeDocumentBytes"] = "false";
            $Envelopes = $envelope->RequestTemplate($RequestTemplateParams);
            $arrEnvelopes = object_to_array($Envelopes);
            $arrEnvelopes["RequestTemplateResult"]["Envelope"]["Recipients"]["Recipient"]["UserName"] = $_SESSION["UserName"];
            $arrEnvelopes["RequestTemplateResult"]["Envelope"]["Recipients"]["Recipient"]["Email"] = $_SESSION["email"];
            $SaveTemplateParams["EnvelopeTemplate"] = $arrEnvelopes["RequestTemplateResult"];
            $Envelopes = $envelope->SaveTemplate($SaveTemplateParams);                
        } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    window.location = "autoAppTemplate.php";
                </script>
                
            <?php
            die(1);
        }
        }
        header( 'Location: autoAppApply.php' );    
    }

    if (($TemplateID == "") && (!isset($_POST["Submit"]))) {
        
        $UploadTemplateParams = array();
            $UploadTemplateParams["TemplateXML"] = file_get_contents("autoInsuranceApplication.dpd");
            $UploadTemplateParams["AccountID"] = $_SESSION["AccountID"];
            $UploadTemplateParams["Shared"] = "true";            
            try {
                $Envelopes = $envelope->UploadTemplate($UploadTemplateParams);                
            } catch( SoapFault $fault) {
            
            $pos = strpos($fault, "\n");
            
            ?>
                <script language="javascript" >
                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                    window.location = "autoAppTemplate.php";
                </script>
                
            <?php
            die(1);
            }
            header( 'Location: autoAppApply.php' );            
    }
    
?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>

    
        <title>InsuranceCo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
        <script type="text/javascript" src="scripts/webservice-status.js"></script>
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
                <h1>Automobile Insurance</h1>
                
                    <form id="applicationForm" method="post" action="autoAppTemplate.php">
                        <fieldset>
                            <legend class="heading">Overwrite Insurance Application</legend>
        
                            <p>We have found an Auto Insurance template on your account.  Do you want to over write this template in your account?</p>
                            <label for="authorizeTemplateOverwrite">
                                <input name="authorizeTemplateOverwrite" tabindex="1" id="authorizeTemplateOverwrite" checked="checked" type="checkbox">
                                Check to Overwrite                            </label>
                            <label for="submit">
                                <input name="Submit" id="submit" tabindex="3" value="Submit" type="submit">
                            </label>
                        </fieldset>
                    </form>
                            </span>
        </div>
    
        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>