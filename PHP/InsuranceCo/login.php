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

 $flag = false;
    session_start();
    
    if ($_SESSION["InsuranceCo_logged"]=="true")  $flag = true;
    
    include("log.php");

    if (!isset($_SESSION["OPENED_SITE"])) AddToLog("Open site");

    $_SESSION["OPENED_SITE"] = "1";
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
                </ul>
            </div>
        </div>
        
        <div class="col1">
            <form id="applicationForm" method="post">
                <fieldset>
                <?php
                if (isset($_POST["email"]) || isset($_SESSION["InsuranceCo_logged"])) {
                    
                        if (isset($_POST["email"])) {
                            $admin_mail = $_POST["email"];
                            $admin_pass = $_POST["password"];
                        }
                        if (isset($_SESSION["InsuranceCo_logged"])) {
                            $admin_mail = $_SESSION["email"];
                            $admin_pass = $_SESSION["password"];
                        }
                        $client = new SoapClient("https://demo.docusign.net/API/3.0/Credential.asmx?WSDL");
                        $arr = array("Email" => $admin_mail, "Password" => $admin_pass);
                        try {
                        $response = $client->Login($arr);
                        } catch( SoapFault $fault) {
            
                            $pos = strpos($fault, "\n");
                            ?>
                                <script language="javascript" >
                                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                                    window.location = "login.php";
                                </script>
                                
                            <?php
                            die(1);
                        }
                        if ($response->LoginResult->Success == "1") $flag = true;
                        }
                        ?>
                    <?php
                        if ($flag==false) {
                    ?>
                    <legend class="heading">Log In</legend>
                    <?php } else { ?>
                    <legend class="heading">Select Account</legend> <?php } ?>
                    <span style="color: red;"></span>
    
                    <?php        
                    if ( isset($_POST["email"]) || isset($_SESSION["InsuranceCo_logged"]) ) {
                        if ($response->LoginResult->Success == "1") {
                         $flag = true;

                        AddToLog($admin_mail." login success");
                        //print_r($response);
                        //$config = array("userId" => $response->LoginResult->Accounts->Account[0]->UserID, "password" => $admin_pass, "accountId" => $response->LoginResult->Accounts->Account[0]->AccountID, "subject" => "These are the documents you requested!", "blurb" => "We need your signature to move forward.");
                            if (isset($_POST["email"])) {
                                $_SESSION["email"] = $admin_mail;
                                $_SESSION["password"] = $admin_pass;
                                $_SESSION["InsuranceCo_logged"] = "true";
                            }
                            if (is_array($response->LoginResult->Accounts->Account)) {
                                echo("<span style='color:red;'>The username/password matches multiple accounts, please select which one you want to work with:</span>
    ");
                                echo("<ul>");
                                $i=0;
                                foreach($response->LoginResult->Accounts->Account as $Account) {
                                    echo("<li><a style='text-decoration:none;color:red;' href='selectAcount.php?num=$i'>Account Name: ".$Account->AccountName."</a></li>");
                                    echo("<ul><li>User Name: ".$Account->UserName."</li><li>Email: ".$Account->Email."</li></ul>");
                                    $i++;
                                }
                                echo("</ul>");
                            } else {
                            
                                $ini_array = parse_ini_file("Credentials.ini");
                                $IntegratorsKey = $ini_array["IntegratorsKey"];
                            
                                $_SESSION["DS_LOGED"] = "1";
                                $_SESSION["AccountID"] = $response->LoginResult->Accounts->Account->AccountID;
                                $_SESSION["AccountName"] = $response->LoginResult->Accounts->Account->AccountName;
                                $_SESSION["UserName"] = $response->LoginResult->Accounts->Account->UserName;
                                $_SESSION["email"] = $response->LoginResult->Accounts->Account->Email;
                                $_SESSION["UserID"] = "[".$IntegratorsKey."]".$response->LoginResult->Accounts->Account->UserID;                
                                    ?>
                                        <script language="javascript">
                                            window.location = "home.php";
                                        </script>
                                    <?php
                            }
                            
                        } else {
                            AddToLog($_POST["email"]." login failed");
                            echo("<span style='color:red;'>Sorry, your username and/or password was incorrect.</span>");
                        }
                        
                        }
                    ?>
                    
                    <?php
                        if (!$flag) {
                    ?>
    
                    <p>Please
enter the email address and password for your Docusign account. You
will be prompted to select the account you wish to work with if your
email address and password match multiple accounts.</p>
                    
                    <label for="email">
                        <input name="email" tabindex="1" id="email" size="40" type="text">
                        Email:                    </label>
                    <label for="password">
                         <input name="password" tabindex="2" id="password" size="40" value="" type="password">
                         Password:                    </label>
                    <label for="submit">
                        <input name="Submit" id="submit" tabindex="4" value="Log in" type="submit">
                    </label>
                </fieldset>
                <?php } ?>
            </form>
        </div>
    
        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>