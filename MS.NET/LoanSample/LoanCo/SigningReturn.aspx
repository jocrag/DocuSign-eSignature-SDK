<%@ Page Language="C#" AutoEventWireup="true" CodeFile="SigningReturn.aspx.cs" Inherits="SigningReturn" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Untitled Page</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form id="form1" runat="server">
        <table width="100%" style="height: 550px" border="0" cellspacing="0" cellpadding="0">
            <tr>                
                <td valign="top">
                    <div style="margin: 10px;">
                    <div class="content-section" style="line-height: 12px; margin:0px; padding:0px;">
                        The integrated signing has returned to the LoanCo.com.<br />
                        <asp:Label ID="statusLabel" runat="server" Text="Label"></asp:Label>
                        <p />
                        <asp:Button ID="downloadPdf" runat="server" OnClick="downloadPdf_Click" Text="Download PDF" /></div></div>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
