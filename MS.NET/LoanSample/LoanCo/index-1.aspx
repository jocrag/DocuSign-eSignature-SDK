<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
    <title>Fill out an application - Contact - DocuSign, Inc. ESIGN Sample</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"></link>
    <script language="javascript" type="text/javascript" src="js/jquery-1.4.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/webservice-status.js"></script>
    <script language="javascript" type="text/javascript" src="js/validation.js"></script>
    <script language="javascript" type="text/javascript">
    <!-- 
    function checkForm() {
        var why = "";

        var signForm = document.getElementById("signForm");
        
        why += isEmpty(signForm.FullName.value, "FullName");
        why += checkPhone(signForm.Phone.value, "Phone");
        why += checkFloat(signForm.Amount.value, "Amount");
        why += checkEmail(signForm.EMail.value, "E-mail" );
                
        document.getElementById("formErrorText").innerHTML = why; 
        
        if (why != "") {
            return false;
        } else {
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
              <img id="ws3_0_img" src="images/spinner.gif" />
              <span style="font-size: 0.75em;">(WS3_0 webservice)</span>
            </div>
            <div class="contentbarstart">&nbsp;</div>
            <div class="contentbarrepeat">&nbsp;</div>
            <div class="money-bar">
              <div class="money-repeat">&nbsp;</div>
            </div>
            <form action="AnchorBasedForm.aspx" id="signForm" method="post" onsubmit="return checkForm();">
              <div class="content-section">
                <div id="formErrorText" class="red"></div>
                <table style="width: 420px;">
                  <tbody>
                    <tr>
                      <td colspan="2"><strong>Loan Information:</strong></td>
                    </tr>
	                <tr>
	                  <td>Desired loan amount:</td>
	                  <td><input type="text" class="form" name="Amount" /></td>
	                </tr>
	                <tr>
	                  <td>If refinance, why:</td>
	                  <td>
	                    <select class="form" name="LoanPdf">
	                      <option selected>Loan 1</option>
	                      <option selected>Loan 2</option>
	                    </select>
	                  </td>
	                </tr>
	                <tr><td>&nbsp;</td></tr>
                    <tr>
                      <td colspan="2"><strong>Contact Information:</strong></td>
                    </tr>
                    <tr>
                      <td>Enter your full name here:</td>
                      <td><input type="text" class="form" style="width: 150px;" name="FullName" /></td>
                    </tr>
                    <tr>
                      <td>Enter your e-mail address:</td>
                      <td><input type="text" class="form" style="width: 150px;" name="EMail" /></td>
                    </tr>
                    <tr>
                      <td>Your phone number here:</td>
                      <td><input type="text" class="form" style="width: 150px;" name="Phone" /></td>
                    </tr>
                    <tr><td>&nbsp;</td></tr>
                    <tr>

                      <td colspan="2" align="right"><input type="image" src="images/send.jpg" style="border: 0px; margin-right: 52px;" /></td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div id="leftcolumn">
        <div class="innertube">
          <div class="mortgage-co-logo"><img src="images/mortgageco-logo.png" /></div>
          <div class="menu"><div class="dotted-menu-item"><a class="menu-label" href="index.aspx">HOME</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-1.aspx">GET A LOAN!</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-2.aspx">HOW IT WORKS</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-3.aspx">MORTGAGE TOOLS</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-4.aspx">ABOUT US</a></div>
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