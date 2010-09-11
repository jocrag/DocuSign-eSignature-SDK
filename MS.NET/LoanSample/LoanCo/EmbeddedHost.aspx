<%@ Page Title="" Language="C#" MasterPageFile="~/HeaderOnly.master" AutoEventWireup="true" CodeBehind="EmbeddedHost.aspx.cs" Inherits="LoanCo.embeddedhost" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <form id="form1" name="form1" runat="server">
    <iframe class="embedHostFrame" id="hostframe" runat="server" ></iframe>
    </form>
</asp:Content>
