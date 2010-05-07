<%
        /**
         * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
         *
         * This source code is intended only as a supplement to DocuSign SDK
         * and/or on-line documentation.
         * This sample is designed to demonstrate DocuSign features and is not intended
         * for production use. Code and policy for a production application must be
         * developed to meet the specific data and security requirements of the
         * application.
         *
         * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
         * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
         * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
         * PARTICULAR PURPOSE.
         */

         /**
         * index.jsp
         *
         * This is the first login screen. Prompts the user to enter e-mail address and password.
         * Then uses the DocuSign Credential API https://www.docusign.net/api/3.0/Credential.asmx
         * login() method to verify the e-mail and password and return a list of accounts that match the
         * user credentials entered. If there is exactly one matching account (most common),
         * the account properties are stored in the session and the user is redirected to envelopes.jsp.
         * If there is more than on matching account, the user is being redirected to account.jsp to choose.
         *
         * In this example the user account properties are stored in session variables for simplicity.
         * Using J2EE, all user account properties can be stored in a stateful session bean. API service proxy
         * can be instantiated once after successful login and cached.
         */

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="net.docusign.www.API.Credential.*, java.util.*, javax.xml.namespace.QName, java.net.*;"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%      String error = "";
        if (request.getParameter("btnLogin") != null) {
            try {
                String email = request.getParameter("txtEmail");
                String password = request.getParameter("txtPassword");

                //CredentialSoapProxy port = new CredentialSoapProxy(); // Use production

                CredentialSoapProxy port = new CredentialSoapProxy("https://demo.docusign.net/API/3.0/Credential.asmx"); // Use demo

                // Get the list of accounts associated with the e-mail and password entered
                LoginResponseLoginResult result = port.login(email, password);
                if (result.isSuccess()) {
                    ArrayOfAccountAccount account = null;
                    // save in session
                    session.setAttribute("Email", email);
                    session.setAttribute("Password", password);                    
                    if (result.getAccounts().length == 1) {
                        // one account matches
                        account = result.getAccounts()[0];
                        // continue saving account info in session
                        session.setAttribute("AccountID", account.getAccountID());
                        session.setAttribute("AccountName", account.getAccountName());
                        session.setAttribute("UserID", account.getUserID());
                        session.setAttribute("UserName", account.getUserName());
                        response.sendRedirect("envelopes.jsp");
                    } else {
                        // handle multiple accounts selection in accounts.jsp
                        session.setAttribute("ArrayOfAccount.Account", result.getAccounts());
                        response.sendRedirect("accounts.jsp");
                    }
                } else {
                    // If the login failed, the authentication message contains the reason for that
                    // and should be shown to the user
                    error = result.getAuthenticationMessage();
                }
            } catch (Exception ex) {
                error = ex.getMessage();
            }

        }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DocuSign Login</title>
        <link href="style.css" type="text/css" rel="stylesheet">
        <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
    </head>
    <body class="WindowBackground">
        <form method="POST" action="index.jsp">
            <div class="HeaderContent">
                <div class="NoPadding" style="float:left; ">
                    <img src="images/login.png" alt="Login" style="border: 0px;">
                </div>
                <div class="NoPadding" style="float:right;">
                    <img src="images/logo.png" alt="DocuSign Logo" style="border: 0px;">
                </div>
            </div>
            <div class="MainContent">
                    <span class="FieldPromptTextBold">
                        <br>
                        &nbsp;Welcome to DocuSign<br>
                    </span>
                    <span class="FieldPromptText">
                        &nbsp;Login to access your secure account.
                    </span>
                    <br>
                    <br>
                    <table class="TableContent">
                        <tr>
                            <td style="width:62px;text-align:right;white-space:nowrap;">
                                <span class="FieldPromptText">Email</span>
                            </td>
                            <td>
                            <input type="text" name="txtEmail" maxlength="127" style="width:92%;"></td>
                        </tr>
                        <tr>
                            <td style="text-align:right;white-space:nowrap;">
                                <span class="FieldPromptText">Password</span>
                            </td>
                            <td>
                                <input type="password" name="txtPassword" maxlength="127" style="width: 92%;">
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td>
                                <input class="Button" type="submit" name="btnLogin" value="Login >>">&nbsp;
                                <a class="LinkText" href="https://demo.docusign.net/Member/MemberForgotPassword.aspx" style="white-space:nowrap;">Forgot Password?</a>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td>
                                <span class="ErrorMessageText"><%=error%></span>
                            </td>
                        </tr>
                    </table>
            </div>
            <jsp:include page="WEB-INF/jspf/footer.jspf"/>

       </form>
    </body>
</html>
