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
    $ini_array = parse_ini_file("Credentials.ini");    
    $APIUrl = $ini_array["APIUrl"];
    include("log.php");

    if (!isset($_SESSION["OPENED_SITE"])) AddToLog("Open site");

    $_SESSION["OPENED_SITE"] = "1";
    
    if ($_SESSION["DS_LOGED"]) {
        if($_SESSION["DS_LOGED"]=="1") {
            
        } else {header( 'Location: login.php' ) ; }
    } else {header( 'Location: login.php' ) ; }
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
                <h1>Status - Automobile Insurance Application</h1>
                <?php
                    try {
                                                
                        
                        $config = array("userId" => $_SESSION["UserID"], "password" => $_SESSION["password"], "accountId" => $_SESSION["AccountID"], "subject" => "These are the documents you requested!", "blurb" => "We need your signature to move forward.");
                        $envelope = new Docusign_Envelope($APIUrl."?wsdl", $config);
                        $envelope->AccountId = $config['accountId'];
                        $envelope->Subject = $config['subject'];
                        $envelope->EmailBlurb = $config['blurb'];
                        
                        $RequestStatusesParams = array();
                        
                        $RequestStatusesParams["EnvelopeStatusFilter"]["UserInfo"]["UserName"] = $_SESSION["UserName"];
                        $RequestStatusesParams["EnvelopeStatusFilter"]["UserInfo"]["Email"] = $_SESSION["email"];
                        $RequestStatusesParams["EnvelopeStatusFilter"]["AccountId"] = $_SESSION["AccountID"];
                        $RequestStatusesParams["EnvelopeStatusFilter"]["Statuses"]["Status"] = "Any";
                        
                        
                        try {
                        $Envelopes = $envelope->RequestStatuses($RequestStatusesParams);
                        } catch( SoapFault $fault) {
            
                            $pos = strpos($fault, "\n");
                            ?>
                                <script language="javascript" >
                                    alert("Something is wrong : +<?php echo(str_replace("\n","\\n",$fault)); ?>");
                                    window.location = "home.php";
                                </script>
                                
                            <?php
                            die(1);
                        }
                        
                        //$TmplParam = array();
                        //$TmplParam["AccountID"] = $_SESSION["AccountID"];
                        //$Tmlp = $envelope->RequestTemplates($TmplParam);
                        //print_r($Tmlp);
                        
                    } catch( SoapFault $fault) {
    
                        echo $fault;
                        die(1);
                    }
                ?>
                <table class="dataTable">
                    <thead>
                        <tr>
                            <th align="left">Envelope Id</th>
                            <th align="left">Application Type</th>
                            <th align="left">Application Status</th>
                        </tr>
                    </thead>
                    <tbody>
                    <?php
                        foreach ($Envelopes->RequestStatusesResult->EnvelopeStatuses->EnvelopeStatus as $EnvelopeStatusResult) {
                            if ($EnvelopeStatusResult->Subject == "Automobile Insurance Application") {
                    ?>
                                                <tr>
                            <td align="left"><?php echo($EnvelopeStatusResult->EnvelopeID);?></td>
                            <td align="left">Autombile Insurance Rider</td>
                            <td align="left"><?php echo($EnvelopeStatusResult->Status);?></td>
                        </tr>
                            <?php
                            }
                        }                            
                            ?>                    
                                            </tbody>
                </table>
            </span>
        </div>
    
        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>