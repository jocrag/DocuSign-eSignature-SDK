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
         * void.jsp
         * Uses the DocuSign API https://www.docusign.net/API/3.0/api.asmx
         * void() method to void an envelope.
         * DocuSign API proxy is instantiated in api.jspf
         */
%>

<%
		
		if (session.getAttribute("Email")==null) {
				response.sendRedirect("index.jsp");
			} else {
	%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/api.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" type="text/css" rel="stylesheet">
        <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
        <title>Void Envelope</title>
    </head>
    <body class="WindowBackground">
        <div class="HeaderContent">
            <div class="NoPadding" style="float:left; ">
                <img src="images/envelopes.png" alt="Envelopes" style="border: 0px;">
            </div>
            <div class="NoPadding" style="float:right;">
                <img src="images/logo.png" alt="DocuSign Logo" style="border: 0px;">
            </div>
        </div>
        <div class="MainContent">
            <br>
            <%  if ((request.getParameter("doVoidEnvelope") != null) && (request.getParameter("reason").length() > 0)) {
            try {
                // Void the envelope
                VoidEnvelopeStatus ret = port.voidEnvelope(request.getParameter("envelopeId"), request.getParameter("reason"));
                if (ret.isVoidSuccess()) {
                    out.println("Envelope voided.");
                } else {
                    out.println("Envelope could NOT be voided.");
                }
            } catch (Exception x) {
                out.println(x.toString());
            }

        }
            %>
            <form method="POST" action="void.jsp">
                <table style="border: 0px;  width: 99%; ">
                    <tr>
                        <td colspan="2" style="vertical-align: bottom;">

                            <%
        if ((request.getParameter("doVoidEnvelope") == null) || (request.getParameter("reason").length() == 0)) {
                            %>

                            <span class="FieldPromptTextBold">Void Envelope '<%=request.getParameter("envelopeSubject")%>'</span>
                            <br><br>
                            <input type="hidden" name="envelopeSubject" value="<%=request.getParameter("envelopeSubject")%>">
                            <input type="hidden" name="envelopeId" value="<%=request.getParameter("envelopeId")%>">
                            <span class="FieldPromptText">Enter reason:</span><br>
                            <textarea rows="3" cols="30" name="reason" style="width: 96%; height: 60px;"></textarea>
                            <br><br>
                        </td>
                    </tr>
                    <tr>
                        <td style="vertical-align: bottom; width: 120px;">
                            <input class="ButtonWide" type="submit" name="doVoidEnvelope" value="Void Envelope">

                        </td>
                        <%
        }
                        %>
                        <td style="vertical-align: bottom; text-align: right; padding-right: 8px;">
                            <a class="LinkText" href="envelopes.jsp">Back</a>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <jsp:include page="WEB-INF/jspf/footer.jspf"/>
    </body><% } %>
</html>
