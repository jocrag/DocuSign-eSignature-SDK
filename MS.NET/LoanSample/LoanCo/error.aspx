<%@ Page Title="" Language="C#" MasterPageFile="~/FullNav.master" AutoEventWireup="true" CodeBehind="error.aspx.cs" Inherits="LoanCo.error" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
<div class="content-section">
    <p id="errorText" runat="server"></p>
    <asp:Panel ID="pnlGetCreds" runat="server" CssClass="CredsMissingDiv" Visible="false">
        <p>This sample requires DocuSign DevCenter credentials to be entered in the Web.Config file in order to function.</p>
        <p>Don't have a DevCenter account? Go to the <a href="http://www.docusign.com/devcenter/sign_up/register.php" target="devcenter">DocuSign DevCenter</a> and get a free development account.</p>
                
    </asp:Panel>
</div>
</asp:Content>
