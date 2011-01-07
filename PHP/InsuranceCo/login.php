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

/*
This page is all about setting up the demo. We need to get the users docusign credentials, check to see if they are in multiple accounts,
and let them choose which account they want to use, and then check that account for the required template, and upload it if it isn't found.

*/

// start session and some helper functions
include("include/session.php");
// credential service proxy classes and soapclient
include("api/CredentialService.php");
// api service proxy classes and soapclient
include("api/APIService.php");
// functions

function getTransactionAPIProxy($user = null, $password = null){
	global $IntegratorsKey, $api_wsdl, $api_options;

	if($user===null && isset($_SESSION["UserID"])){
		$user = $_SESSION["UserID"];
	}
	if($password===null && isset($_SESSION["Password"])){
		$password = $_SESSION["Password"];
	}
	// get Integrator Key from credentials.ini
    $ini_array = parse_ini_file("integrator.php");
    $IntegratorsKey = $ini_array["IntegratorsKey"];
    if (!isset($IntegratorsKey) || $IntegratorsKey == "") {
        $_SESSION["errorMessage"] = "Please make sure integrator key is set (in integrator.php).";
        header("Location: error.php");
        die();
    }

	$api = new APIService($api_wsdl, $api_options);
	// set credentials on the api object - if we have an integrator key then we prepend that to the UserID
	$api->setCredentials("[" . $IntegratorsKey . "]" . $user, $password);
	return $api;

}

function login($user, $password){
   $retval = false; //
	$_SESSION["lastLoginError"] = "";

	global $creds_wsdl, $creds_options;

	$credService = new CredentialService($creds_wsdl, $creds_options);

	$login = new Login();
	$login->Email=$user;
	$login->Password=$password;

	try {
		$response = $credService->Login($login);
   } catch( SoapFault $fault) {
		$_SESSION["errorMessage"] = $fault;
		header("Location: error.php");
		die();
	}

	switch($response->LoginResult->ErrorCode){
		case "User_Does_Not_Exist_In_System":
			$retval = false;
			$_SESSION["lastLoginError"] = "Login failed.";
		break;
		case "Account_Lacks_Permissions":
			$retval = false;
			$_SESSION["lastLoginError"] = "Your account does not have permission to log in.";
		break;
		case "User_Lacks_Permissions":
			$retval = false;
			$_SESSION["lastLoginError"] = "Your user does not have permission to log in.";
		break;
		case "User_Authentication_Failed":
			$retval = false;
			$_SESSION["lastLoginError"] = "Login failed.";
		break;
		case "Unspecified_Error":
			$retval = false;
			$_SESSION["lastLoginError"] = "An error occurred.";
		break;
		case "Success":

			$AccountsWithTemplateAccess = checkAccountsForTemplatePermissions($response->LoginResult, $user, $password);
			if(count($AccountsWithTemplateAccess > 0)) {
				$_SESSION["AccountID"] = $AccountsWithTemplateAccess[0]->AccountID;
				$_SESSION["AccountName"] = $AccountsWithTemplateAccess[0]->AccountName;
				$_SESSION["UserName"] = $AccountsWithTemplateAccess[0]->UserName;
				$_SESSION["Email"] = $AccountsWithTemplateAccess[0]->Email;
				$_SESSION["UserID"] = $AccountsWithTemplateAccess[0]->UserID;
				$_SESSION["Password"] = $password;
				// If we have more than one account, store them so we can show them in the account selector
				if(count($AccountsWithTemplateAccess > 1)) {
					$_SESSION["Accounts"]=$AccountsWithTemplateAccess;
				}

			} else {
				$retval = false;
				$_SESSION["lastLoginError"] = "None of your accounts have Manage Template permissions. You can correct this in the Member Console";

			}
			$retval = true;

		break;
		default:
			$retval = false;
	}
	return $retval;
}

function checkAccountsForTemplatePermissions($LoginResult, $userID, $password){
	// this will attempt a requestTemplates call on each account and if it fail
	$accounts = array();
	$api = getTransactionAPIProxy($userID, $password);

	foreach($LoginResult->Accounts->Account as $account){
		$params = new RequestTemplates();
		$params->AccountID = $account->AccountID;
		$params->IncludeAdvancedTemplates = "True";
		try{
			$Templates = $api->RequestTemplates($params);
			$accounts[] = $account;
		} catch (SoapFault $fault){

		}
	}

	return $accounts;
}

function checkRequiredModules(){
	$retval = false;
	if(extension_loaded('soap') && extension_loaded('curl') && extension_loaded('mcrypt') && extension_loaded('xml') && extension_loaded('dom') && extension_loaded('openssl')){
		$retval = true;
	}
	return $retval;
}

function clearSessionLogin(){

	$_SESSION["LoggedIn"] = false;
	if(isset($_SESSION["AccountID"])) unset($_SESSION["AccountID"]);
	if(isset($_SESSION["AccountName"])) unset($_SESSION["AccountName"]);
	if(isset($_SESSION["UserName"])) unset($_SESSION["UserName"]);
	if(isset($_SESSION["Email"])) unset($_SESSION["Email"]);
	if(isset($_SESSION["UserID"])) unset($_SESSION["UserID"]);
	if(isset($_SESSION["Password"])) unset($_SESSION["Password"]);
	if(isset($_SESSION["Accounts"])) unset($_SESSION["Accounts"]);
	if(isset($_SESSION["TemplateID"])) unset($_SESSION["TemplateID"]);
	if(isset($_SESSION["traceLog"])) unset($_SESSION["traceLog"]);

}

function checkAccountForTemplate(){
	// check our account for the template we need, if not there prompt to save it
	$retval = false;

	If($_SESSION["LoggedIn"]===true && isset($_SESSION["AccountID"])){

		$api = getTransactionAPIProxy();

		$params = new RequestTemplates();
		$params->AccountID = $_SESSION["AccountID"];
		$params->IncludeAdvancedTemplates = "True";
		try{
			$Templates = $api->RequestTemplates($params);
		} catch (SoapFault $fault){
			$_SESSION["errorMessage"] = $fault;
			$_SESSION["lastRequest"] = $api->_lastRequest;
			header("Location: error.php");
			die();
		}

		if (is_array($Templates->RequestTemplatesResult->EnvelopeTemplateDefinition)) {
			foreach ($Templates->RequestTemplatesResult->EnvelopeTemplateDefinition as $Template) {
				if ($Template->Name == "InsuranceCo Auto Insurance Application") {
					$TemplateID = $Template->TemplateID;
					$_SESSION["TemplateID"] = $TemplateID;
					$retval = true;
				}
			}
		}
	}
	if($retval===false) {
		unset($_SESSION["TemplateID"]);
	}
	return $retval;
}

function uploadTemplateToAccount(){

	$api = getTransactionAPIProxy();

	$params = new UploadTemplate();
	$params->AccountID = $_SESSION["AccountID"];
	$params->TemplateXML = file_get_contents("resources/autoInsuranceApplication.dpd");
	$params->Shared = "true";

	try{
		// upload template
		$uploadTemplateResponse = $api->UploadTemplate($params);
		// so, due to a bug we have to upload a template in the dpd format
		// and then download it from the server, which will cause it to be converted to the new format
		// and then upload it again so that we can use it. However, when we try to upload it we'll hit another
		// bug that prevents us from saving a template without an email address so we'll specify bogus email
		// and then update to the correct email address when we are ready to send the envelope.
		$requestTemplateParams = new RequestTemplate();
		$requestTemplateParams->TemplateID = $uploadTemplateResponse->UploadTemplateResult->TemplateID;
		$requestTemplateParams->IncludeDocumentBytes = "false";

		$requestTemplateResponse = $api->RequestTemplate($requestTemplateParams);
		// this is to work around a bug that prevents saving a template when there isn't an email address specified.
		$requestTemplateResponse->RequestTemplateResult->Envelope->Recipients->Recipient[0]->UserName = "Signer Here";
		$requestTemplateResponse->RequestTemplateResult->Envelope->Recipients->Recipient[0]->Email = "test@docusign.com";

		$saveTemplateParams = new SaveTemplate();
		$saveTemplateParams->EnvelopeTemplate = $requestTemplateResponse->RequestTemplateResult;
		$saveTemplateResponse = $api->SaveTemplate($saveTemplateParams);

		$_SESSION["TemplateID"] = $saveTemplateResponse->SaveTemplateResult->TemplateID;
	} catch (SoapFault $fault){
		if(strpos($fault, "User lacks sufficient permissions") > 0){
			// set local error message and stay on page
			$_SESSION["TemplateUploadError"] = true;
		} else {
			$_SESSION["errorMessage"] = $fault;
			$_SESSION["lastRequest"] = $api->_lastRequest;
			header("Location: error.php");
			die();
		}
	}

}

// main page loop

// api config values
$ini_array = parse_ini_file("integrator.php");
$IntegratorsKey = $ini_array["IntegratorsKey"];
// setup api connection
$api_endpoint="https://demo.docusign.net/api/3.0/api.asmx";
$api_wsdl = "api/APIService.wsdl";
$api_options =  array('location'=>$api_endpoint,'trace'=>true,'features' => SOAP_SINGLE_ELEMENT_ARRAYS);

$creds_endpoint="https://demo.docusign.net/api/3.0/Credential.asmx";
$creds_wsdl = "api/CredentialService.wsdl";
$creds_options = array('location'=>$creds_endpoint,'trace'=>true,'features' => SOAP_SINGLE_ELEMENT_ARRAYS);

if(!checkRequiredModules()){
	header('Location: configcheck.php');
	die();
}


if($_SERVER["REQUEST_METHOD"]=="POST"){
	switch($_POST["mode"]) {

		case "login":
			clearSessionLogin();
			if(login($_POST["email"], $_POST["password"])== true ){
			    $_SESSION["LoggedIn"] = true;
			} else {
				$_SESSION["LoggedIn"] = false;
			}
			header("Location: login.php");
			die();
		break;
		case "changecreds":
			if(isset($_POST["changelogin"])){
				clearSessionLogin();
				header("Location: login.php");
				die();
			} else if(isset($_POST["selectAccount"])){
				// set session accountId to passed in value
				$_SESSION["AccountID"] = $_POST["AccountID"];
				foreach($_SESSION["Accounts"] as $account){
					if($account->AccountID == $_SESSION["AccountID"]){
						$_SESSION["AccountName"] = $account->AccountName;
					}
				}
				checkAccountForTemplate();

			} else if(isset($_POST["changeAccount"])){
				// unset session accountId
				unset($_SESSION["AccountID"]);
				unset($_SESSION["TemplateID"]);

			}


			break;
		case "uploadTemplate":
			uploadTemplateToAccount();
			header("Location: login.php");
			die();
		break;
		case "returnToDemo":
			header("Location: " . $_SESSION["returnPage"]);
			die();
		break;
		default:
			$_SESSION["errorMessage"] = "invalid mode in post";
			header("Location: error.php");
			die();
	}

} else if($_SERVER["REQUEST_METHOD"] == "GET"){
	// display controlled by session vars
	if(!isset($_SESSION["LoggedIn"])) {
		$_SESSION["LoggedIn"] = false;
	}
	if(isset($_SERVER["HTTP_REFERER"]) && !isset($_SESSION["returnPage"]) ){
		$_SESSION["returnPage"] = $_SERVER["HTTP_REFERER"];
	} else {
		$_SESSION["returnPage"] = 'index.php';
	}
	// if we have creds and an account, check to see if the template we need is in there
	if($_SESSION["LoggedIn"] === true && isset($_SESSION["AccountID"]) ){
		checkAccountForTemplate();
	}
	if(isset($_SESSION["lastLoginError"])){
		$errorMessage = $_SESSION["lastLoginError"];
		unset($_SESSION["lastLoginError"]);
	}
	if(isset($_SESSION["TemplateUploadError"])){
		$templateUploadError = true;
		unset($_SESSION["TemplateUploadError"]);
	}
}

$demoTitle = "Demo Setup";

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
            <div class="floatLeft" >
                <img src="images/logo.png" alt="InsuranceCo - Insuring the security of your future">
            </div>
            <div class="userBox">
                <table cellspacing="0" border="0">

                    <tr>
                        <td colspan="4" align="right">
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
                </ul>
            </div>
        </div>

        <div class="col1">
				<?php if( $_SESSION["LoggedIn"] === false) {?>

					<form class="applicationForm" id="applicationForm" method="post">
                <fieldset>
                   <legend class="heading">Log In</legend>
                    <p>Please
							enter the email address and password for your Docusign account. You
							will be prompted to select the account you wish to work with if your
							email address and password match multiple accounts.</p>
<?php if(isset($errorMessage)) { echo "<p style='color:red;'>".$errorMessage.'</p>'; }?>

                    <label for="email">
                        <input name="email" tabindex="1" id="email" size="40" type="text">
                        Email:                    </label>
                    <label for="password">
                         <input name="password" tabindex="2" id="password" size="40" value="" type="password">
                         Password:                    </label>
                    <label for="submit">
                        <input name="Submit" id="submit" tabindex="4" value="Log in" type="submit">
                    </label>
							<input type="hidden" name="mode" id="mode" value="login">
	                </fieldset>
					</form>

				<?php } else { ?>

		         <form class="applicationForm"  id="changeLogin" method="post">
	                <fieldset>
                   <legend class="heading">Credentials</legend>
			            <label for="email">Email:<span name="email" id="email"><?php echo $_SESSION["Email"]?></span>
							<input type="hidden" name="mode" id="mode" value="changecreds">
	                 	<input name="changelogin" id="changelogin" tabindex="4" value="Clear Credentials" type="submit"></label><br/>
					   <label for="account">Account:
						<?php if(!isset($_SESSION["Accounts"]) && isset($_SESSION["AccountID"])  ) { ?>
							<span name="accountName" id="accountName"><?php echo $_SESSION["AccountName"]?></span>
						<?php } else {?>
							<?php if(isset($_SESSION["AccountID"])) { ?>
								<span name="accountName" id="accountName"><?php echo $_SESSION["AccountName"]?></span>
				         <input name="changeAccount" id="changeAccount" tabindex="4" value="Change Account" type="submit">
							<?php } else { ?>
								<select type="select" name="AccountID" id="AccountID">
									<?php foreach( $_SESSION["Accounts"] as $account) {?>
										<option value="<?php echo $account->AccountID; ?>" ><?php echo $account->AccountName; ?></option>
									<?php }?>
								</select>
				         	<input name="selectAccount" id="selectAccount" tabindex="4" value="Select Account" type="submit">
							<?php } ?>
						<?php } ?>
               </label>
					</fieldset>
					</form>
				<?php } ?>

					<form class="applicationForm" id="uploadTemplateForm" method="post">
						<fieldset>
							<legend>Template</legend>
						<?php if($_SESSION["LoggedIn"]===false) {?>
						<p>Template will be checked once Credentials are entered.</p>

						<?php } ?>
						<?php if($_SESSION["LoggedIn"]===true && !isset($_SESSION["AccountID"]) ) {?>
						<p>Template will be checked once Account is Selected.</p>

						<?php } ?>
						<?php
						 	// show this section if we are logged in but don't have a template in the account
							if(!isset($_SESSION["TemplateID"]) && $_SESSION["LoggedIn"]===true && isset($_SESSION["AccountID"]) ) { ?>
									<?php if(isset($templateUploadError)) { ?>
										<p style="color: red">You do not have permissions to upload templates to this account. Please select a different account.<p>
									<?php } else { ?>
										<p>Your Account does not have the required Template. Click the Upload button to upload it to your account</p>
										<form id="uploadTemplateForm" method="post">
											<input type="hidden" name="mode" id="mode" value="uploadTemplate">
											<input name="uploadTemplateButton" id="uploadTemplateButton" value="Upload" type="submit">
									<?php } ?>
									</fieldset>
						<?php } ?>

					<?php
					 	// show this section if we are logged in and have a template already in the account
						if(isset($_SESSION["TemplateID"]) && $_SESSION["LoggedIn"]===true  ) { ?>
								<p>Your Account has the required Template.</p>

								</fieldset>
					<?php } ?>
					</fieldset>
            </form>


        </div>

        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>