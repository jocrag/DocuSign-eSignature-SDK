<%@ Page Language="C#" MasterPageFile="~/_layouts/application.master" EnableViewState="true" EnableViewStateMac="false" %>
<%@ Register Tagprefix="SharePoint" Namespace="Microsoft.SharePoint.WebControls" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %> 
<%@ Register Tagprefix="Utilities" Namespace="Microsoft.SharePoint.Utilities" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %> 
<%@ Register Tagprefix="wssawc" Namespace="Microsoft.SharePoint.WebControls" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %> 
<%@ Register Tagprefix="SharePoint" Namespace="Microsoft.SharePoint.WebControls" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Register TagPrefix="wssuc" TagName="LinkSection" src="~/_controltemplates/LinkSection.ascx" %>
<%@ Register Tagprefix="Meetings" Namespace="Microsoft.SharePoint.Meetings" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Register Tagprefix="Workflow" Namespace="Microsoft.SharePoint.Workflow" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>

<%@ Import Namespace="Microsoft.SharePoint.ApplicationPages" %> 
<%@ Import Namespace="System.IO" %>
<%@ Import Namespace="System.Collections" %>
<%@ Import Namespace="Microsoft.SharePoint" %>
<%@ Import Namespace="System.Collections.Generic" %>
<%@ Import Namespace="System.Configuration" %>
<%@ Import Namespace="DocuSignAPI.CredentialService" %>
<%@ Import Namespace="DocuSignAPI.APIService" %>
<%@ Import Namespace="DocuSignAPI" %>
<%@ Import Namespace="System.Net.Mail" %>

<script type="text/C#" runat="server">
   
    SPSite mySite = null;
    SPWeb myWeb = null;
    static string listID, listItemID, reviewDocumentUrl;
    SPUser userAssignedTo = null;

    const string EMAIL_SUBJECT = "Request for the DocuSign Signature",
        
                // Error Messages
                 MESSAGE_INVALID_DOCUMENT = "DocuSign supports pdf files only. Please upload a pdf file and try again.",
                 MESSAGE_SINGLE_USER = "Please select a single user",
                 MESSAGE_USER_INFORMATION = "Enough information is not available for the selected user to process the request. Please contact your system administrator for a User Profile Update.",
                 MESSAGE_USER_PERMISSIONS = "You do not have the required permissions to view the document. Please contact your site administrator.",
                 MESSAGE_USER = "Please Select a user to submit a signing request",
                 MESSAGE_FILE_CHECKED_OUT = "The document you are trying to access is checked out. Please checkin the document for successful signing.";
    
    public enum Fields
    {
        AssignedTo,
        AssignedDate,
        Status,
        EnvelopId
    }
    
    protected void Page_Load(object sender, EventArgs e)
    {
        listID = Request.QueryString["ListId"].ToString();
        listItemID = Request.QueryString["ItemId"].ToString();
        
        //Creates AssignedTo and AssignedDate Fields in the SharePoint Document Library if not already existing
        using (mySite = SPContext.Current.Site)
        {
            using (myWeb = SPContext.Current.Web)
            {
                //To allow modifications without security validation, will be reverted after updating the document.
                myWeb.AllowUnsafeUpdates = true;

                Guid listId = new Guid(listID);
                SPList documentLibrary = myWeb.Lists[listId];
                SPQuery query = new SPQuery();
                
                //Check if the document selected is checked out
                query.Query = "<Where><And><IsNotNull><FieldRef Name='CheckoutUser' /></IsNotNull><Eq><FieldRef Name='ID' /><Value Type='Counter'>" + listItemID + "</Value></Eq></And></Where>";
                SPListItemCollection checkedOutItems = documentLibrary.GetItems(query);
                SPListItem document = documentLibrary.GetItemById(Convert.ToInt32(listItemID));
                
                string fileName = string.Empty;
                if (document.Name != null)
                {
                    fileName = document.Name;
                    
                    //Check for pdf files
                    if (!fileName.ToLower().EndsWith(".pdf"))
                    {
                        lbErrorMessage.Visible = true;
                        lbErrorMessage.Text = MESSAGE_INVALID_DOCUMENT;
                        pnlAssignedTo.Visible = false;
                    }
                    else if (checkedOutItems.Count > 0)
                    {
                        lbErrorMessage.Visible = true;
                        lbErrorMessage.Text = MESSAGE_FILE_CHECKED_OUT;
                        pnlAssignedTo.Visible = false;
                    }
                }
                
                // Create fields if not already existing.
                if (!documentLibrary.Fields.ContainsField(Fields.AssignedTo.ToString()))
                {
                    documentLibrary.Fields.Add(Fields.AssignedTo.ToString(), SPFieldType.User, false);
                    documentLibrary.Fields.Add(Fields.AssignedDate.ToString(), SPFieldType.DateTime, false);


                    SPField fieldAssignedTo = documentLibrary.Fields[Fields.AssignedTo.ToString()];
                    fieldAssignedTo.ReadOnlyField = false;
                    fieldAssignedTo.ShowInEditForm = false;
                    fieldAssignedTo.Update();

                    SPField fieldAssignedDate = documentLibrary.Fields[Fields.AssignedDate.ToString()];
                    fieldAssignedDate.ShowInEditForm = false;
                    fieldAssignedDate.Update();
                    
                    // Adding AssignedTo to default view of the document library
                    SPView defaultView = documentLibrary.DefaultView;
                    SPViewFieldCollection viewCollection = defaultView.ViewFields;
                    viewCollection.Add(fieldAssignedTo);
                    defaultView.Update();
                }
               
                myWeb.AllowUnsafeUpdates = false;
            }
        }
    }

  
    protected void btnSendRequest_Click(object sender, EventArgs e)
    {
        try
        {
            using (mySite = SPContext.Current.Site)
            {
                using (myWeb = SPContext.Current.Web)
                {
                    myWeb.AllowUnsafeUpdates = true;

                    Guid listId = new Guid(listID);
                    SPList documentLibrary = myWeb.Lists[listId];
                    SPListItem listItem = documentLibrary.GetItemById(Convert.ToInt32(listItemID));
                    
                    reviewDocumentUrl = SPContext.Current.Web.Url + "/_layouts/DocuSignSignature/Login.aspx?ItemiD=" + listItemID + "&ListId={" + listId + "}";
                    string recipientName = peAssignedTo.CommaSeparatedAccounts;
                    bool isValidUserInfo = true;
                    
                    if (!string.IsNullOrEmpty(recipientName))
                    {
                        char[] splitter = { ',' };
                        if (!string.IsNullOrEmpty(recipientName))
                        {
                            string[] splitPPData = recipientName.Split(splitter);
                            
                            //Currently set to accept a single user only, can be easily modified to accept multiple users.
                            if (splitPPData.Length > 1)
                            {
                                litUserMessage.Text = "<span class='errorMessage'>" + MESSAGE_SINGLE_USER +"</span>";
                            }
                            else
                            {                               
                                for (int i = 0; i < splitPPData.Length; i++)
                                {
                                    string loginName = splitPPData[i];
                                    litUserMessage.Text = "";

                                    if (!string.IsNullOrEmpty(loginName))
                                    {
                                        userAssignedTo = myWeb.AllUsers[loginName];
                                        
                                        if (userAssignedTo != null)
                                        {
                                            string currentUser = System.Security.Principal.WindowsIdentity.GetCurrent().Name.ToString();
                                            SPUser user = myWeb.AllUsers[currentUser];
                                            
                                            listItem[Fields.AssignedTo.ToString()] = userAssignedTo;
                                            listItem[Fields.AssignedDate.ToString()] = DateTime.Now.ToString();

                                            if (documentLibrary.Fields.ContainsField(Fields.Status.ToString()))
                                            {
                                                listItem[Fields.Status.ToString()] = "Pending";
                                            }
                                            // Creates Status field if not already exists
                                            else
                                            {
                                                documentLibrary.Fields.Add(Fields.Status.ToString(), SPFieldType.Text, false);

                                                SPField statusField = documentLibrary.Fields[Fields.Status.ToString()];
                                                statusField.DefaultValue = "Pending";
                                                statusField.ShowInEditForm = false;
                                                statusField.Update();

                                                //Adding Status field to Document Library Default View
                                                SPView defaultView = documentLibrary.DefaultView;
                                                SPViewFieldCollection viewCollection = defaultView.ViewFields;
                                                viewCollection.Add(statusField);
                                                defaultView.Update();
                                            }
                                            
                                            //Creates EnvelopId field if not already exists
                                            if (!documentLibrary.Fields.ContainsField(Fields.EnvelopId.ToString()))
                                            {
                                                documentLibrary.Fields.Add(Fields.EnvelopId.ToString(), SPFieldType.Text, false);
                                                SPField envelopID = documentLibrary.Fields[Fields.EnvelopId.ToString()];
                                                envelopID.ShowInEditForm = false;
                                                envelopID.Update();
                                            }
                                            
                                            listItem.Update();
                                            
                                            if (user != null)
                                            {        
                                                if (!string.IsNullOrEmpty(user.Name) && !string.IsNullOrEmpty(userAssignedTo.Name) && !string.IsNullOrEmpty(userAssignedTo.Email) && !string.IsNullOrEmpty(user.Email) && !string.IsNullOrEmpty(reviewDocumentUrl))
                                                {
                                                    //Send email to recipient with review document url
                                                    SendEMail(userAssignedTo.Name, userAssignedTo.Email, reviewDocumentUrl, user.Name, user.Email);
                                                }
                                                    // User Profile is not complete (Missing email address or details needed for email
                                                else
                                                {
                                                    litUserMessage.Text = "<span class='errorMessage'>" + MESSAGE_USER_INFORMATION + "</span>";
                                                    isValidUserInfo = false;
                                                }
                                            }
                                        }
                                            // User does not have permissions to the site.
                                        else
                                        {
                                            litUserMessage.Text = "<span class='errorMessage'>" + MESSAGE_USER_PERMISSIONS + "</span>";
                                            isValidUserInfo = false;
                                        }
                                    }
                                }
                                myWeb.AllowUnsafeUpdates = false;

                                if (isValidUserInfo)
                                    Response.Redirect(SPContext.Current.Web.Url + "/" + documentLibrary.RootFolder.Url);
                            }
                        }
                    }
                        // No user selected
                    else
                    {
                        litUserMessage.Text = "<span class='errorMessage'>" + MESSAGE_USER + "</span>";
                    }

                }
            }
        }
        catch (Exception ex)
        {
            litUserMessage.Text = "<span class='errorMessage'>" + ex.Message + "</span>";
        }     
    }
    
    /// <summary>
    /// Send Email Request for the DocuSign Signature.
    /// </summary>
    /// <param name="assignedToName">Recipient Name</param>
    /// <param name="assignedToEmailAddress">Recipient Email Address</param>
    /// <param name="currentUrl">Login Page Url</param>
    /// <param name="requestedName">Requested by Name</param>
    /// <param name="requestedEmailAddress">Requested by Email Address</param>
    private void SendEMail(string assignedToName, string assignedToEmailAddress, string reviewDocumentUrl, string requestedName, string requestedEmailAddress)
    {
        string smtpSever = ConfigurationManager.AppSettings["smtpServer"];

        if (!string.IsNullOrEmpty(smtpSever))
        {
            MailMessage MailMsg = new MailMessage();

            string fromMail = requestedEmailAddress;
            string fromName = requestedName;

            MailAddress fromAddress = new MailAddress(fromMail, fromName);
            MailMsg.From = fromAddress;

            MailAddress toAddress = new MailAddress(assignedToEmailAddress, assignedToName);
            MailMsg.To.Add(toAddress);

            MailMsg.IsBodyHtml = true;

            string subject = EMAIL_SUBJECT;
            
            StringBuilder emailBody = new StringBuilder();
            emailBody.Append("<div>" + assignedToName + ",<br/><br/>To begin the process of reviewing and signing your documents, please click the <b>Review and Signing</b> link below.<br/>" + string.Format("<a href='{0}'>Review and Signing.</a>", reviewDocumentUrl) + "<br/><br/>");
            emailBody.Append("<b>Note:</b> Signing will not be complete until you have reviewed the agreement and confirmed your signature.<br/><br/>Thanks,<br/>" + fromName + "<br/>" + requestedEmailAddress + "</div><br/><img src='http://www.docusign.com/images/site/logo-trans.gif' />");
            
            string body =  emailBody.ToString();
            MailMsg.Subject = subject;
            MailMsg.Body = body;

            SmtpClient smtpClient = new SmtpClient(smtpSever);
            smtpClient.Send(MailMsg);
        }
    }	
</script>
<asp:Content ID="Content1" contentplaceholderid="PlaceHolderPageTitle" runat="server">
   Signature Request
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderId="PlaceHolderPageDescriptionRowAttr" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderId="PlaceHolderPageDescriptionRowAttr2" runat="server">
</asp:Content>
<asp:Content ID="Content4" ContentPlaceHolderId="PlaceHolderAdditionalPageHead" runat="server">
</asp:Content>
<asp:Content ID="Content5" ContentPlaceHolderId="PlaceHolderPageTitleInTitleArea" runat="server">
    <div class="brandHeaderTitle">Signature Request</div>
    <div class="docuSignImage"></div>
</asp:Content>
<asp:Content ID="Content6" ContentPlaceHolderId="PlaceHolderPageImage" runat="server">
</asp:Content>
<asp:Content ID="Content7" ContentPlaceHolderId="PlaceHolderPageDescription" runat="server">
</asp:Content>
<asp:Content ID="ContentPlaceHolderMain" ContentPlaceHolderID="PlaceHolderMain" runat="server">
<link type="text/css" href="DocuSignStylesheet.css" rel="stylesheet"/>

  <div id="wrapper">
        <div class="topRight">
            <div class="bottomLeft">
                <div class="bottomRight">
                    <div id="loginForm">
                        <asp:Panel ID="pnlAssignedTo" CssClass="pnlAssignedTo" runat="server">
                            <table border="0" cellpadding="2" cellspacing="5" class="Login">
                                <tr>
                                    <td colspan="2" class="subHeaderText">
                                        Select user for Signature Request:
                                    </td>
                                </tr>
                                <tr>
                                    <td class="subHeader" valign="top">Assigned To:</td>
                                    <td>
                                        <SharePoint:PeopleEditor ID="peAssignedTo" runat="server" />
                                        <asp:Literal ID="litUserMessage" runat="server"></asp:Literal></td>
                                </tr>
                                <tr>
                                    <td colspan="2" align="center"><asp:Button ID="btnSendRequest" runat="server" Text="Send Request" OnClick="btnSendRequest_Click" /></td>
                                </tr>
                            </table>
                        </asp:Panel>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
     <div class="lbErrorMessage">
        <asp:Label ID="lbErrorMessage" runat="server" Visible="false"></asp:Label>
    </div>
</asp:Content>