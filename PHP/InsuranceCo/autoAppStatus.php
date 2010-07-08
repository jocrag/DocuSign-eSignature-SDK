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
 
// start session and some helper functions
include("include/session.php");
// credential service proxy classes and soapclient
include("api/CredentialService.php");
// api service proxy classes and soapclient
include("api/APIService.php");
// redirect to setup page if we aren't logged in
loginCheck("../login.php");

// get Integrator Key from credentials.ini 
$ini_array = parse_ini_file("integrator.php");    
$IntegratorsKey = $ini_array["IntegratorsKey"];

// setup api connection 
$api_endpoint="https://demo.docusign.net/api/3.0/api.asmx";
$api_wsdl = "api/APIService.wsdl";
$api_options =  array('location'=>$api_endpoint,'trace'=>true,'features' => SOAP_SINGLE_ELEMENT_ARRAYS);
$api = new APIService($api_wsdl, $api_options);
// set credentials on the api object - if we have an integrator key then we prepend that to the UserID
if(isset($IntegratorsKey) && $IntegratorsKey<>""){
	$api->setCredentials($IntegratorsKey . $_SESSION["UserID"], $_SESSION["Password"]);
} else {
	$api->setCredentials($_SESSION["UserID"], $_SESSION["Password"]);
}


$RequestStatusesParams = new RequestStatuses();
/*
$RequestStatusesParams->EnvelopeStatusFilter->UserInfo->UserName = $_SESSION["UserName"];
$RequestStatusesParams->EnvelopeStatusFilter->UserInfo->Email = $_SESSION["Email"];
$RequestStatusesParams->EnvelopeStatusFilter->AccountId = $_SESSION["AccountID"];
$RequestStatusesParams->EnvelopeStatusFilter->Statuses->Status = "Any";
*/
$RequestStatusParams = new RequestStatus();
$RequestStatusParams->EnvelopeID = $_SESSION["EnvelopeID"];

try{
	$RequestStatusResponse = $api->RequestStatus($RequestStatusParams);
	addToLog("API Call - RequestStatus Request", '<pre>' . xmlpp($api->_lastRequest,true) . '</pre>');
	addToLog("API Call - RequestStatus Response", '<pre>' . xmlpp($api->__getlastResponse(),true) . '</pre>');
	
} catch (SoapFault $fault){
	$_SESSION["errorMessage"] = $fault;
	$_SESSION["lastRequest"] = $api->_lastRequest;
	header("Location: error.php");
	die();
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
                            <a href="sessionlog.php" target="_blank"><img src="images/script.png" style="border: 0px;" /><span style="font-size: 0.75em;">View InsuranceCo Event Log</span></a>
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
                <h1>Status - Automobile Insurance Application</h1>
                <table class="dataTable">
                    <thead>
                        <tr>
                            <th align="left">Envelope Id</th>
                            <th align="left">Application Type</th>
                            <th align="left">Application Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                           <td align="left"><?php echo($RequestStatusResponse->RequestStatusResult->EnvelopeID);?></td>
                           <td align="left">Autombile Insurance Rider</td>
                           <td align="left"><?php echo($RequestStatusResponse->RequestStatusResult->Status);?></td>
                       </tr>
							
                    <?php /*
                        foreach ($RequestStatusResponse->RequestStatusesResult->EnvelopeStatuses->EnvelopeStatus as $EnvelopeStatusResult) {
                            if ($EnvelopeStatusResult->Subject == "InsuranceCo Auto Rider") {
                            }
                        }   */                         
                    ?>                    
                   </tbody>
                </table>
            </span>
        </div>
    
        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>