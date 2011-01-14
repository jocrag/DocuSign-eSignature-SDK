public with sharing class NDAKioskController {

    public NDA_Signer__c signer {get; set;}
    public string errmsg {get; set;}
    public string selected_name {get; set;}
    public string tokenURL {get; set;}
    public string validateType {get; set;}
    public string attachmentId {get; set;}
    public string pdfBytes {get; set;}
    
    private string id;    // id of current signer object
    private String auth;
    private String envelopeId;

    // Preview 
//    private String accountId = '6fbf04c2-e230-420e-86f8-c98ef2671cc1';
//    private String userId = '4f4809a2-8e0f-4e52-b32f-62ce9a059af8 ';
//    private String password = 'blahblah';
//    private String integratorsKey = 'DOCU-3d7c7b84-6443-4b63-918e-c28c3b0e0ce5';
//    private String webServiceUrl = 'https://preview.docusign.net/api/3.0/dsapi.asmx';
//    private String templateId = '02D16F2F-0C98-46B0-B5D3-6AF6C8566494';

    // Demo
    private String accountId = 'c5d11f83-7e0c-4ded-81b2-3748cd2cedc6';
    private String userId = '2053268a-0b64-4002-88c2-7b61d28e3fbe';
    private String password = 'blahblah';
    private String integratorsKey = 'DOCU-e02eab46-e7ca-48c5-95b5-cfeeb9c150d3';
    private String webServiceUrl = 'https://demo.docusign.net/api/3.0/dsapi.asmx';
    private String templateId = 'EF8FB968-5B41-4341-B6A3-E7EC60A71BFD';


//===== Ctor =====            
    public NDAKioskController(ApexPages.StandardController controller) {
        // init signer
        id = ApexPages.currentPage().getParameters().get('id');
        if (id == null) {
            signer = new NDA_Signer__c();
        }
        else {
            signer = [SELECT id, name, 
                    Email__c, 
                    validate_method__c, 
                    Send_Signed_Copy__c,
                    selected_name__c
                FROM NDA_Signer__c
                WHERE id = :id];
        }
        

        //Set Authentication
        auth = '<DocuSignCredentials><Username>'+ userId 
            +'</Username><Password>' + password 
            + '</Password><IntegratorKey>' + integratorsKey 
            + '</IntegratorKey></DocuSignCredentials>';
        System.debug('Setting authentication to: ' + auth);
            

        // init error message
        errmsg = '';
        
        tokenURL = '';
    }

//===== Private methods =====
    // Send the envelope as an embedded signing    
    private string SendNDANow() {
        envelopeId = '';
        string token = '';
        DocuSignAPI.ApiServiceSOAP dsApiSend = dsapi_send();
        
        // create envelope info
        DocuSignAPI.EnvelopeInformation envelope = new DocuSignAPI.EnvelopeInformation();
        envelope.Subject = 'Please Sign this NDA: ' + signer.selected_name__c ;
        envelope.EmailBlurb = 'This is my new eSignature service,'+ 
        ' it allows me to get your signoff without having to fax, ' +
        'scan, retype, refile and wait forever';
        envelope.AccountId  = accountId; 

        // Recipient Information
        DocuSignAPI.Recipient recipient = new DocuSignAPI.Recipient();
        recipient.ID = 1;
        recipient.Type_x = 'Signer';
        recipient.RoutingOrder = 1;
        recipient.Email = signer.Email__c;
        recipient.UserName = signer.selected_name__c;
        recipient.RoleName = 'Signer';
        System.Debug('authentication method = ' + signer.validate_method__c);
        if (signer.validate_method__c == 'RSAID') {
            recipient.RequireIDLookup = true;
        }
        else if (signer.validate_method__c == 'PHONE') {
            recipient.RequireIDLookup = true;
            recipient.IDCheckConfigurationName = 'Phone Auth $';
            DocuSignAPI.RecipientPhoneAuthentication phoneAuth = new DocuSignAPI.RecipientPhoneAuthentication();
            phoneAuth.RecipMayProvideNumber = true;
            recipient.PhoneAuthentication = phoneAuth;
        }
        else {
            recipient.RequireIDLookup = false;
        }
        // make recipient captive for embedded experience
        recipient.CaptiveInfo = new DocuSignAPI.RecipientCaptiveInfo();
        recipient.CaptiveInfo.ClientUserId = '1';
        // Role assignments
        DocuSignAPI.TemplateReferenceRoleAssignment roleAssignment = new DocuSignAPI.TemplateReferenceRoleAssignment();
        roleAssignment.RoleName = recipient.RoleName;
        roleAssignment.RecipientID = recipient.ID;
        
        // Create cc recipient if they want a copy in their email
        DocuSignAPI.ArrayOfRecipient1 signers = new DocuSignAPI.ArrayOfRecipient1();
/*        if (signer.Send_Signed_Copy__c == true) {
            signers.Recipient = new DocuSignAPI.Recipient[2];
            DocuSignAPI.Recipient recipCC = new DocuSignAPI.Recipient();
            recipCC.ID = 2;
            recipCC.Type_x = 'CarbonCopy';
            recipCC.RoutingOrder = 2;
            recipCC.Email = signer.Email__c;
            recipCC.UserName = signer.selected_name__c;
            recipCC.RoleName = 'Signer';
            signers.Recipient[1] = recipCC;
        }
        else {
            signers.Recipient = new DocuSignAPI.Recipient[1];
        }
*/
        signers.Recipient = new DocuSignAPI.Recipient[1];
        signers.Recipient[0] = recipient;
        
        // Create object for the NDA server-side template
        DocuSignAPI.TemplateReference ndaTemplate = new DocuSignAPI.TemplateReference();
        ndaTemplate.Template = templateId;
        ndaTemplate.TemplateLocation = 'Server';
        
        // Add role assignment
        ndaTemplate.RoleAssignments = new DocuSignAPI.ArrayOfTemplateReferenceRoleAssignment();
        ndaTemplate.RoleAssignments.RoleAssignment = new DocuSignAPI.TemplateReferenceRoleAssignment[1];
        ndaTemplate.RoleAssignments.RoleAssignment[0] = roleAssignment;
        
        // Add data for fields
        DocuSignAPI.TemplateReferenceFieldDataDataValue fd1 = new DocuSignAPI.TemplateReferenceFieldDataDataValue();
        fd1.TabLabel = 'Date Signed';
        fd1.Value = DateTime.now().format('MMM dd, yyyy');

        DocuSignAPI.TemplateReferenceFieldDataDataValue fd2 = new DocuSignAPI.TemplateReferenceFieldDataDataValue();
        fd2.TabLabel = 'Full Name 1';
        fd2.Value = recipient.UserName;
        
        DocuSignAPI.TemplateReferenceFieldDataDataValue fd3 = new DocuSignAPI.TemplateReferenceFieldDataDataValue();
        fd3.TabLabel = 'Full Name 2';
        fd3.Value = recipient.UserName;

        ndaTemplate.FieldData = new DocuSignAPI.TemplateReferenceFieldData();
        ndaTemplate.FieldData.DataValues = new DocuSignAPI.ArrayOfTemplateReferenceFieldDataDataValue();
        ndaTemplate.FieldData.DataValues.DataValue = new DocuSignAPI.TemplateReferenceFieldDataDataValue[3];
        ndaTemplate.FieldData.DataValues.DataValue[0] = fd1;
        ndaTemplate.FieldData.DataValues.DataValue[1] = fd2;
        ndaTemplate.FieldData.DataValues.DataValue[2] = fd3;
        
        // create array of template references
        DocuSignAPI.ArrayOfTemplateReference templateReferences = new DocuSignAPI.ArrayOfTemplateReference();
        templateReferences.TemplateReference = new DocuSignAPI.TemplateReference[1];
        templateReferences.TemplateReference[0] = ndaTemplate;
                
        System.debug('Calling CreateEnvelopeFromTemplates');
        try {
            DocuSignAPI.EnvelopeStatus es = dsApiSend.CreateEnvelopeFromTemplates(templateReferences, signers, envelope, true);
            envelopeId = es.EnvelopeID;
        } catch ( CalloutException e) {
            System.debug('Exception - ' + e );
            errMsg = 'Exception - ' + e;
            return '';    //TODO: send to error landing place
        }
        
        DocuSignAPI.RequestRecipientTokenAuthenticationAssertion assert = new DocuSignAPI.RequestRecipientTokenAuthenticationAssertion();
        assert.AssertionID = 'Your AssertionID Here';
        assert.AuthenticationInstant = system.now();
        assert.AuthenticationMethod = 'Password';
        assert.SecurityDomain = 'YourApp.com';
        
        DocuSignAPI.RequestRecipientTokenClientURLs clientURLs = new DocuSignAPI.RequestRecipientTokenClientURLs();
        
        clientURLs.OnAccessCodeFailed = getPopURL() + '?Id=' + signer.id + '&event=OnAccessCodeFailed&envelopeid=' + envelopeID;
        clientURLs.OnCancel = getPopURL() + '?Id=' + signer.id + '&event=OnCancel&envelopeid=' + envelopeID;
        clientURLs.OnDecline = getPopURL() + '?Id=' + signer.id + '&event=OnDecline&envelopeid=' + envelopeID;
        clientURLs.OnException = getPopURL() + '?Id=' + signer.id + '&event=OnException&envelopeid=' + envelopeID;
        clientURLs.OnFaxPending = getPopURL() + '?Id=' + signer.id + '&event=OnFaxPending&envelopeid=' + envelopeID;
        clientURLs.OnIdCheckFailed = getPopURL() + '?Id=' + signer.id + '&event=OnIdCheckFailed&envelopeid=' + envelopeID;
        clientURLs.OnSessionTimeout = getPopURL() + '?Id=' + signer.id + '&event=OnSessionTimeout&envelopeid=' + envelopeID;
        clientURLs.OnSigningComplete = getPopURL() + '?Id=' + signer.id + '&event=OnSigningComplete&envelopeid=' + envelopeID;
        clientURLs.OnTTLExpired = getPopURL() + '?Id=' + signer.id + '&event=OnTTLExpired&envelopeid=' + envelopeID;
        clientURLs.OnViewingComplete = getPopURL() + '?Id=' + signer.id + '&event=OnViewingComplete&envelopeid=' + envelopeID;
        
        // assumes apiService = preconfigured api proxy
        try {
            token = dsApiSend.RequestRecipientToken(envelopeId, recipient.captiveinfo.ClientUserId, recipient.UserName, recipient.Email, assert,clientURLs);
        }  catch ( CalloutException e) {
            System.debug('Exception - ' + e );
            errMsg = 'Exception - ' + e;
            return '';    //TODO: send to error landing place
        }
        return token;
    }

    // Get the proxy for the dsapi-send wsdl
    private DocuSignAPI.APIServiceSoap dsapi_send() {
        // Get DSapi and authenticate
        DocuSignAPI.APIServiceSoap dsApiSend = new DocuSignAPI.APIServiceSoap();
        dsApiSend.endpoint_x = webServiceUrl;
        dsApiSend.inputHttpHeaders_x = new Map<String, String>();
        dsApiSend.inputHttpHeaders_x.put('X-DocuSign-Authentication', auth);
        return dsApiSend;
    }
    
    // Get the proxy for the dsapi-account wsdl
    private DocuSignAPI_Account.APIServiceSoap dsapi_account() {
        // Get DSapi and authenticate
        DocuSignAPI_Account.APIServiceSoap dsApiAccount = new DocuSignAPI_Account.APIServiceSoap();
        dsApiAccount.endpoint_x = webServiceUrl;
        dsApiAccount.inputHttpHeaders_x = new Map<String, String>();
        dsApiAccount.inputHttpHeaders_x.put('X-DocuSign-Authentication', auth);
        return dsApiAccount;
    }
    
    // Get the proxy for the dsapi-document wsdl
    private DocuSignAPI_document.APIServiceSoap dsapi_document() {
        // Get DSapi and authenticate
        DocuSignAPI_document.APIServiceSoap dsApiDoc = new DocuSignAPI_document.APIServiceSoap();
        dsApiDoc.endpoint_x = webServiceUrl;
        dsApiDoc.inputHttpHeaders_x = new Map<String, String>();
        dsApiDoc.inputHttpHeaders_x.put('X-DocuSign-Authentication', auth);
        return dsApiDoc;
    }
    
    // Return an array of recipient names if more than one
    // otherwise returns empty string
    private String[] recipientNames() {
        DocuSignAPI_Account.ApiServiceSOAP dsApiAccount = dsapi_account();
        
        DocuSignAPI_Account.RecipientList rlist = dsApiAccount.GetRecipientList(accountId, signer.Email__c);
        
        if (rlist.RecipientName != null) {
            return rlist.RecipientName.RecipientName;
        } else {
            return null;
        }
    }
    
    // returns URL of POP page that redirects callbacks to correct URL
    // Strips off end of path and replaces with ndaPOP
    private String getPopURL() {
        String popURL = Site.getCurrentSiteUrl();
        if (popURL == null) {
            popURL = 'https://na3.salesforce.com/apex/';
        } 
        return popURL + 'ndaPop';
    }

//===== ndaWelcome Control Methods =====
    // actions to perform on page open
    public void ndaWelcomePageOpen () {
        errmsg = '';
        if (id == null) {
            validateType = 'SHOWID';
            selected_name = '';
        }
        else {
            validateType = signer.validate_method__c;
            selected_name = signer.selected_name__c;
        }
    }
    
    // initialize radio buttons
    // TODO: make enum
    public List<SelectOption> getValidateItems() {
        List<SelectOption> options = new List<SelectOption>{};
        options.add(new SelectOption('SHOWID', 'Show ID to Receptionist'));
        options.add(new SelectOption('PHONE', 'Phone Authentication'));
        options.add(new SelectOption('RSAID', 'Use RSA ID Check'));
        
        return options;
    }
    
    // populates the database with a record and goes to the next page
    // if the recipient list for email is > 1 then 
    //    next page is NDANameRes with list of names in URL
    // else
    //    next page is NDAeSign
    public PageReference eSign() {
        // set validation method
        PageReference nextWindow = null;

        signer.validate_method__c = validateType;

        String[] recipients = recipientNames();
        if (recipients != null) {
            nextWindow = Page.NDANameRes;
        }
        else {
            nextWindow = Page.NDAeSign;
        }
        signer.selected_name__c = signer.name;
        try {
            if (id == null){
                insert signer;
            }
            else {
                update signer;
            }
        }
        catch (DMLException e) {
            errmsg = e.getDmlMessage(0);
            System.Debug(errmsg);
        }
        
        if (errmsg != '') {
            nextWindow = Page.NDAWelcome;
        }
        nextWindow.getParameters().put('id', signer.id);
        nextWindow.setRedirect(true);            

        return nextWindow;
    }

    // clears values on welcome page
    public void clearWelcomeFields() {
        signer.Name = '';
        signer.Email__c = '';
        signer.Send_Signed_Copy__c = false;
    }
    
//===== ndaNameRes Control Methods =====
    // actions to perform on page open
    public void ndaNameResPageOpen() {
    }
    
    // Continue button on Name resolution page
    public PageReference ndaContinue() {
        PageReference ndaEsign;
        if (selected_name == ''){
            errMsg = 'Please select a name';
            ndaEsign = null;
        }
        else {
            signer.selected_name__c = selected_name;
            update signer;
            System.debug('Selected Name: ' + selected_name);
            ndaEsign = Page.NDAeSign;
            ndaEsign.getParameters().put('id', signer.id);
            ndaEsign.setRedirect(true);
        }
        return ndaEsign;
    }
    
    // restart link on name resolution page
    public PageReference ndaRestart() {
        PageReference ndaWelcome;
        ndaWelcome = Page.NDAWelcome;
        ndaWelcome.getParameters().put('id', signer.id);
        ndaWelcome.setRedirect(true);
        return ndaWelcome;
    }
    
    // initialize from list gotten from DocuSign
    public List<SelectOption> getLegalNames() {
        String[] legalNames = recipientNames();
        List<SelectOption> options = new List<SelectOption>();
        // start with name in object
        options.add(new SelectOption(signer.Name, signer.Name));
        if (legalNames != null) {
            for (String name : legalNames) {
                options.add(new SelectOption(name, name));
            }
        }
        return options;
    }

//===== ndaEsign Control Methods =====
    // Perform actions on page open
    public void ndaEsignPageOpen() {
         // create token URL
        tokenURL = SendNDANow();
   }

//===== ndaPop Control Methods =====
    // Perform actions on page open
    public void ndaPopPageOpen() {
    }

//===== ndaDone Control Methods =====
    // Perform actions on page open
    public void ndaDonePageOpen() {
        envelopeId = ApexPages.currentPage().getParameters().get('envelopeid');
    } 
    
    // This gets the PDF of the NDA and renders it   
    public PageReference ndaPrint() {
        PageReference ndaPrint = Page.ndaPrint;
        ndaPrint.getParameters().put('id', signer.id);
        ndaPrint.getParameters().put('envelopeId', envelopeId);
        ndaPrint.setRedirect(true);
        return ndaPrint;
    }
    
//===== ndaViewPDF Control Methods =====
    public void ndaViewPDFPageOpen() {
        envelopeId = ApexPages.currentPage().getParameters().get('envelopeid');
        DocuSignAPI_document.ApiServiceSOAP dsApiDoc = dsapi_document();
        try {
            DocuSignAPI_document.EnvelopePDF envPDF = dsApiDoc.RequestPDF(envelopeId);
            pdfBytes = envPDF.pdfBytes;
        } catch ( CalloutException e) {
            System.debug('Exception - ' + e );
            errMsg = 'Exception - ' + e;
        } 
    }
}