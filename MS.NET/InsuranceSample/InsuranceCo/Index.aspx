<%@ Page Title="" Language="C#" MasterPageFile="~/DefaultPage.Master" AutoEventWireup="true"
    CodeBehind="Index.aspx.cs" Inherits="InsuranceCo.Index" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div class="allColAlignment">
        <img src="images/car.png">
    </div>
    <div class="textBlock">
        <h3>
            Automobile Insurance</h3>
        <p>
            Here at InsuranceCo we're ready to keep you safe in the car of your dreams even
            if that car isn't what you pictured. With our plan the choice of coverage is entirely
            up to you. We want to keep you as safe as possible while staying within your budget.</p>
        <p>
            <a href="Login.aspx">Login</a> to apply.
        </p>
    </div>
</asp:Content>
