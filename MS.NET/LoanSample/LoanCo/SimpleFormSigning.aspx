<%@ Page Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="SimpleFormSigning.aspx.cs" Inherits="SimpleFormSigning" Title="Untitled Page" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"></meta>
    <title>Integrated ESIGN Experience with DocuSign, Inc. technology</title>
    <script language="javascript" type="text/javascript" src="js/jquery-1.4.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/webservice-status.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css"></link>

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
            <div class="full-content">
              <iframe frameborder="0" width="100%" height="550px" id="frame1" runat="server">
    		    </iframe>
            </div>
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
</asp:Content>
