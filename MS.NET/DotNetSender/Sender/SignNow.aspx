<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="SignNow.aspx.cs" Inherits="Sender.SignNow" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Sign Now</title>
    <link href="Styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
     <div class="TopHeader">
        <div id="TopRightHeader">
            <asp:Label ID="lblUser" runat="server"></asp:Label> | <asp:LinkButton ID="btnLogout"
                Text="logout" runat="server" CausesValidation="false" OnClick="btnLogout_Click" />
        </div>
    </div>
    <div id="wrapper" style="height:0px">
      <asp:Panel ID="pnlExternalAuth" runat="server">
            <div id="loginForm">
             <b class="b1f"></b><b class="b2f"></b><b class="b3f"></b><b class="b4f"></b> 
                <div class="heading">
                    Login with Google Account
                </div>
                <div class="login">
                <ul>
                    <li><span class="formFields">UserName:</span><asp:TextBox ID="tbExternalUserName"
                        runat="server" CssClass="fieldButton"></asp:TextBox></li>
                    <li><span class="formFields passField">Password:</span><asp:TextBox ID="tbExternalPassword"
                        TextMode="Password" runat="server" CssClass="fieldButton"></asp:TextBox></li>
                </ul>
                <div>
                      <asp:Image ID="imgCaptcha" runat="server" Visible="false" />
                        <span class="formFields"></span>
                        <asp:TextBox ID="tbCaptcha"
                            runat="server" Visible="false" CssClass="fieldButton"></asp:TextBox>
                </div>
                <div style="text-align:center">
                     <asp:Label ID="lblExternalAuthStatusMsg" runat="server"></asp:Label>
                </div>
                 <div>
                    <asp:Button ID="btnExternalLogin" runat="server" Text="Login" OnClick="btnExternalLogin_Click" />
                </div>
               </div>
            </div>
           </asp:Panel>    </div>
           <asp:Panel ID="pnlEmbeddedSigning" runat="server" Visible="false">
            <iframe frameborder="0" width="100%" height="1000" scrolling="auto" id="frameEmbeddedSigning" runat="server">
            </iframe>
        </asp:Panel>
    </div>
    </form>
</body>
</html>
