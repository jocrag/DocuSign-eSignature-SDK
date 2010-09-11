using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Signing;

namespace InsuranceCo
{
    /// <summary>
    /// This just has some methods that create some common api objects to save typing and avoid cluttering up the main
    /// process code. Many of the values here are defaulted for the demo.
    /// </summary>
    public class ApiHelper
    {
        public static Signing.DocuSignWeb.Recipient MakeRecipient(string email, string firstName, string lastName, bool isEmbedded, string clientUserId)
        {
            Signing.DocuSignWeb.Recipient r = new Signing.DocuSignWeb.Recipient();
            r.Email = email;
            r.UserName = firstName + " " + lastName;
            r.Type = Signing.DocuSignWeb.RecipientTypeCode.Signer;
            r.RequireIDLookup = false;
            if (isEmbedded)
            {
                r.CaptiveInfo = new Signing.DocuSignWeb.RecipientCaptiveInfo();
                r.CaptiveInfo.ClientUserId = clientUserId;
                r.SignatureInfo = new Signing.DocuSignWeb.RecipientSignatureInfo();
                r.SignatureInfo.SignatureInitials =
                    (firstName.Length > 0 ? firstName.Substring(0, 1) : "")
                    + (lastName.Length > 0 ? lastName.Substring(0, 1) : "");
                r.SignatureInfo.FontStyle = Signing.DocuSignWeb.FontStyleCode.BradleyHandITC;
                r.SignatureInfo.SignatureName = firstName + " " + lastName;
            }
            return r;
        }

        public static Signing.DocuSignWeb.Recipient AddIDLookupToRecipient(Signing.DocuSignWeb.Recipient r, string address1, string address2, string city, string state, string zip)
        {

            r.RequireIDLookup = true;
            r.IDCheckConfigurationName = "ID Check $";
            if (address1 != null && city != null && state != null && zip != null)
            {

                r.IDCheckInformationInput = new Signing.DocuSignWeb.IDCheckInformationInput();
                r.IDCheckInformationInput.AddressInformationInput = new Signing.DocuSignWeb.AddressInformationInput();
                r.IDCheckInformationInput.AddressInformationInput.DisplayLevel = Signing.DocuSignWeb.DisplayLevelCode.Editable;
                r.IDCheckInformationInput.AddressInformationInput.DisplayLevelSpecified = true;
                r.IDCheckInformationInput.AddressInformationInput.ReceiveInResponse = true;
                r.IDCheckInformationInput.AddressInformationInput.ReceiveInResponseSpecified = true;
                r.IDCheckInformationInput.AddressInformationInput.AddressInformation = new Signing.DocuSignWeb.AddressInformation();
                r.IDCheckInformationInput.AddressInformationInput.AddressInformation.Street1 = address1;
                if (address2 != null)
                {
                    r.IDCheckInformationInput.AddressInformationInput.AddressInformation.Street2 = address2;
                }
                r.IDCheckInformationInput.AddressInformationInput.AddressInformation.City = city;
                r.IDCheckInformationInput.AddressInformationInput.AddressInformation.State = state;
                r.IDCheckInformationInput.AddressInformationInput.AddressInformation.Zip = zip;
            }
            return r;
        }
        public static Signing.DocuSignWeb.Recipient AddPhoneAuthToRecipient(Signing.DocuSignWeb.Recipient r, string phoneNumber)
        {

            r.RequireIDLookup = true;
            r.IDCheckConfigurationName = "Phone Auth $";
            r.PhoneAuthentication = new Signing.DocuSignWeb.RecipientPhoneAuthentication();
            r.PhoneAuthentication.RecipMayProvideNumber = true;
            r.PhoneAuthentication.RecipMayProvideNumberSpecified = true;
            r.PhoneAuthentication.RecordVoicePrint = true;
            r.PhoneAuthentication.RecordVoicePrintSpecified = true;
            if (phoneNumber != null)
            {
                r.PhoneAuthentication.SenderProvidedNumbers = new string[1];
                r.PhoneAuthentication.SenderProvidedNumbers[0] = phoneNumber;
            }
            return r;
        }
        public static Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion MakeRecipientTokenAuthAssert(string assertionId)
        {
            Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion assert = new Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertion();
            assert.AssertionID = assertionId;
            assert.AuthenticationInstant = DateTime.Now;
            assert.AuthenticationMethod = Signing.DocuSignWeb.RequestRecipientTokenAuthenticationAssertionAuthenticationMethod.Password;
            assert.SecurityDomain = "LoanCo Demo";

            return assert;
        }

        public static Signing.LinkedDocument MakeDocument(string documentName, string fqFileName)
        {
            LinkedDocument doc = new LinkedDocument();
            doc.Document.Name = documentName;
            using (System.IO.FileStream streamReader = new System.IO.FileStream(fqFileName, System.IO.FileMode.Open, System.IO.FileAccess.Read))
            {
                byte[] pdfBytes = new byte[streamReader.Length];
                streamReader.Read(pdfBytes, 0, (int)streamReader.Length);
                doc.Document.PDFBytes = pdfBytes;
            }
            return doc;
        }

        public static Signing.DocuSignWeb.TemplateReferenceFieldDataDataValue GetTemplateField(string tabLabel, string fieldValue)
        {
            Signing.DocuSignWeb.TemplateReferenceFieldDataDataValue fld = new Signing.DocuSignWeb.TemplateReferenceFieldDataDataValue();
            fld.TabLabel = (tabLabel == null) ? "" : tabLabel;
            fld.Value = (fieldValue == null) ? "" : fieldValue.Trim();
            return fld;
        }
        /// <summary>
        /// Makes a collection of Template form fields from a dictionary of Key Value pairs. 
        /// </summary>
        /// <param name="KeyValueDict">The form data expressed as field names and values</param>
        /// <returns></returns>
        public static Signing.DocuSignWeb.TemplateReferenceFieldData MakeTemplateFormFields(Dictionary<string, string> KeyValueDict)
        {
            List<Signing.DocuSignWeb.TemplateReferenceFieldDataDataValue> fields = new List<Signing.DocuSignWeb.TemplateReferenceFieldDataDataValue>();
            // iterate over formfields
            foreach (KeyValuePair<string, string> kvp in KeyValueDict)
            {
                fields.Add(GetTemplateField(kvp.Key, kvp.Value));
            }

            // and add them to the template
            Signing.DocuSignWeb.TemplateReferenceFieldData fieldData = new Signing.DocuSignWeb.TemplateReferenceFieldData();
            fieldData.DataValues = fields.ToArray();
            return fieldData;

        }
    }  

}
