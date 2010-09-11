<%@ Page Title="" Language="C#" MasterPageFile="~/FullNav.master" AutoEventWireup="true" CodeBehind="SigningReturn.aspx.cs" Inherits="LoanCo.SigningReturn" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <form id="form1" runat="server">
        <div class="content-section">
            The integrated signing has returned to the LoanCo.com.<br />
            <asp:Label ID="statusLabel" runat="server" Text="Label"></asp:Label>
            <p />
            <asp:Button ID="downloadPdf" runat="server" OnClick="downloadPdf_Click" Text="Download PDF" />
        </div>
    </form>
</asp:Content>
