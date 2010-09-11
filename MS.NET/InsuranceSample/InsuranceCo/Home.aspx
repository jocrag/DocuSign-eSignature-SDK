<%@ Page Title="" Language="C#" MasterPageFile="~/DefaultPage.Master" AutoEventWireup="true"
    CodeBehind="Home.aspx.cs" Inherits="InsuranceCo.Home" %>

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
            <a href="AutoAppApply.aspx">Complete</a> an Application Today!</p>
    </div>
</asp:Content>
