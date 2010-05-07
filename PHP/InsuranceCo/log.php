<?php

function AddToLog($msg)
{
    $d =  date('d/m/Y H:i:s');
    $filename = 'InsuranceCo.log';
    $string = "[".$_SERVER['REMOTE_ADDR']."] - ".$d.": ".$msg ."\n";
    $fp = fopen($filename, 'a');
    fwrite($fp, $string);
    fclose($fp);
}
?>