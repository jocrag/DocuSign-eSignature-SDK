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
         * envelopes.jsp
         *
         * Uses the DocuSign API https://www.docusign.net/API/3.0/api.asmx
         * requestStatuses() method to get the status of all envelopes sent by the logged in user.
         * DocuSign API proxy is instantiated in api.jspf
         * EnvelopeStatusFilter can be used to limit the number of envelopes shown.
         *
         */
%>

<%
		
		if (session.getAttribute("Email")==null) {
				response.sendRedirect("index.jsp");
			} else {
	%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/api.jspf"%>
<%@page import="java.lang.reflect.Array;"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DocuSign Envelopes</title>
        <link href="style.css" type="text/css" rel="stylesheet">
        <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
        <script language="javascript" type="text/javascript" src="prototype.js"></script>
        <script language="javascript" type="text/javascript" src="accordian.js"></script>
        <SCRIPT language="javascript" type="text/javascript">
            Event.observe(window,'load',init,false);
            function init() {
                accordian = new Accordian('sectionContainer','h3');
            }
        </SCRIPT>
        <SCRIPT language="JavaScript">
		function submitform()
		{
		  document.myform.submit();
		}
		</SCRIPT>

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
            <span style="margin-left: 5px;" class="FieldPromptTextBold"><%=accountName%></span>
            <br>
            <span style="margin-left: 5px;" class="FieldPromptText"><%=userName%> envelopes</span>
            <br>
            <div style="float:left; margin-left: 5px; padding-right: 10px; margin-top: 8px; height: 22px;">
                <form action="envelopes.jsp" method="POST">
                    <input class="Button" type="submit" value="Refresh">
                </form>
            </div>
            <div style="margin-top: 8px; padding-right: 10px; height: 22px;">
                <form action="logout.jsp" method="POST">
                    <input class="Button" type="submit" value="Logout">
                </form>
            </div>

            <div id="sectionContainer">


                <%
		int size;		
        try {
			
				
			AddressBookItem[] result1 = port.getAddressBookItems(accountId);
			size = Array.getLength(result1);
			
            EnvelopeStatusFilter envelopeStatusFilter = new EnvelopeStatusFilter();
            envelopeStatusFilter.setAccountId(accountId);

            // Request envelope statuses
            FilteredEnvelopeStatuses result = port.requestStatuses(envelopeStatusFilter);

			if (request.getParameter("mail") != null) {
				
				out.print(request.getParameter("envelopeID"));
				
				DocumentPDFs result2 = port.requestDocumentPDFsRecipientsView(request.getParameter("envelopeID"), "Tony", "tony@smartmobilesolutions.com");
			}	
			
            // Iterate through the returned EnvelopeStatus objects and display details
            for (int i = 0; i < result.getEnvelopeStatuses().length; i++) {
                EnvelopeStatus envelopeStatus = result.getEnvelopeStatuses()[i];
                %>

                <div class="section" id="s<%=i%>">
                    <H3><%=envelopeStatus.getSubject()%></H3>
                    <div style="float:left;" class="EnvelopeStatus"><%=envelopeStatus.getStatus().toString()%></div>
                    <div style="text-align: right; padding-right: 10px;" class="EnvelopeStatus"><a class="LinkText" target="blank" href="download.jsp?envelopeId=<%=envelopeStatus.getEnvelopeID()%>">Download PDF</a></div>
                    <div class="contents" style="DISPLAY: none">
                        <table style="border: 0px; margin-top: 5px;">
                            <%  
                            for (int rIndex = 0; rIndex < envelopeStatus.getRecipientStatuses().length; rIndex++){
                            	RecipientStatus recipientStatus = envelopeStatus.getRecipientStatuses()[rIndex];
                            %>

                            <tr>
                                <td>
                                    <%
                        if (rIndex == 0) {
                            out.print("<b>To:</b>");
                        }
                                    %>
                                </td>
                                <td>
                                    <%=recipientStatus.getUserName()%>
                                </td>
                                <td>
                                    <%=recipientStatus.getStatus()%>
                                </td>
                            </tr>

                            <%
                        }
                            %>
                        </table>


                        <%
                        boolean tableHeaderPrinted = false;
                        for (int customFieldIndex = 0; customFieldIndex < envelopeStatus.getCustomFields().length; customFieldIndex++) {
                            CustomField customField = envelopeStatus.getCustomFields()[customFieldIndex];
                            if ((customField.getValue() != null) && (customField.getValue().length() != 0) && (customFieldIndex < 2)) {
                                if (!tableHeaderPrinted) {
                                    out.println("<table>");
                                    tableHeaderPrinted = true;
                                }
                        %>
                        <tr>
                            <td><b><%=customField.getName()%></b></td>
                            <td><%=customField.getValue()%></td>
                        </tr>
                        <%
                            }
                        }
                        if (tableHeaderPrinted) {
                            out.println("</table>");
                        }
                        %>

                        <table border="0">
                            <tr>
                                <td>
                                    <b>Created:</b>
                                </td>
                                <td>
                                    <%=envelopeStatus.getCreated().getTime()%>
                                </td>
                            </tr>

                            <%
                        if (envelopeStatus.getCompleted() != null) {
                            %>
                            <tr>
                                <td>
                                    <b>Completed:</b>
                                </td>
                                <td>
                                    <%=envelopeStatus.getCompleted().getTime()%>
                                </td>
                            </tr>
                            <%
                        }
                            %>

                        </table>
                        <table style="border: 0px; width: 96%;">
                            <tr>
                                <td style="width: 55%;">
                                    <%
                        if ((envelopeStatus.getStatus() == EnvelopeStatusCode.Sent) || (envelopeStatus.getStatus() == EnvelopeStatusCode.Delivered)) {
                                    %>
                                    <div style="margin-top: 5px;">
                                        <form action="notifications.jsp" method="POST">
                                            <input type="hidden" name="envelopeId" value="<%=envelopeStatus.getEnvelopeID()%>">
                                            <input type="hidden" name="envelopeSubject" value="<%=envelopeStatus.getSubject()%>">
                                            <input class="ButtonWide" type="submit" value="Send Notifications">
                                        </form>
                                    </div>
                                    <%
                        }
                                    %>
                                </td>
                                <td>
                                    <%
                        if ((envelopeStatus.getStatus() == EnvelopeStatusCode.Sent) ||
                                (envelopeStatus.getStatus() == EnvelopeStatusCode.Delivered)) {
                                    %>
                                    <div style="margin-top: 5px;">
                                        <form action="void.jsp" method="POST">
                                            <input type="hidden" name="envelopeId" value="<%=envelopeStatus.getEnvelopeID()%>">
                                            <input type="hidden" name="envelopeSubject" value="<%=envelopeStatus.getSubject()%>">
                                            <input class="ButtonWide" type="submit" value="Void Envelope" >
                                        </form>
                                    </div>
                                    <%
                        }
                                    %>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>

                <%
            }
        } catch (Exception ex) {
            out.println(ex.toString());
        }
                %>
            </div>
        </div>
        <jsp:include page="WEB-INF/jspf/footer.jspf"/>
    </body><% } %>
</html>
