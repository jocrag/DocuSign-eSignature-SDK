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
         * notifications.jsp
         * Uses the DocuSign API https://www.docusign.net/API/3.0/api.asmx
         * correctAndResendEnvelope() method to send notifications to signers.
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
        <title>Send Notifications</title>
    </head>
    <body  class="WindowBackground">
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
                <div class="EnvelopeStatus">
            <%  if (request.getParameter("doSendNotifications") != null) {
            try {

                // Here we store the corrections that in fact contain a list of signers
                // to which we want to send notifications
                Correction correction = new Correction();
                ArrayList<RecipientCorrection> recipientCorrections = new ArrayList<RecipientCorrection>();

                // Request the envelope status to get a list of signers
                EnvelopeStatus envelopeStatus = port.requestStatus(request.getParameter("envelopeId"));

                for (int i=0; i< envelopeStatus.getRecipientStatuses().length;i++) {
                    RecipientStatus recipientStatus = envelopeStatus.getRecipientStatuses()[i];
                    // If the recipient has not already signed, declined or completed the signing process
                    if ((recipientStatus.getStatus() != RecipientStatusCode.Signed) &&
                        (recipientStatus.getStatus() != RecipientStatusCode.Declined) &&
				(recipientStatus.getStatus() != RecipientStatusCode.Completed)) {
                        // And is a signer
                        if (recipientStatus.getType() == RecipientTypeCode.Signer) {
                            // Add the recipient to the corrections list
                            // and the correction will trigger sending a notification e-mail
                            // to the recipient
                            RecipientCorrection corr = new RecipientCorrection();
                            corr.setPreviousUserName(recipientStatus.getUserName());
                            corr.setPreviousEmail(recipientStatus.getEmail());
                            corr.setPreviousRoutingOrder(recipientStatus.getRoutingOrder());
                            corr.setResend(true);
                            corr.setCorrectedUserName(recipientStatus.getUserName());
                            corr.setCorrectedEmail(recipientStatus.getEmail());
                            corr.setCorrectedRoutingOrder(recipientStatus.getRoutingOrder());
                            recipientCorrections.add(corr);
                        }
                    }
                }
                correction.setRecipientCorrections(recipientCorrections.toArray(new RecipientCorrection[0]));
                correction.setEnvelopeID(request.getParameter("envelopeId"));

                // Do the correction using the DocuSign API
                CorrectionStatus status = port.correctAndResendEnvelope(correction);

                // Display the results
                for (int i = 0; i < status.getRecipientCorrectionStatuses().length; i++) {
                    RecipientCorrectionStatus rs = status.getRecipientCorrectionStatuses()[i];
                    RecipientCorrection corr = rs.getRecipientCorrection();
                    out.println("Notification for " + corr.getCorrectedUserName() +
                            " [" + corr.getCorrectedEmail() + "] ");
                    if (rs.isCorrectionSucceeded()) {
                        out.println("succeeded.");
                    } else {
                        out.println("failed.");
                    }
                    out.println("<br>");
                }
                out.println("<br>");
            } catch (Exception x) {
                out.println(x.toString());
            }
        }%>
                </div>
            <table style="border: 0px;  width: 99%; ">
                <tr>
                    <td style="width:240px; vertical-align: bottom;">

                        <%
        if (request.getParameter("doSendNotifications") == null) {
                        %>
                        <span class="FieldPromptText">Send Notifications for Envelope</span><br>
                        <span class="FieldPromptTextBold"><%=request.getParameter("envelopeSubject")%></span>
                        <br><br>

                        <form method="POST" action="notifications.jsp">
                            <input type="hidden" name="envelopeId" value="<%=request.getParameter("envelopeId")%>">
                            <input type="submit" class="ButtonWide" name="doSendNotifications" value="Send Notifications">
                        </form>
                    </td>
                    <%
        }
                    %>
                    <td style="vertical-align: bottom;">
                        <a class="LinkText" href="envelopes.jsp">Back</a>
                        <br><br>
                    </td>
                </tr>
            </table>
            <br>
        </div>
        <jsp:include page="WEB-INF/jspf/footer.jspf"/>
    </body><% } %>
</html>
