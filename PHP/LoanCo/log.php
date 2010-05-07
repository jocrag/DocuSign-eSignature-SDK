<?php

function AddToLog($msg)
{
    $d =  date('d/m/Y H:i:s');
    $filename = 'LoanCo.log';
    $string = "[".$_SERVER['REMOTE_ADDR']."] - ".$d.": ".$msg ."\n";
    $fp = fopen($filename, 'a');
    fwrite($fp, $string);
    fclose($fp);
}
?>