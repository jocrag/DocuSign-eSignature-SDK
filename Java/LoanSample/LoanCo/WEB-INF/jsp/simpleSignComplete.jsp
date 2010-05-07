<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"></meta>
    <title>Integrated ESIGN Experience with DocuSign, Inc. technology</title>
    <script language="javascript" type="text/javascript" src="static/js/jquery-1.4.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="static/js/webservice-status.js"></script>
    <link href="static/css/style.css" rel="stylesheet" type="text/css"></link>
  </head>
  <body>
    <div id="maincontainer">
      <div id="contentwrapper">
        <div id="contentcolumn">
          <div class="innertube">
            <div id="webserviceHeartbeat">
              <a href="logDump.do" target="_blank">
                <img src="static/images/script.png" style="border: 0px;" />
                <span style="font-size: 0.75em;">View LoanCo Event Log</span>
              </a>
              <br/>
              <img id="ws3_0_img" src="static/images/spinner.gif" />
              <span style="font-size: 0.75em;">(WS3_0 webservice)</span>
            </div>
            <div class="contentbarstart">&nbsp;</div>
            <div class="contentbarrepeat">&nbsp;</div>
            <div class="money-bar">
                <div class="money-repeat">&nbsp;</div>
            </div>
            <div class="full-content">
              <iframe src="<c:out value="${model.token}" />" scrolling="no" width="100%" height="100%" frameborder="0">
	          </iframe>
            </div>
          </div>
        </div>
      </div>
      <div id="leftcolumn">
        <div class="innertube">
          <div class="mortgage-co-logo"><img src="static/images/mortgageco-logo.png" /></div>
          <div class="menu"><div class="dotted-menu-item"><a class="menu-label" href="index.html">HOME</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-1.html">GET A LOAN!</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-2.html">HOW IT WORKS</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-3.html">MORTGAGE TOOLS</a></div>
            <div class="dotted-menu-item"><a class="menu-label" href="index-4.html">ABOUT US</a></div>
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