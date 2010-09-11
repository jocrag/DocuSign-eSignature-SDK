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
// redirect to setup page if we aren't logged in
loginCheck("../login.php");

?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>

    
        <title>InsuranceCo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
        <script type="text/javascript" src="scripts/webservice-status.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="autoAppApply_files/jquery-1.htm"></script>
        <script type="text/javascript" src="autoAppApply_files/util.htm"></script>
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
                <h1>Automobile Insurance Application</h1>
                <?php
                    $id = $_GET["id"];
                    $msg = "";
                    if ($id==10) $msg = "Signing Status:     Application was sent successfully.";
                    if ($id==9) $msg = "Signing Status:     Application was signed successfully. You are now insured!";
                    if ($id==3) $msg = "Signing Status:   Application was not signed successfully because it has been cancelled. ";
                    if ($id==4) $msg = "Signing Status:   Application was not signed successfully because it was declined. ";
                    if ($id==5) $msg = "Signing Status:   Application was not signed successfully due to a session timeout. ";
                    if ($id==6) $msg = "Signing Status:   Application was not signed successfully due to an expired Time-To-Live. ";
                    if ($id==7) $msg = "Signing Status:   Application was not signed successfully due to an exception that occured. ";
                    if ($id==8) $msg = "Signing Status:   Application was not signed successfully due to an Access Code Failure. ";
                    if ($id==2) $msg = "Signing Status:   Application has been viewed, but has not yet been completed. ";
                    if ($id==1) $msg = "Signing Status:   Application was not signed successfully due to an Id Check Failure. ";
                    echo($msg);
                ?>                                
            </span>
        </div>
    
        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>