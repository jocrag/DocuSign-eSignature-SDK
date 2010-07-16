<%@ Page Title="" Language="C#" MasterPageFile="~/HeaderOnly.Master" AutoEventWireup="true" CodeBehind="EmbeddedHost.aspx.cs" Inherits="InsuranceCo.EmbeddedHost" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div>
		<iframe id="hostiframe" class="hostiframe" src="" runat="server"/>
    </div>
</asp:Content>
