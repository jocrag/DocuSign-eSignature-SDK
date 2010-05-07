<%@ Page Language="C#" MasterPageFile="~/_layouts/application.master" EnableViewState="true"
    EnableViewStateMac="false" %>

<%@ Register TagPrefix="SharePoint" Namespace="Microsoft.SharePoint.WebControls"
    Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Register TagPrefix="Utilities" Namespace="Microsoft.SharePoint.Utilities" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Register TagPrefix="wssawc" Namespace="Microsoft.SharePoint.WebControls" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Register TagPrefix="SharePoint" Namespace="Microsoft.SharePoint.WebControls"
    Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Register TagPrefix="wssuc" TagName="LinkSection" Src="~/_controltemplates/LinkSection.ascx" %>
<%@ Register TagPrefix="Meetings" Namespace="Microsoft.SharePoint.Meetings" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Register TagPrefix="Workflow" Namespace="Microsoft.SharePoint.Workflow" Assembly="Microsoft.SharePoint, Version=12.0.0.0, Culture=neutral, PublicKeyToken=71e9bce111e9429c" %>
<%@ Import Namespace="Microsoft.SharePoint.ApplicationPages" %>
<%@ Import Namespace="System.IO" %>
<%@ Import Namespace="System.Collections" %>
<%@ Import Namespace="Microsoft.SharePoint" %>
<%@ Import Namespace="System.Collections.Generic" %>
<%@ Import Namespace="System.Configuration" %>
<%@ Import Namespace="DocuSignAPI.CredentialService" %>
<%@ Import Namespace="DocuSignAPI.APIService" %>
<%@ Import Namespace="DocuSignAPI" %>

<script type="text/C#" runat="server">
    SPSite spSite = null;
    SPWeb spWeb = null;
    int listItemID = 0;
    LoginResult identity;
    string loggedInUserName, loggedInUserEmail;
    string userName, userEmailAddress, fileName,listID = string.Empty;

    // Error Messages
    const string MESSAGE_FILE_CHECKED_OUT = "The document you are trying to access is checked out. Please checkin the document for successful signing.",
                 MESSAGE_INVALID_DOCUSIGN_CREDENTIALS = "Unable to process your request due to insufficient DocuSign credentials. Please contact your site administration",
                 MESSAGE_INVALID_DOCUMENT = "DocuSign supports pdf files only. Please upload a pdf file and try again.";
    
    public enum Fields
    {
        Status,
        EnvelopId
    }

    protected void Page_Load(object sender, EventArgs e)
    {
        int queryStringCount = Request.QueryString.Count;
        listID = Request.QueryString["ListId"].ToString();
        listItemID = Convert.ToInt32(Request.QueryString["ItemId"]);
        string currentUser = System.Security.Principal.WindowsIdentity.GetCurrent().Name.ToString();
        
        SPUser user = null;
        string docuSignLoginName = ConfigurationManager.AppSettings["docuSignUserName"];
        string docuSignPassword = ConfigurationManager.AppSettings["docuSignPassword"];

        //Update Document Library after document signed and EnvelopId
        if (queryStringCount > 2)
        {
            string envelopId = Request.QueryString["envelopeID"];
            string status = Request.QueryString["event"];

            if (Session["Identity"] != null && Session["DocuSignPassword"] != null)
            {
                EnvelopePDF envelopePDF = EnvelopeManager.RequestEnvelopePDF(envelopId, (Account)Session["Identity"], Session["DocuSignPassword"].ToString());
                byte[] bytes = envelopePDF.PDFBytes;

                using (spSite = SPContext.Current.Site)
                {
                    using (spWeb = SPContext.Current.Web)
                    {
                        spWeb.AllowUnsafeUpdates = true;
                        Guid listId = new Guid(listID);
                        SPList documentLibrary = spWeb.Lists[listId];
                        SPListItem document = documentLibrary.GetItemById(listItemID);

                        SPFolder documentLibraryFolder = documentLibrary.RootFolder;

                        SPFileCollection collFiles = documentLibraryFolder.Files;
                        SPFile spFile = null;

                        spFile = collFiles.Add(document.Url, bytes, true);

                        SPListItem listItem = spFile.Item;

                        if (!string.IsNullOrEmpty(status))
                            listItem["Status"] = status;

                        if (!string.IsNullOrEmpty(envelopId))
                            listItem["EnvelopId"] = envelopId;

                        //listItem.Update();
                        listItem.UpdateOverwriteVersion();

                        spWeb.AllowUnsafeUpdates = false;

                        string documentLibraryUrl = SPContext.Current.Web.Url + "/" + documentLibrary.RootFolder.Url;


                        if (!string.IsNullOrEmpty(documentLibraryUrl))
                            ClientScript.RegisterStartupScript(GetType(), "documentLibraryUrl", string.Format("window.open('{0}','_parent');", documentLibraryUrl), true);

                    }
                }
            }
        }
        else
        {
            using (spSite = SPContext.Current.Site)
            {
                using (spWeb = SPContext.Current.Web)
                {
                    spWeb.AllowUnsafeUpdates = true;

                    byte[] docBytes = new byte[] { };
                    docBytes = GetDocumentByIdAndListID(listID, listItemID);

                    Guid listId = new Guid(listID);
                    SPList documentLibrary = spWeb.Lists[listId];
                    SPListItem document = documentLibrary.GetItemById(listItemID);
                    SPQuery query = new SPQuery();

                    //check if the document selected is checked out
                    query.Query = "<Where><And><IsNotNull><FieldRef Name='CheckoutUser' /></IsNotNull><Eq><FieldRef Name='ID' /><Value Type='Counter'>" + listItemID + "</Value></Eq></And></Where>";
                    SPListItemCollection checkedOutItems = documentLibrary.GetItems(query);
                    
                    if (document.Name != null)
                    {
                        fileName = document.Name;

                        if (!fileName.ToLower().EndsWith(".pdf"))
                        {
                            lbErrorMessage.Visible = true;
                            lbErrorMessage.Text = MESSAGE_INVALID_DOCUMENT;
                        }
                        else if (checkedOutItems.Count > 0)
                        {
                            lbErrorMessage.Visible = true;
                            lbErrorMessage.Text = MESSAGE_FILE_CHECKED_OUT;
                        }
                        else
                        {
                            //Create Status field if not exists
                            if (!documentLibrary.Fields.ContainsField(Fields.Status.ToString()))
                            {
                                documentLibrary.Fields.Add(Fields.Status.ToString(), SPFieldType.Text, false);

                                SPField statusField = documentLibrary.Fields[Fields.Status.ToString()];
                                statusField.DefaultValue = "Pending";
                                statusField.ShowInEditForm = false;
                                statusField.Update();

                                SPView defaultView = documentLibrary.DefaultView;
                                SPViewFieldCollection viewCollection = defaultView.ViewFields;
                                viewCollection.Add(statusField);
                                defaultView.Update();
                            }

                            //Create EnvelopId if does not exist
                            if (!documentLibrary.Fields.ContainsField(Fields.EnvelopId.ToString()))
                            {
                                documentLibrary.Fields.Add(Fields.EnvelopId.ToString(), SPFieldType.Text, false);
                                SPField envelopID = documentLibrary.Fields[Fields.EnvelopId.ToString()];
                                envelopID.ShowInEditForm = false;
                                envelopID.Update();
                            }

                            //Get current user details
                            user = spWeb.AllUsers[currentUser];
                            userName = user.Name;
                            userEmailAddress = user.Email;

                            if (!string.IsNullOrEmpty(docuSignLoginName) && !string.IsNullOrEmpty(docuSignPassword))
                                identity = ValidateUser(docuSignLoginName, docuSignPassword);

                            if (identity != null)
                            {
                                if (identity.Success)
                                {
                                    Session["LoginResult"] = identity;
                                    Session["DocuSignPassword"] = docuSignPassword;

                                    Account account = identity.Accounts[0];
                                    Session["Identity"] = account;
                                    System.Collections.Generic.List<Recipient> Recipients = new System.Collections.Generic.List<Recipient>();
                                    Recipient recipient = new Recipient();
                                    int id = 1;
                                    recipient.ID = id.ToString();
                                    recipient.UserName = userName;
                                    recipient.Email = userEmailAddress;
                                    recipient.CaptiveInfo = new RecipientCaptiveInfo();
                                    recipient.CaptiveInfo.ClientUserId = Guid.NewGuid().ToString();
                                    Recipients.Add(recipient);
                                    pnlSign.Visible = true;
                                    if (spSite.ServerRelativeUrl == "/")
                                    {
                                        frameDocuSign.Attributes["src"] = EnvelopeManager.CreateEmbedded(account, docuSignPassword, "Subject Goes Here", "Email Blurp Goes Here", GetDocumentByIdAndListID(listID, listItemID), fileName, Recipients, spSite.Url + Request.RawUrl);
                                    }
                                    else
                                    {
                                        frameDocuSign.Attributes["src"] = EnvelopeManager.CreateEmbedded(account, docuSignPassword, "Subject Goes Here", "Email Blurp Goes Here", GetDocumentByIdAndListID(listID, listItemID), fileName, Recipients, spSite.Url + Request.RawUrl.Replace(spSite.ServerRelativeUrl, string.Empty));
                                    }
                                }
                                else
                                {
                                    lbErrorMessage.Visible = true;
                                    lbErrorMessage.Text = "<p class='errorMessage'>" + MESSAGE_INVALID_DOCUSIGN_CREDENTIALS + "<p>";
                                }
                            }
                        }
                    }
            
                    spWeb.AllowUnsafeUpdates = false;
                }
            }
        }
    }
    
/// <summary>
/// Return the document in bytes format
/// </summary>
/// <param name="listID">Document Library ID</param>
/// <param name="listItemID">Document ID</param>
/// <returns></returns>
    byte[] GetDocumentByIdAndListID(string listID, int listItemID)
    {
        byte[] documentBytes = new byte[] { };

        if (!string.IsNullOrEmpty(listID))
        {
            Guid listId = new Guid(listID);
            SPList documentLibrary = spWeb.Lists[listId];
            SPListItem document = documentLibrary.GetItemById(listItemID);
          
            if (document.Name != null)
            {
                documentBytes = document.File.OpenBinary();
            }
        }
        return documentBytes;
    }
   
    private LoginResult ValidateUser(string userName, string password)
    {
        CredentialSoapClient credentialSoapClient = new CredentialSoapClient();
        LoginResult loginResult = credentialSoapClient.Login(userName, password);

        return loginResult;
    }

</script>

<asp:Content ID="Content1" ContentPlaceHolderID="PlaceHolderPageTitle" runat="server">
    DocuSign Login Page
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="PlaceHolderPageDescriptionRowAttr"
    runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="PlaceHolderPageDescriptionRowAttr2"
    runat="server">
</asp:Content>
<asp:Content ID="Content4" ContentPlaceHolderID="PlaceHolderAdditionalPageHead" runat="server">
</asp:Content>
<asp:Content ID="Content5" ContentPlaceHolderID="PlaceHolderPageTitleInTitleArea"
    runat="server">
    <div class="brandHeaderTitle">
        DocuSign Login</div>
    <div class="docuSignImage">
    </div>
</asp:Content>
<asp:Content ID="Content6" ContentPlaceHolderID="PlaceHolderPageImage" runat="server">
</asp:Content>
<asp:Content ID="Content7" ContentPlaceHolderID="PlaceHolderPageDescription" runat="server">
</asp:Content>
<asp:Content ID="ContentPlaceHolderMain" ContentPlaceHolderID="PlaceHolderMain" runat="server">
    <link type="text/css" href="DocuSignStylesheet.css" rel="stylesheet" />
    <asp:Panel ID="pnlSign" runat="server" Visible="false">
        <iframe frameborder="0" width="100%" height="1000" scrolling="auto" id="frameDocuSign"
            runat="server"></iframe>
    </asp:Panel>
    <div class="lbErrorMessage">
        <asp:Label ID="lbErrorMessage" Visible="false" runat="server"></asp:Label>
    </div>
</asp:Content>
