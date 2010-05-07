<?php
session_start();
$f1 = false;
$f2 = false;
$webserviceType = $_REQUEST['webservice'];
if ( $webserviceType == "credential") {
try {
        include("Envelope.php");
        $client = new SoapClient("https://demo.docusign.net/API/3.0/Credential.asmx?WSDL");
        $arr = array();
        $response = $client->Ping($arr);    
        if ($response->PingResult=="1") echo("true");    
    } catch (Exception $e) {        
        echo($e);
    }
} else {
try {
    
        $ini_array = parse_ini_file("Credentials.ini");
        $IntegratorsKey = $ini_array["IntegratorsKey"];
        $username = $_SESSION["email"];
        $password = $_SESSION["password"];
        
        $client = new SoapClient("https://demo.docusign.net/API/3.0/Credential.asmx?WSDL");
        $arr = array("Email" => "[".$IntegratorsKey."]".$username, "Password" => $password);
        $response = $client->Login($arr);
        if ($response->LoginResult->AuthenticationMessage=="Successful authentication") $f2 = true;
} catch (Exception $e) {        
        echo($e);
    }

if ($f2) echo("true");
}
?>