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
//  credential api service proxy classes and soapclient
include("api/CredentialService.php");
// transaction api service proxy classes and soapclient
include("api/APIService.php");
// redirect to setup page if we aren't logged in
loginCheck("../login.php");

function extractInitials($firstname, $lastname){
	$retval = "";
	if($firstname <> null && strlen($firstname) > 0){
		$retval = $retval . substr($firstname, 0,1);
	}
	if($lastname <> null && strlen($lastname) > 0){
		$retval = $retval . substr($lastname, 0,1);
	}
	return $retval;
}

function curPageURL() {
 $pageURL = 'http';
 if (isset($_SERVER["HTTPS"]) && $_SERVER["HTTPS"] == "on") {$pageURL .= "s";}
 $pageURL .= "://";
 if ($_SERVER["SERVER_PORT"] != "80") {
  $pageURL .= $_SERVER["SERVER_NAME"].":".$_SERVER["SERVER_PORT"].$_SERVER["REQUEST_URI"];
 } else {
  $pageURL .= $_SERVER["SERVER_NAME"].$_SERVER["REQUEST_URI"];
 }
 return $pageURL;
}

function getCallbackURL($callbackPage){
	$urlbase =  curPageURL();
	$urlbase = substr($urlbase, 0, strrpos($urlbase, '/'));
	$urlbase = $urlbase . "/" . $callbackPage;
	return $urlbase;
}

function makeRecipient(){

	// this is the signer
	$Recipient = new Recipient();
	$Recipient->Email = $_POST["emailDestination"];
	$Recipient->UserName = $_POST["firstName"] . " " . $_POST["lastName"];
	$Recipient->ID = "1";
	$Recipient->RoleName = "Insured";
	$Recipient->Type = "Signer";
	$Recipient->RoutingOrder = "1";
   $Recipient->RoutingOrderSpecified = true;
   $Recipient->AutoNavigation = "true";
   $Recipient->RequireIDLookup =false;
	if(isset($_POST["embeddedSigning"]) && $_POST["embeddedSigning"]==true  ){
		$Recipient->CaptiveInfo->ClientUserId ="1";
		$Recipient->SignatureInfo->SignatureName =  $_POST["firstName"] . " " . $_POST["lastName"];
		$Recipient->SignatureInfo->SignatureInitials = extractInitials($_POST["firstName"] , $_POST["lastName"]);
		$Recipient->SignatureInfo->FontStyle = "Mistral";
	}

	return $Recipient;

}

function makeTemplateReference(){
	// build our template request.
	$TemplateRef = new TemplateReference();
	$TemplateRef->Template = $_SESSION["TemplateID"];
	$TemplateRef->TemplateLocation = "Server";
	$TemplateRef->Sequence = "1";
	return $TemplateRef;
}

function makeTemplateFormFields(){
	// merge POST data into fields
	$fields = array();
	$field1 = new TemplateReferenceFieldDataDataValue();
	$field1->TabLabel = "VIN";
   $field1->Value = $_POST["carVIN"];
	$fields[0] = $field1;

	$field2 = new TemplateReferenceFieldDataDataValue();
	$field2->TabLabel = "Make";
   $field2->Value = $_POST["carMake"];
	$fields[1] = $field2;

	$field3 = new TemplateReferenceFieldDataDataValue();
	$field3->TabLabel = "Model";
	$field3->Value = $_POST["carModel"];
	$fields[2] = $field3;

	return $fields;

}

function makeEnvelopeInfo(){
	$EnvelopeInfo = new EnvelopeInformation();
	$EnvelopeInfo->EmailBlurb = "This envelope was sent from the Auto Insurance Sample of the DocuSign SDK.";
	$EnvelopeInfo->Subject = "InsuranceCo Auto Rider";
	$EnvelopeInfo->AccountId = $_SESSION["AccountID"];

	return $EnvelopeInfo;
}

function makeRequestRecipientToken($Recipient){

	$RequestRecipientTokenparam = new RequestRecipientToken();
	$RequestRecipientTokenparam->EnvelopeID = $_SESSION["EnvelopeID"] ;
	$RequestRecipientTokenparam->ClientUserID = "1";
	$RequestRecipientTokenparam->Username = $Recipient->UserName;
	$RequestRecipientTokenparam->Email = $Recipient->Email;
	$RequestRecipientTokenparam->AuthenticationAssertion->AssertionID = time();
	$m = date("m");
	$d = date("Y")."-".$m."-".date("d")."T00:00:00.00";
	$RequestRecipientTokenparam->AuthenticationAssertion->AuthenticationInstant = $d;
	$RequestRecipientTokenparam->AuthenticationAssertion->AuthenticationMethod = "Password";
	$RequestRecipientTokenparam->AuthenticationAssertion->SecurityDomain = $_SERVER['HTTP_HOST'];
	$RequestRecipientTokenparam->ClientURLs->OnViewingComplete =  getCallbackURL("pop.html")."?id=2";;
	$RequestRecipientTokenparam->ClientURLs->OnCancel =  getCallbackURL("pop.html")."?id=3";
	$RequestRecipientTokenparam->ClientURLs->OnDecline =  getCallbackURL("pop.html")."?id=4";
	$RequestRecipientTokenparam->ClientURLs->OnSessionTimeout =  getCallbackURL("pop.html")."?id=5";
	$RequestRecipientTokenparam->ClientURLs->OnTTLExpired =  getCallbackURL("pop.html")."?id=6";
	$RequestRecipientTokenparam->ClientURLs->OnException = getCallbackURL("pop.html")."?id=7";
	$RequestRecipientTokenparam->ClientURLs->OnAccessCodeFailed =  getCallbackURL("pop.html")."?id=8";
	$RequestRecipientTokenparam->ClientURLs->OnSigningComplete =  getCallbackURL("pop.html")."?id=9";
	$RequestRecipientTokenparam->ClientURLs->OnIdCheckFailed =  getCallbackURL("pop.html")."?id=1";

	return $RequestRecipientTokenparam;
}

function makeCCRecipient($email){

	$Recipient = new Recipient();
	$Recipient->Email = $email;
	$Recipient->UserName = "Any Signer";
	$Recipient->ID = "2";
	$Recipient->RoleName = "CC";
	$Recipient->Type = "CarbonCopy";
   $Recipient->RequireIDLookup =false;
   return $Recipient;

}

// get Integrator Key from credentials.ini
$ini_array = parse_ini_file("integrator.php");
$IntegratorsKey = $ini_array["IntegratorsKey"];
if (!isset($IntegratorsKey) || $IntegratorsKey == "") {
    $_SESSION["errorMessage"] = "Please make sure integrator key is set (in integrator.php).";
    header("Location: error.php");
    die();
}

// setup api connection
$api_endpoint="https://demo.docusign.net/api/3.0/api.asmx";
$api_wsdl = "api/APIService.wsdl";
$api_options =  array('location'=>$api_endpoint,'trace'=>true,'features' => SOAP_SINGLE_ELEMENT_ARRAYS);
$api = new APIService($api_wsdl, $api_options);
// set credentials on the api object - if we have an integrator key then we prepend that to the UserID
$api->setCredentials("[" . $IntegratorsKey . "]" . $_SESSION["UserID"], $_SESSION["Password"]);



// main page loop
if($_SERVER["REQUEST_METHOD"]=="POST"){
	if(isset($_POST["Submit"])){

		// setup recipient. This varies depending on whether we have selected Embedded Signing or Embedded Sending
		$Recipient = makeRecipient();
		// set any selected security options on the recipient
		if (isset($_POST['AuthenticationMethod']) && $_POST["AuthenticationMethod"]=="IDLookup") {
          $Recipient->RequireIDLookup =true;
			 $Recipient->IDCheckConfigurationName = "ID Check $";
      }
      if (isset($_POST['accessCode'])) {
          $Recipient->AccessCode = $_POST["accessCode"];
      }
      if (isset($_POST['AuthenticationMethod']) && $_POST["AuthenticationMethod"]=="Phone") {
			$Recipient->RequireIDLookup = true;
			$Recipient->IDCheckConfigurationName = "Phone Auth $";
         $Recipient->PhoneAuthentication->SenderProvidedNumbers->SenderProvidedNumber[0] = $_POST["authPhoneNumber"];
         $Recipient->PhoneAuthentication->RecipMayProvideNumber = true;
			$Recipient->PhoneAuthentication->RecordVoicePrint = true;
      }


		// role assignments - this indicates what Role a recipient will play in a template
		$RoleRef = new TemplateReferenceRoleAssignment();
		$RoleRef->RecipientID = $Recipient->ID;
		$RoleRef->RoleName = $Recipient->RoleName;

		// get our Template Ref - this indicates that we will use a server side template for the signing
		$TemplateReference = makeTemplateReference();
		$TemplateReference->RoleAssignments[0] = $RoleRef;
		// add form fields to bring in the posted data
		$TemplateReference->FieldData->DataValues = makeTemplateFormFields();
		// envelope info -
		$EnvelopeInfo = makeEnvelopeInfo();


		//bundle all into params for call
		$TemplateParams = new CreateEnvelopeFromTemplates();
		$TemplateParams->TemplateReferences->TemplateReference[0] = $TemplateReference;
		$TemplateParams->Recipients->Recipient[0] = $Recipient;
		$TemplateParams->EnvelopeInformation = $EnvelopeInfo;
		if(isset($_POST["embeddedSending"])) {
			$TemplateParams->ActivateEnvelope = false;
		} else {
			$TemplateParams->ActivateEnvelope = true;
		}
		// do we have a CC Recipient to handled?
		if(isset($_POST["emailDestinationCC"]) && ($_POST["emailDestinationCC"]<>"")){
	      $CCRecipient = makeCCRecipient($_POST["emailDestinationCC"]);
			$TemplateParams->Recipients->Recipient[1] = $CCRecipient;
		}

		// send Envelope
		try{
			$Response = $api->CreateEnvelopeFromTemplates($TemplateParams);
			addToLog("API Call - CreateEnvelopeFromTemplates Request", '<pre>' . xmlpp($api->_lastRequest,true) . '</pre>');
			addToLog("API Call - CreateEnvelopeFromTemplates Response", '<pre>' . xmlpp($api->__getlastResponse(),true) . '</pre>');
			$_SESSION["EnvelopeID"] = $Response->CreateEnvelopeFromTemplatesResult->EnvelopeID;

		} catch (SoapFault $fault){
			$_SESSION["errorMessage"] = $fault;
			$_SESSION["lastRequest"] = $api->_lastRequest;
			header("Location: error.php");
			die();
		}

		if(isset($_POST["embeddedSigning"])){
			$RequestRecipientTokenParams =  makeRequestRecipientToken($Recipient);
			try{
				$RequestRecipientTokenResponse = $api->RequestRecipientToken($RequestRecipientTokenParams);
				addToLog("API Call - RequestRecipientToken Request", '<pre>' . xmlpp($api->_lastRequest,true) . '</pre>');
				addToLog("API Call - RequestRecipientToken Response", '<pre>' . xmlpp($api->__getlastResponse(),true) . '</pre>');

			} catch (SoapFault $fault){
				$_SESSION["errorMessage"] = $fault;
				$_SESSION["lastRequest"] = $api->_lastRequest;
				header("Location: error.php");
				die();
			}
			$_SESSION["EmbeddedToken"] = $RequestRecipientTokenResponse->RequestRecipientTokenResult;
			$URL = "embedHost.php";

		} else if(isset($_POST["embeddedSending"])) {
			$RequestSenderTokenParam = new RequestSenderToken();
			$RequestSenderTokenParam->EnvelopeID = $_SESSION["EnvelopeID"];
			$RequestSenderTokenParam->AccountID = $_SESSION["AccountID"];
			$RequestSenderTokenParam->ReturnURL = getCallbackURL("pop.html");

			try{
				$RequestSenderTokenResponse = $api->RequestSenderToken($RequestSenderTokenParam);
				addToLog("API Call - RequestSenderToken Request", '<pre>' . xmlpp($api->_lastRequest,true) . '</pre>');
				addToLog("API Call - RequestSenderToken Response", '<pre>' . xmlpp($api->__getlastResponse(),true) . '</pre>');

			} catch (SoapFault $fault){
				$_SESSION["errorMessage"] = $fault;
				$_SESSION["lastRequest"] = $api->_lastRequest;
				header("Location: error.php");
				die();
			}
			$_SESSION["EmbeddedToken"] = $RequestSenderTokenResponse->RequestSenderTokenResult;
			$URL = "embedHost.php";

		} else {
			$URL = "autoAppStatus.php";
		}

		header("Location: " . $URL);

	}
} else {

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
                <img src="images/logo.png" alt="InsuranceCo - Insuring the security of your future" onclick="javascript:prefillForm();">
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
                <h1>Automobile Insurance Application</h1>

                <form class="applicationForm" id="applicationForm" method="post" action="autoAppApply.php">
                    <fieldset>
                        <legend class="heading">Insured Motorist Details</legend>

                        <p>Please fill in all fields:</p>

                        <label for="firstName">
                            <input name="firstName"  tabindex="1" size="50" id="firstName" type="text">
                            First Name:                        </label>
                        <label for="lastName">
                            <input name="lastName"  tabindex="2" size="50" id="lastName" type="text">
                            Last Name:                        </label>
                    </fieldset>
                    <br>
                    <fieldset>
                        <legend class="heading">Car Details</legend>

                        <p>Please fill in all fields:</p>
                        <label for="carMake">
                            <input name="carMake"  tabindex="3" size="50" id="carMake" type="text">
                            Car Make:                        </label>
                        <label for="carModel">
                            <input name="carModel"  tabindex="4" size="50" id="carModel" type="text">
                            Car Model:                        </label>
                        <label for="carVIN">
                            <input name="carVIN"  tabindex="5" size="50" id="carVIN" type="text">
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
                                <input name="emailDestination" tabindex="6" id="emailDestination" type="text">
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

									<span>Extra Authentication?</span><br/>
								<label for="AuthenticationMethod">
									<input name="AuthenticationMethod" type="radio" class="form" value="None" onClick="togglePhoneNumberInput()" checked="checked" >None</input><br/>
									<input name="AuthenticationMethod" type="radio" class="form" value="IDLookup" onClick="togglePhoneNumberInput()">IDLookup</input><br/>
									<input name="AuthenticationMethod" type="radio" class="form" value="Phone" onClick="togglePhoneNumberInput()">Phone</input><br/>
								</label>

								<div id="authPhoneNumberContainer" style="display: none;" >
	                        <label for="authPhoneNumber">
	                            <span>Authentication Phone Number:</span>
										<input type="text" name="authPhoneNumber" id="authPhoneNumber"/>
	                        </label>
								</div>

                        <label for="accessCode">
                            <input type="text" name="accessCode" tabindex="8" id="accessCode" value="" />
                            <span>Application Access Code</span>
                        </label>
                    </fieldset>
                    <input name="Submit" id="submit" tabindex="7" value="Submit" type="submit" onclick="return ValidateInput();">
		        </form>
		    </span>
		</div>

		<div class="footer">InsuranceCo - Docusign</div>
		<script type="text/javascript">

		    function prefillForm() {
		        document.getElementById("emailDestination").value = "<?php echo $_SESSION["Email"]; ?>";
		        document.getElementById("firstName").value = "test";
		        document.getElementById("lastName").value = "docusign";
		        document.getElementById("carVIN").value = "VIN-123456";
		        document.getElementById("carMake").value = "Ford";
		        document.getElementById("carModel").value = "Escort";

		        return true;
		    }

		    function ValidateInput() {
		        var msg = "The following fields are required:\n";
		        var valid = true;
		        if (document.getElementById("firstName").value.length == 0) {
		            msg +="\tFirst Name\n";
		            valid = false;
		        }
		        if (document.getElementById("lastName").value.length == 0) {
		            msg += "\tLast Name\n";
		            valid = false;
		        }
		        if (document.getElementById("emailDestination").value.length == 0) {
		            msg += "\tEmail\n";
		            valid = false;
		        }
		        if (document.getElementById("carMake").value.length == 0) {
		            msg += "\tMake\n";
		            valid = false;
		        }
		        if (document.getElementById("carModel").value.length == 0) {
		            msg += "\tModel\n";
		            valid = false;
		        }
		        if (document.getElementById("carVIN").value.length == 0) {
		            msg += "\tVIN\n";
		            valid = false;
		        }
		        if (document.getElementById("phoneAuthentication").checked == true && document.getElementById("authPhoneNumber").value.search(/\d{3}\-\d{3}\-\d{4}/)==-1) {
		            msg += "\tAuthentication Phone Number (use xxx-xxx-xxxx format)\n";
		            valid = false;
		        }


		        if(!valid)
		            alert(msg);

		        return valid;
		    }

		</script>
		</body>
</html>