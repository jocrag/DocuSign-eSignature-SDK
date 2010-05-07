<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="CreateEnvelope.aspx.cs"
    Inherits="Sender.CreateEnvelope" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title>Create and Send Envelope</title>
    <link href="Styles.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" language="javascript">
        //Trim the input text
        function Trim(input) {
            var lre = /^\s*/;
            var rre = /\s*$/;
            input = input.replace(lre, "");
            input = input.replace(rre, "");
            return input;
        }

        // filter the files before Uploading for PDF or DPD file only  
        function CheckForFileExtension() {
            var file = document.getElementById('<%=file.ClientID%>');
            var fileName = file.value;
            //Checking for file browsed or not 
            if (Trim(fileName) == '') {
                alert("Please select a file to upload!!!");
                file.focus();
                return false;
            }

            //Setting the extension array for diff. type of text files 
            var extArray = new Array(".pdf", ".dpd");

            //getting the file name
            while (fileName.indexOf("\\") != -1)
                fileName = fileName.slice(fileName.indexOf("\\") + 1);

            //Getting the file extension                     
            var ext = fileName.slice(fileName.indexOf(".")).toLowerCase();

            //matching extension with our given extensions.
            for (var i = 0; i < extArray.length; i++) {
                if (extArray[i] == ext) {
                    return true;
                }
            }
            alert("Please only upload files that end in types:  "
           + (extArray.join("  ")) + "\nPlease select a new "
           + "file to upload and submit again.");
            file.focus();
            return false;
        }    
    </script>

</head>
<body>
    <form id="form1" runat="server">
    <div class="TopHeader">
        <div id="TopRightHeader">
            <asp:Label ID="lblUser" runat="server"></asp:Label>
            |
            <asp:LinkButton ID="btnLogout" Text="logout" runat="server" CausesValidation="false"
                OnClick="btnLogout_Click" />
        </div>
    </div>
    <div id="createEnvelopeWrapper">
        <div class="topRight">
            <div class="bottomLeft">
                <div class="bottomRight">
                    <div id="CreateEnvelopeContainer">
                        <asp:Panel ID="pnlForm" runat="server">
                            <b class="b1f"></b><b class="b2f"></b><b class="b3f"></b><b class="b4f"></b>
                            <div id="EnvelopeForm">
                                <div class="heading">
                                    Create your new signing request</div>
                                <div class="login" style="padding: 25px">
                                    <p>
                                        <label for="subject">
                                            Subject:
                                        </label>
                                        <br />
                                        <asp:TextBox CssClass="fieldButton" ID="tbSubject" runat="server" /><asp:RequiredFieldValidator
                                            ID="rfvSubject" runat="server" ValidationGroup="createEnvelopeFormFields" ControlToValidate="tbSubject"
                                            Display="None" ErrorMessage="Subject is required"></asp:RequiredFieldValidator>
                                    </p>
                                    <p>
                                        <br />
                                        <label for="emailBlurb">
                                            Email Blurp:
                                        </label>
                                        <br />
                                        <asp:TextBox CssClass="fieldButton" ID="tbEmailBlurb" runat="server" TextMode="MultiLine"
                                            Rows="8" Columns="40" /><asp:RequiredFieldValidator ID="rfvEmail" runat="server"
                                                ValidationGroup="createEnvelopeFormFields" ControlToValidate="tbEmailBlurb" Display="None"
                                                ErrorMessage="Email Blurp is required"></asp:RequiredFieldValidator></p>
                                    <br />
                                    <label>
                                        File to sign</label><br />
                                    <asp:FileUpload ID="file" runat="server" EnableViewState="true" />
                                    <asp:Label ID="lblFile" runat="server" Visible="false"></asp:Label>
                                    <br />
                                    <asp:Button ID="btnUpload" runat="server" Text="Upload" OnClientClick="return CheckForFileExtension();"
                                        OnClick="btnUpload_Click" />
                                    <br />
                                    <br />
                                    <div>
                                        <b class="formFields">Add Recipients:</b><br />
                                        <asp:GridView ID="gvRecipients" runat="server" AutoGenerateColumns="False" BackColor="White"
                                            BorderColor="#DEDFDE" BorderStyle="solid" BorderWidth="1px" CellPadding="4" ForeColor="Black"
                                            GridLines="Vertical">
                                            <RowStyle BackColor="#ffffff" BorderColor="#DEDFDE" BorderStyle="Solid" BorderWidth="1px" />
                                            <Columns>
                                                <asp:BoundField DataField="Email" HeaderText="Email" />
                                                <asp:BoundField DataField="UserName" HeaderText="User Name" />
                                                <asp:BoundField DataField="RoleName" HeaderText="Role" />
                                                <asp:CommandField ShowDeleteButton="True" />
                                            </Columns>
                                            <FooterStyle BackColor="#CCCC99" />
                                            <PagerStyle BackColor="#DEDFDE" ForeColor="Black" HorizontalAlign="Right" />
                                            <SelectedRowStyle BackColor="#CE5D5A" Font-Bold="True" ForeColor="White" />
                                            <HeaderStyle BackColor="#585858" Font-Bold="True" ForeColor="White" />
                                            <AlternatingRowStyle BackColor="White" />
                                        </asp:GridView>
                                        <div id="recipientsContainer">
                                            <div class="recipients">
                                                <span class="lblEmail">Email:</span>
                                                <asp:TextBox CssClass="fieldButton" ID="tbEmail" runat="server" />
                                                <asp:RequiredFieldValidator ID="rfvRecipientEmail" runat="server" ValidationGroup="Recipient"
                                                            ControlToValidate="tbEmail" Display="None" ErrorMessage="Recipient's email should be entered"></asp:RequiredFieldValidator>
                                                <span class="lblUsername">Username:</span>
                                                <asp:TextBox CssClass="fieldButton" ID="tbUserName" runat="server" />
                                                <asp:RequiredFieldValidator ID="rfvRecipientName" runat="server" ValidationGroup="Recipient"
                                                            ControlToValidate="tbUserName" Display="None" ErrorMessage="Recipient's user name should be entered"></asp:RequiredFieldValidator>
                                                <asp:Label ID="lblRole" runat="server" CssClass="lblUsername" Visible="false" Text="Role"></asp:Label>
                                                <asp:DropDownList ID="ddlRole" runat="server" Visible="false">
                                                </asp:DropDownList>
                                                <div id="divIDCheck">
                                                    <asp:CheckBox ID="cbIdCheck" runat="server" Text="Enable ID Check" />
                                                </div>
                                                <div id="divAccessCode">
                                                    <asp:CheckBox ID="cbAccessCode" runat="server" Text="Enable Access Code" AutoPostBack="true"
                                                        OnCheckedChanged="cbAccessCode_CheckedChanged" />
                                                    <asp:Panel ID="pnlAccessCode" runat="server" CssClass="AccessCodeContainer" Visible="false">
                                                        <span class="lblEmail">Access Code:</span>
                                                        <asp:TextBox ID="tbAccessCode" runat="server"></asp:TextBox>
                                                        <asp:RequiredFieldValidator ID="rfvAccessCode" runat="server" ValidationGroup="Recipient"
                                                            ControlToValidate="tbAccessCode" Display="None" ErrorMessage="Access Code should be entered"></asp:RequiredFieldValidator>
                                                    </asp:Panel>
                                                </div>
                                                <asp:ValidationSummary ID="ValidationSummary1" runat="server" ValidationGroup="Recipient" />
                                                <asp:Button ID="btnAddNewRecipient" runat="server" CssClass="fieldButton" Text="Add Recipient" ValidationGroup="Recipient"
                                                    CausesValidation="true" OnClick="btnAddNewRecipient_Click" />
                                            </div>
                                        </div>
                                        <asp:Label ID="lblErrormsg" runat="server" ForeColor="Red" Visible="false"></asp:Label><br />
                                        <asp:ValidationSummary ID="vsErrors" runat="server" ValidationGroup="createEnvelopeFormFields" />
                                        <asp:Button CssClass="fieldButton" ID="btnCreateandSend" runat="server" Text="Send for signing Remotely"
                                            OnClick="btnCreateandSend_Click" ValidationGroup="createEnvelopeFormFields" />
                                        <asp:Button CssClass="fieldButton" ID="btnCreateEmbedded" runat="server" Text="Sign now"
                                            OnClick="btnCreateEmbedded_Click" ValidationGroup="createEnvelopeFormFields" />
                                    </div>
                                </div>
                            </div>
                        </asp:Panel>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <asp:Panel ID="pnlEmbeddedSigning" runat="server" Visible="false">
        <iframe frameborder="0" width="100%" height="1000" scrolling="auto" id="frameEmbeddedSigning"
            runat="server"></iframe>
    </asp:Panel>
    <div id="copyrightwrapper">
        <div id="copyrights" style="top: 20px">
            Copyright &copy; DocuSign</div>
    </div>
    </form>
</body>
</html>
