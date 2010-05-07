<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="SigningComplete.aspx.cs"
    Inherits="Sender.SigningComplete" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Signing Complete</title>
    <link href="Styles.css" rel="stylesheet" type="text/css" />
</head>
<body style="background-color: Transparent; color: #000000">
    <form id="form1" runat="server">
    <div style="float:left;margin:10px">
        <asp:Label ID="lblMessage" runat="server"></asp:Label>
    <asp:Button ID="btnRequestPDF" Text="Download Document" runat="server"
        OnClick="btnRequestPDF_Click" />
    </div>
    <div class="CreateEnvelope">
        <a href="javascript:window.open('CreateEnvelope.aspx','_parent');" >Create a new Envelope</a>
    </div>
    </form>
</body>
</html>
