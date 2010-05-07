<?php
$f1 = false;
$f2 = false;

try {
        include("Envelope.php");
        $client = new SoapClient("https://demo.docusign.net/API/3.0/Credential.asmx?WSDL");
        $arr = array();
        $response = $client->Ping($arr);        
        if ($response->PingResult=="1") $f1 = true;        
    } catch (Exception $e) {        
        echo($e);
    }
    

try {
    
        $ini_array = parse_ini_file("Credentials.ini");
        $username = $ini_array["APIUserEmail"];
        $password = $ini_array["Password"];
        $IntegratorsKey = $ini_array["IntegratorsKey"];
        
        $client = new SoapClient("https://demo.docusign.net/API/3.0/Credential.asmx?WSDL");
        $arr = array("Email" => "[".$IntegratorsKey."]".$username, "Password" => $password);
        $response = $client->Login($arr);
        if ($response->LoginResult->AuthenticationMessage=="Successful authentication") $f2 = true;
} catch (Exception $e) {        
        echo($e);
    }
    
    if ($f1 && $f2) echo("true");
?>