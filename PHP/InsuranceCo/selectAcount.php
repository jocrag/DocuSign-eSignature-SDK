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
    session_start();
    include("Envelope.php");    
    if ((isset($_SESSION["password"])) && (isset($_SESSION["email"]))) {            
            $AcountNum = $_GET["num"];
            $admin_mail = $_SESSION["email"];
            $admin_pass = $_SESSION["password"];
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
            if ($response->LoginResult->Success == "1") {
                $ini_array = parse_ini_file("Credentials.ini");
                $IntegratorsKey = $ini_array["IntegratorsKey"];
                $APIUrl = $ini_array["APIUrl"];
                
                $_SESSION["DS_LOGED"] = "1";
                $_SESSION["AccountID"] = $response->LoginResult->Accounts->Account[$AcountNum]->AccountID;
                $_SESSION["AccountName"] = $response->LoginResult->Accounts->Account[$AcountNum]->AccountName;
                $_SESSION["UserName"] = $response->LoginResult->Accounts->Account[$AcountNum]->UserName;
                $_SESSION["email"] = $response->LoginResult->Accounts->Account[$AcountNum]->Email;
                $_SESSION["UserID"] = "[".$IntegratorsKey."]".$response->LoginResult->Accounts->Account[$AcountNum]->UserID;                
                header('Location: home.php');
            } else {
                header( 'Location: index.php');
            }            
    }
?>