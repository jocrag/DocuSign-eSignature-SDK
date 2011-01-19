/**
 * This class contains unit tests for validating the behavior of Apex classes
 * and triggers.
 *
 * Unit tests are class methods that verify whether a particular piece
 * of code is working properly. Unit test methods take no arguments,
 * commit no data to the database, and are flagged with the testMethod
 * keyword in the method definition.
 *
 * All test methods in an organization are executed whenever Apex code is deployed
 * to a production organization to confirm correctness, ensure code
 * coverage, and prevent regressions. All Apex classes are
 * required to have at least 75% code coverage in order to be deployed
 * to a production organization. In addition, all triggers must have some code coverage.
 * 
 * The @isTest class annotation indicates this class only contains test
 * methods. Classes defined with the @isTest annotation do not count against
 * the organization size limit for all Apex scripts.
 *
 * See the Apex Language Reference for more information about Testing and Code Coverage.
 */
@isTest
private class NDAKioskControllerTests {

    static testMethod void testNDAKioskController() {
    	// Some test values
    	string testName = 'Craig Smith';
    	string testEmail = 'craig.smith.docusign@gmail.com';
    	string testHere = 'Craig Smith';
    	
        // Instantiate controller
        NDA_Signer__c signer = new NDA_Signer__c();
        ApexPages.StandardController ndaSC = new ApexPages.Standardcontroller(signer);
        NDAKioskController ndaKiosk = new NDAKioskController(ndaSC);

    	//=============================
        // Test ndawelcome page
        //=============================
        PageReference startPage = Page.ndawelcome;
        Test.setCurrentPage(startPage);
        
        // Verify signer object has been created
        System.assertNotEquals(ndaKiosk.signer, null);
        
        //===== Test ndawelcome Clear button
        // Fill in the page with valid stuff using default selections
        ndaKiosk.signer.Name = testName;
        ndaKiosk.signer.Email__c = testEmail;
        ndaKiosk.signer.Here_to_see__c = testHere;

        // Hit Clear button
        ndaKiosk.clearWelcomeFields();
        // verify signer was cleared
        System.assertEquals(ndaKiosk.signer.Name, '');
        System.assertEquals(ndaKiosk.signer.Email__c, '');
        System.assertEquals(ndaKiosk.signer.Here_to_see__c, '');
        
        //===== Test ndawelcome eSign button
        // Fill in the page with valid stuff using default selections
        ndaKiosk.signer.Name = testName;
        ndaKiosk.signer.Email__c = testEmail;
        ndaKiosk.signer.Here_to_see__c = testHere;
        
        // Hit eSign button
        string nextPageURL = ndaKiosk.eSign().getUrl();
        // get new signer
        NDA_Signer__c[] signers = [select id from NDA_Signer__c where Email__c =: testEmail];
        //verify signer id exists
        System.assertNotEquals(signers[0].id, null);
        //verify URL
        System.assertEquals('/apex/ndanameres?id=', nextPageURL.substring(0, 20));
        // get id of current signer
        string signerId = nextPageURL.substring(20);
        // get current signer object
        NDA_Signer__c ndaSigner = [SELECT id, name, 
                Email__c, 
                validate_method__c, 
                Send_Signed_Copy__c,
                selected_name__c,
                Here_to_see__c,
                Purpose_of_visit__c,
                Company_Name__c,
                Phone__c from NDA_Signer__c where id =: signerId];
        // verify object was updated
        System.assertEquals(ndaSigner.Name, testName);
        System.assertEquals(ndaSigner.Email__c, testEmail);
        System.assertEquals(ndaSigner.Here_to_see__c, testHere);

        //=============================
        // Test ndanameres page
        //=============================
        // go to page
        PageReference nameResPage = Page.ndanameres;
        nameResPage.getParameters().put('id', signerId);
        Test.setCurrentPage(nameResPage);
        
        // Create a new controller with signer created above
        ndaSC = new ApexPages.Standardcontroller(ndaSigner);
        ndaKiosk = new NDAKioskController(ndaSC);

        // Since web service call to recipients doesn't work in test,
        // we should get an eSign page reference when we run
        // the open action method
        nextPageURL = ndaKiosk.ndaNameResPageOpen().getUrl();
        System.assertEquals('/apex/ndaesign?id=' + signerId, nextPageURL);
        
        // set a selected name and verify continue button
        ndaKiosk.selected_name = testName;
        nextPageURL = ndaKiosk.ndaContinue().getUrl();
        System.assertEquals('/apex/ndaesign?id=' + signerId, nextPageURL);
        
        // test error if name is not selected
        ndaKiosk.selected_name = '';
        nextPageURL = ndaKiosk.ndaContinue().getUrl();
        System.assertEquals(null, nextPageURL);
        
        // test restart
        nextPageURL = ndaKiosk.ndaRestart().getUrl();
        System.assertEquals('/apex/ndawelcome?id=' + signerId, nextPageURL);
        
        //=============================
        // Test ndaesign page
        //=============================
        // go to page
        PageReference eSignPage = Page.ndaesign;
        eSignPage.getParameters().put('id', signerId);
        Test.setCurrentPage(eSignPage);
        
        // Create a new controller with signer created above
        ndaSC = new ApexPages.Standardcontroller(ndaSigner);
        ndaKiosk = new NDAKioskController(ndaSC);
        
        // run open page action
        ndaKiosk.ndaEsignPageOpen();
        
        System.assertEquals(ndaKiosk.errmsg, null);      
    }
}