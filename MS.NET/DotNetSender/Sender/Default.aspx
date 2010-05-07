<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="Sender._Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title>Docusign sender application Login</title>
    <link href="Styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form id="form1" runat="server">
    <div id="wrapper">
        <div class="topRight">
            <div class="bottomLeft">
                <div class="bottomRight">
                    <div id="loginForm">
                        <b class="b1f"></b><b class="b2f"></b><b class="b3f"></b><b class="b4f"></b> 
                        <asp:Panel ID="pnlLogin" runat="server">
                            <div class="heading">
                                Login with your DocuSign account credentials
                            </div>
                            <div class="login">
                                <ul>
                                    <li><span class="formFields">UserName:</span><asp:TextBox ID="tbUserName" runat="server"
                                        CssClass="fieldButton"></asp:TextBox></li>
                                    <li><span class="formFields passField">Password:</span><asp:TextBox ID="tbPassword"
                                        TextMode="Password" runat="server" CssClass="fieldButton"></asp:TextBox></li>
                                </ul>
                                 <div style="text-align:center"><asp:Label ID="lblStatusMsg" runat="server"></asp:Label></div>
                                <div>
                                       <asp:Button ID="btnLogin" runat="server" Text="Login" OnClick="btnLogin_Click" />
                                </div>
                                <p class="content">
                                   <b>Note:</b> If you have multiple accounts, you can choose which one will be doing the sending
                                </p>
                            </div>
                        </asp:Panel>
                        <asp:Panel ID="pnlSelectAccount" runat="server" Visible="false">
                            <span class="heading" style="display:block;margin-left:0;width:100%">Select the Account</span>
                            <asp:GridView Width="100%" ID="gvAccounts" runat="server" AutoGenerateColumns="false" BackColor="#ffffff"
                                BorderColor="#dddddd" BorderWidth="1px" BorderStyle="solid" CellPadding="4" ForeColor="Black" GridLines="None">
                                <Columns>
                                    <asp:BoundField DataField="AccountName" HeaderText="AccountName" />
                                    <asp:BoundField DataField="Email" HeaderText="Email" />
                                    <asp:BoundField DataField="UserName" HeaderText="UserName" />
                                    <asp:CommandField ShowSelectButton="True" />
                                </Columns>
                                <FooterStyle BackColor="#dddddd" />
                                <PagerStyle BackColor="PaleGoldenrod" ForeColor="DarkSlateBlue" HorizontalAlign="Center" />
                                <SelectedRowStyle BackColor="DarkSlateBlue" ForeColor="GhostWhite" />
                                <HeaderStyle BackColor="#DDDDDD" Font-Bold="True" />
                                <AlternatingRowStyle BackColor="white" />
                            </asp:GridView>
                        </asp:Panel>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="copyrightwrapper">
        <div id="copyrights">
            Copyright &copy; DocuSign</div>
    </div>
    </form>
</body>
</html>
