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
          * logout.jsp
          * Invalidates the session and redirects the user to the login screen.
          *
          */
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        <%
            session.invalidate();
            response.sendRedirect("index.jsp");
        %>
    </head>
</html>
