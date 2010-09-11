<%@ Page Title="" Language="C#" MasterPageFile="~/FullNav.master" AutoEventWireup="true" CodeFile="index.aspx.cs" Inherits="index" %>
<asp:Content ID="Head1" ContentPlaceHolderID="head" runat="server">
    <script language="javascript" type="text/javascript">
    <!--

        /**
        * Validate the form and set validation errors if applicable.
        */
        function checkForm() {
            var why = "";

            var signForm = document.forms[0];

            why += isEmpty(signForm.FirstName.value, "FirstName");
            why += isEmpty(signForm.LastName.value, "LastName");
            why += isEmpty(signForm.Address1.value, "AddressLine1");
            why += isEmpty(signForm.City.value, "City");
            why += isEmpty(signForm.State.value, "State");
            why += isEmpty(signForm.Zip.value, "ZIP");
            why += checkPhone(signForm.Phone.value, "Phone");
            why += checkEmail(signForm.Email.value, "E-mail");

            document.getElementById("formErrorText").innerHTML = why;

            if (why != "") {
                return false;
            }
            else {
                return true;
            }
        }

    
    // -->
    </script>
</asp:Content>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
 <div class="content-section">
<% if (!base.CredsAreSet==true)  { %>
     <div id="CredsMissing" class="CredsMissingBanner" >
     Please enter your DocuSign DevCenter credentials in Web.Config<br />
     Don't have creds? Get them <a href="http://www.docusign.com/devcenter/sign_up/register.php" target="devCenter">here</a> 
     </div>
<%} %>
   <form style="margin: 0; padding: 0;" action="FormHandler.aspx" id="signForm" method="post" onsubmit="return checkForm();">
     <div id="formErrorText" class="red"></div>
     First Name<br />
     <input class="form" style="width: 300px;" name="FirstName" type="text" /><br />
     Last Name<br />
     <input class="form" style="width: 300px;" name="LastName" type="text" /><br />
     Current Address<br />
     <input class="form" style="width: 300px;" name="Address1" type="text" /><br />
     <input class="form" style="width: 300px;" name="Address2" type="text" /><br />
     City/State/ZIP<br />
     <input class="form" style="width: 170px;" name="City" type="text" />
     <select class="form" style="width: 50px;" id="Select1" name="State">
         <option value="AL">AL</option>
         <option value="AK">AK</option>
         <option value="AZ">AZ</option>
         <option value="AR">AR</option>
         <option value="CA">CA</option>
         <option value="CO">CO</option>
         <option value="CT">CT</option>
         <option value="DE">DE</option>
         <option value="DC">DC</option>
         <option value="FL">FL</option>
         <option value="GA">GA</option>
         <option value="HI">HI</option>
         <option value="ID">ID</option>
         <option value="IL">IL</option>
         <option value="IN">IN</option>
         <option value="IA">IA</option>
         <option value="KS">KS</option>
         <option value="KY">KY</option>
         <option value="LA">LA</option>
         <option value="ME">ME</option>
         <option value="MD">MD</option>
         <option value="MA">MA</option>
         <option value="MI">MI</option>
         <option value="MN">MN</option>
         <option value="MS">MS</option>
         <option value="MO">MO</option>
         <option value="MT">MT</option>
         <option value="NE">NE</option>
         <option value="NV">NV</option>
         <option value="NH">NH</option>
         <option value="NJ">NJ</option>
         <option value="NM">NM</option>
         <option value="NY">NY</option>
         <option value="NC">NC</option>
         <option value="ND">ND</option>
         <option value="OH">OH</option>
         <option value="OK">OK</option>
         <option value="OR">OR</option>
         <option value="PA">PA</option>
         <option value="RI">RI</option>
         <option value="SC">SC</option>
         <option value="SD">SD</option>
         <option value="TN">TN</option>
         <option value="TX">TX</option>
         <option value="UT">UT</option>
         <option value="VT">VT</option>
         <option value="VA">VA</option>
         <option value="WA">WA</option>
         <option value="WV">WV</option>
         <option value="WI">WI</option>
         <option value="WY">WY</option>
     </select>
     <input class="form" style="width: 40px;" name="Zip" type="text" /><br />
     Phone<br />
     <input class="form" style="width: 170px;" name="Phone" type="text" /><br />
     E-mail address<br />
     <input class="form" style="width: 170px;" name="Email" type="text" /><br />
     <div style="margin-left: 230px;">
     						<input type="hidden" name="formid" id="formid" value="form1"/>

         <input type="submit" style="background: url(images/apply.png); width:76px; height:23px; border: 0;" value="" />
         <br />
     </div>
   </form>
</div>
</asp:Content>

