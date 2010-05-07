<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Status.aspx.cs" Inherits="Sender.Status" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title>Status</title>
    <link href="Styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form id="form1" runat="server">
     <div class="TopHeader">
        <div id="TopRightHeader">
            <asp:Label ID="lblUser" runat="server"></asp:Label> | <asp:LinkButton ID="btnLogout"
                Text="logout" runat="server" CausesValidation="false" OnClick="btnLogout_Click" />
        </div>
    </div>
        <div class="CreateEnvelope" style="margin:10px">
            <a href="CreateEnvelope.aspx">Create a new Envelope</a>
        </div>
    <div id="createEnvelopeWrapper">
        <div class="topRight">
            <div class="bottomLeft">
                <div class="bottomRight">
                    <div id="CreateEnvelopeStatusContainer">
                        <div class="statusContent">
                             <b class="b1f"></b><b class="b2f"></b><b class="b3f"></b><b class="b4f"></b> 
                            <div class="heading">Envelope Status</div>
                            <div class="login" style="padding:25px">
                         <asp:Button ID="btnUpdateStatus" runat="server" Text="Update Envelope Status"
                            OnClick="btnUpdateStatus_Click" />
                        <asp:Button ID="btnRequestPDF" runat="server" Text="Request PDF"
                            OnClick="btnRequestPDF_Click" />
                        <asp:Button ID="btnVoidEnvelope" runat="server" Text="Void Envelope"
                            OnClick="btnVoidEnvelope_Click" />
                        <br /><br />
                        <asp:Label ID="lblErrorMsg" runat="server" Visible="false" ForeColor="Red"></asp:Label>
                        <table>
                            <tr>
                                <td>
                                    Time Generated
                                </td>
                                <td>
                                    <asp:Literal ID="litTimeGenerated" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Envelope ID
                                </td>
                                <td>
                                    <asp:Literal ID="litEnvelopeID" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Subject
                                </td>
                                <td>
                                    <asp:Literal ID="litSubject" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    UserName
                                </td>
                                <td>
                                    <asp:Literal ID="litUserName" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Email
                                </td>
                                <td>
                                    <asp:Literal ID="litEmail" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Status
                                </td>
                                <td>
                                    <asp:Literal ID="litStatus" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Created
                                </td>
                                <td>
                                    <asp:Literal ID="litCreated" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Sent
                                </td>
                                <td>
                                    <asp:Literal ID="litSent" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    ACStatus
                                </td>
                                <td>
                                    <asp:Literal ID="litACStatus" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    ACStatusDate
                                </td>
                                <td>
                                    <asp:Literal ID="litACStatusDate" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    ACHolder
                                </td>
                                <td>
                                    <asp:Literal ID="litACHolder" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    ACHolderEmail
                                </td>
                                <td>
                                    <asp:Literal ID="litACHolderEmail" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    ACHolderLocation
                                </td>
                                <td>
                                    <asp:Literal ID="litACHolderLocation" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    SigningLocation
                                </td>
                                <td>
                                    <asp:Literal ID="litSigningLocation" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    SenderIPAddress
                                </td>
                                <td>
                                    <asp:Literal ID="litSenderIPAddress" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    EnvelopePDFHash
                                </td>
                                <td>
                                    <asp:Literal ID="litEnvelopePDFHash" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    AutoNavigation
                                </td>
                                <td>
                                    <asp:Literal ID="litAutoNavigation" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    EnvelopeIdStamping
                                </td>
                                <td>
                                    <asp:Literal ID="litEnvelopeIdStamping" runat="server"></asp:Literal>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    AuthoritativeCopy
                                </td>
                                <td>
                                    <asp:Literal ID="litAuthoritativeCopy" runat="server"></asp:Literal>
                                </td>
                            </tr>
                        </table></div></div>
                    </div>
                </div>
            </div>
        </div>
 
    </div>
       
    <div id="copyrightwrapper">
        <div id="copyrights" style="top:20px">
            Copyright &copy; DocuSign</div>
    </div>
    </form>
</body>
</html>
