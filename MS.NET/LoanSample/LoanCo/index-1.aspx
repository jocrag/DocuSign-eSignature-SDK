<%@ Page Title="" Language="C#" MasterPageFile="~/FullNav.master" AutoEventWireup="true" CodeBehind="index-1.aspx.cs" Inherits="LoanCo.index_1" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <script language="javascript" type="text/javascript">
    <!-- 
    function checkForm() {
        var why = "";

        var signForm = document.getElementById("signForm");
        
        why += isEmpty(signForm.FirstName.value, "FirstName");
        why += isEmpty(signForm.LastName.value, "LastName");
        why += checkPhone(signForm.Phone.value, "Phone");
        why += checkFloat(signForm.Amount.value, "Amount");
        why += checkEmail(signForm.Email.value, "Email" );
                
        document.getElementById("formErrorText").innerHTML = why; 
        
        if (why != "") {
            return false;
        } else {
            return true;
        }
    }
    // -->
    </script>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
  <div class="content-section">
<% if (!base.CredsAreSet==true)  { %>
     <div id="CredsMissing" class="CredsMissingBanner" >
     Please enter your DocuSign DevCenter credentials in Web.Config<br />
     Don't have creds? Get them <a href="http://www.docusign.com/devcenter/sign_up/register.php" target="devCenter">here</a> 
     </div>
<%} %>
    <form action="FormHandler.aspx" id="signForm" method="post" onsubmit="return checkForm();">
                <div id="formErrorText" class="red"></div>
                <table style="width: 420px;">
                  <tbody>
                    <tr>
                      <td colspan="2"><strong>Loan Information:</strong></td>
                    </tr>
                    <tr>
                      <td>Desired loan amount:</td>
                      <td><input type="text" class="form" name="Amount" /></td>
                    </tr>
                    <tr><td>&nbsp;</td></tr>
                    <tr>
                      <td colspan="2"><strong>Contact Information:</strong></td>
                    </tr>
                    <tr>
                      <td>First Name:</td>
                      <td><input type="text" class="form" style="width: 150px;" name="FirstName" /></td>
                    </tr>
                    <tr>
                      <td>Last Name:</td>
                      <td><input type="text" class="form" style="width: 150px;" name="LastName" /></td>
                    </tr>
                    <tr>
                      <td>Enter your e-mail address:</td>
                      <td><input type="text" class="form" style="width: 150px;" name="Email" /></td>
                    </tr>
                    <tr>
                      <td>Your phone number here:</td>
                      <td><input type="text" class="form" style="width: 150px;" name="Phone" /></td>
                    </tr>
                    <tr><td>&nbsp;</td></tr>
                    <tr>

                      <td colspan="2" align="right"><input type="image" src="images/send.jpg" style="border: 0px; margin-right: 52px;" /></td>
                    </tr>
                  </tbody>
                </table>
						<input type="hidden" name="formid" id="formid" value="form2"/>

	            </form>
              </div>
</asp:Content>
