<%@ Page Title="" Language="C#" MasterPageFile="~/DefaultPage.Master" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="InsuranceCo.Login" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
        <div class="col1">
        <form  class="applicationForm" id="theForm" runat="server" action="Login.aspx">
        <!-- Login Panel  -->
            <asp:Panel ID="pnlEnterLogin" runat="server">
                <fieldset>
                <legend class="heading">Log In</legend>
                <p>Please enter the email address and password for your Docusign DevCenter account.</p> 
                <p>Don't have a DevCenter account? Go to the <a href="http://www.docusign.com/devcenter/sign_up/register.php" target="devcenter">DocuSign DevCenter</a> and get a free development account.</p>
                <asp:Label ID="lblLoginErrorMessage" runat="server" style="color:red;" Text=""></asp:Label>
                <label for="email">Email:<asp:TextBox ID="txtEmail" runat="server"></asp:TextBox></label>
                <label for="password">Password:<asp:TextBox TextMode="Password" ID="txtPassword" runat="server"></asp:TextBox></label>
                <label for="submit"><asp:Button ID="btnLogin" runat="server" Text="Log In" 
                        onclick="btnLogin_Click" /></label>
                </fieldset>
            </asp:Panel>
        <!-- Already Logged In Panel  -->
            <asp:Panel ID="pnlLoggedIn" runat="server">
                <fieldset>
	                <legend class="heading">Credentials</legend>
                    <label for="lblEmail">Email:<asp:Label ID="lblEmail" runat="server" Text=""></asp:Label></label>
				    <asp:Button ID="btnChangeLogin" runat="server" Text="Clear Credentials" 
                        onclick="btnChangeLogin_Click" /><br/>
                    <asp:Panel ID="pnlDisplayAccount" runat="server">
                        <label for="lblAccountName">Account:<asp:Label ID="lblAccountName" runat="server" Text=""></asp:Label></label>
                        <asp:Button ID="btnChangeAccount" runat="server" Text="Change Account" 
                            onclick="btnChangeAccount_Click" />
                    </asp:Panel>
                    <asp:Panel ID="pnlChangeAccount" runat="server">
                        <label for="ddlAccountSelect">Account:<asp:DropDownList ID="ddlAccountSelect" runat="server">
                        </asp:DropDownList></label>
                        <asp:Button ID="btnSelectAccount" runat="server" Text="Select Account" 
                            onclick="btnSelectAccount_Click" />
                    </asp:Panel>                   
                </fieldset>    
            </asp:Panel>	
        <!-- Template Select Panel  -->
            <asp:Panel ID="pnlManageTemplate" runat="server">
				<fieldset>
					<legend>Template</legend>
                    <asp:Panel ID="pnlTemplateCheckPending" runat="server">
						<p>Template will be checked when account is selected.</p>
                    </asp:Panel>
                    <asp:Panel ID="pnlTemplateExists" runat="server">
						<p>Your Account has the required Template.</p>
                    </asp:Panel>
                    <asp:Panel ID="pnlTemplateError" runat="server">
						<p><asp:Label ID="lblTemplateUploadError" runat="server" Text=""></asp:Label></p>
                    </asp:Panel>
                    <asp:Panel ID="pnlTemplateUpload" runat="server">
						<p>Your Account does not have the required Template. Click the Upload button to upload it to your account</p>
                        <asp:Button ID="btnUploadTemplate" runat="server" Text="Upload Template" 
                            onclick="btnUploadTemplate_Click" />
                    </asp:Panel>
                </fieldset>
            </asp:Panel>
            </form>
        </div>
</asp:Content>
