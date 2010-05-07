<?php
session_start();
include("log.php");

if (!isset($_SESSION["OPENED_SITE"])) AddToLog("Open site");

$_SESSION["OPENED_SITE"] = "1";
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"></meta>
    <title>DocuSign, Inc. ESIGN Sample</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"></link>
    <script language="javascript" type="text/javascript" src="js/jquery-1.4.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/webservice-status.js"></script>
    <script language="javascript" type="text/javascript" src="js/validation.js"></script>
    <script language="javascript" type="text/javascript">
    <!-- 
    
    /**
     * Validation the form and set validation errors if applicable.
     */
    function checkForm() {
        var why = "";
        
        var signForm = document.forms[0];
        
        why += isEmpty(signForm.FirstName.value, "FirstName");
        why += isEmpty(signForm.LastName.value, "LastName");
        why += isEmpty(signForm.AddressLine1.value, "AddressLine1");
        why += isEmpty(signForm.City.value, "City");
        why += isEmpty(signForm.State.value, "State");
        why += isEmpty(signForm.Zip.value, "ZIP");
        why += checkPhone(signForm.HomePhone.value, "Phone");
        why += checkEmail(signForm.eMail.value, "E-mail" );
            
        document.getElementById("formErrorText").innerHTML = why;

        if (why != "") {
            return false;
        }
        else {
            return true;
        }
    }
    
    // -->
    </script>
  </head>
  <body>
    <div id="maincontainer">
      <div id="contentwrapper">
        <div id="contentcolumn">
          <div class="innertube">
            <div id="webserviceHeartbeat">
              <a href="LoanCo.log" target="_blank">
                <img src="images/script.png" style="border: 0px;" />
                <span style="font-size: 0.75em;">View LoanCo Event Log</span>
              </a>
              <br/>
              <img id="ws3_0_img" src="images/spinner.gif" />
              <span style="font-size: 0.75em;">(WS3_0 webservice)</span>
            </div>
            <div class="contentbarstart">&nbsp;</div>
            <div class="contentbarrepeat">&nbsp;</div>
            <div class="money-bar">
                <div class="money-repeat">&nbsp;</div>
            </div>
              <form style="margin: 0; padding: 0;" action="simpleSign.php" id="signForm" method="post" onsubmit="return checkForm();">
                <div class="content-section">
                    <div id="formErrorText" class="red"></div>
                    First Name<br />
                    <input class="form" style="width: 300px;" name="FirstName" type="text" /><br />
                    Last Name<br />
                    <input class="form" style="width: 300px;" name="LastName" type="text" /><br />
                    Current Address<br />
                    <input class="form" style="width: 300px;" name="AddressLine1" type="text" /><br />
                    <input class="form" style="width: 300px;" name="AddressLine2" type="text" /><br />
                    City/State/ZIP<br />
                    <input class="form" style="width: 170px;" name="City" type="text" />
                    <select class="form" style="width: 50px;" id="Select1" name="State">
                        <option value="AL">AL</option>
                        <option value="AK">AK</option>
                        <option value="AZ">AZ</option>
                        <option value="AR">AR</option>
                        <option value="CA">CA</option>
                        <option value="CO">CO</option>
                        <option value="CT">CT</option>
                        <option value="DE">DE</option>
                        <option value="DC">DC</option>
                        <option value="FL">FL</option>
                        <option value="GA">GA</option>
                        <option value="HI">HI</option>
                        <option value="ID">ID</option>
                        <option value="IL">IL</option>
                        <option value="IN">IN</option>
                        <option value="IA">IA</option>
                        <option value="KS">KS</option>
                        <option value="KY">KY</option>
                        <option value="LA">LA</option>
                        <option value="ME">ME</option>
                        <option value="MD">MD</option>
                        <option value="MA">MA</option>
                        <option value="MI">MI</option>
                        <option value="MN">MN</option>
                        <option value="MS">MS</option>
                        <option value="MO">MO</option>
                        <option value="MT">MT</option>
                        <option value="NE">NE</option>
                        <option value="NV">NV</option>
                        <option value="NH">NH</option>
                        <option value="NJ">NJ</option>
                        <option value="NM">NM</option>
                        <option value="NY">NY</option>
                        <option value="NC">NC</option>
                        <option value="ND">ND</option>
                        <option value="OH">OH</option>
                        <option value="OK">OK</option>
                        <option value="OR">OR</option>
                        <option value="PA">PA</option>
                        <option value="RI">RI</option>
                        <option value="SC">SC</option>
                        <option value="SD">SD</option>
                        <option value="TN">TN</option>
                        <option value="TX">TX</option>
                        <option value="UT">UT</option>
                        <option value="VT">VT</option>
                        <option value="VA">VA</option>
                        <option value="WA">WA</option>
                        <option value="WV">WV</option>
                        <option value="WI">WI</option>
                        <option value="WY">WY</option>
                    </select>
                    <input class="form" style="width: 40px;" name="Zip" type="text" /><br />
                    Phone<br />
                    <input class="form" style="width: 170px;" name="HomePhone" type="text" /><br />
                    E-mail address<br />
                    <input class="form" style="width: 170px;" name="eMail" type="text" /><br />
                    <div style="margin-left: 230px;">
                        <input type="submit" style="background: url(images/apply.png); width:76px; height:23px; border: 0;" value="" />
                        <br />
                    </div>
                </div>
              </form>
            </div>
        </div>
      </div>
      <div id="leftcolumn">
        <div class="innertube">
          <div class="mortgage-co-logo"><img src="images/mortgageco-logo.png" /></div>
          <div class="menu"><div class="dotted-menu-item"><a class="menu-label" href="index.php">HOME</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-1.php">GET A LOAN!</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-2.php">HOW IT WORKS</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-3.php">MORTGAGE TOOLS</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-4.php">ABOUT US</a></div>
          </div>
          <div class="menu-border">&nbsp;</div>
          <div class="year30">&nbsp;</div>
          <div class="year15">&nbsp;</div>
          <div class="arm51">&nbsp;</div>
          <div class="esign-banner"><a href="#">&nbsp;</a></div>
        </div>
      </div>
      
      <div id="footer">&nbsp;</div>
    </div>
  </body>
</html>