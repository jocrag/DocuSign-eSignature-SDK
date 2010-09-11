<%       /**
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
         * accounts.jsp
         *
         * Handles multiple account selection.
         * If the DocuSign Credentials API https://www.docusign.net/api/3.0/Credential.asmx
         * login() method returned more than one account in login.jsp, the list of accounts
         * is temporary stored in session and the user is redirected here to choose.
         * Once the user chooese and confirms the display name, the account properties
         * are stored in session and the user is redirected to envelopes.jsp
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

<%            
			if (session.getAttribute("Email")==null) {
				response.sendRedirect("index.jsp");
			} else {

			ArrayOfAccountAccount[] accounts = (ArrayOfAccountAccount[]) session.getAttribute("ArrayOfAccount.Account");

            if (request.getParameter("selectAccount") != null) {
                ArrayOfAccountAccount account = accounts[Integer.parseInt(request.getParameter("user"))];
                session.setAttribute("AccountID", account.getAccountID());
                session.setAttribute("AccountName", account.getAccountName());
                session.setAttribute("UserID", account.getUserID());
                session.setAttribute("UserName", account.getUserName());
                //session.setAttribute("ArrayOfAccount.Account", "");
                response.sendRedirect("envelopes.jsp");
            }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" type="text/css" rel="stylesheet">
        <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
        <title>Multiple accounts found</title>
    </head>
    <body class="WindowBackground">
        <form method="POST" action="accounts.jsp">
            <div class="HeaderContent">
                <div class="NoPadding" style="float:left; ">
                    <img src="images/login.png" alt="Login" style="border: 0px;">
                </div>
                <div class="NoPadding" style="float:right;">
                    <img src="images/logo.png" alt="DocuSign Logo" style="border: 0px;">
                </div>
            </div>
            <div class="MainContent">
                <div style="padding-left: 8px;">
                 <br>
                <span class="FieldPromptTextBold">Please select your display name:</span>
                <br>
                <select name="user">
                    <%
            for (int i = 0; i < accounts.length; i++) {
                ArrayOfAccountAccount account = accounts[i];
                    %>
                    <option value="<%=i%>"><%=account.getUserName()%> - <%=account.getAccountName()%></option>
                    <%
            }
                    %>
                </select>
                <br><br>
                    <input type="submit" class="Button" name="selectAccount" value="Continue">
                <br><br>
                </div>
            </div>
            <jsp:include page="WEB-INF/jspf/footer.jspf"/>
        </form>
    </body>
</html> <% } %>
