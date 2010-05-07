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
           * download.jsp
           * Uses the DocuSign API https://www.docusign.net/API/3.0/api.asmx
           * requestPDF() method to get the envelope contents as PDF.
           * Outputs the contents of all documents in an envelope as PDF.
           * PDF bytes are written to the servlet output stream.
           * DocuSign API proxy is instantiated in api.jspf
           *
          */
%>



<%@include file="WEB-INF/jspf/api.jspf"%>
<%
        try{
            // Request PDF from the DocuSign API service
            EnvelopePDF envelopePDF = port.requestPDF(request.getParameter("envelopeId"));
            
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("application/pdf");
            response.setContentLength((int)envelopePDF.getPDFBytes().length);
            ServletOutputStream os = null;
            try{
                os = response.getOutputStream();
                os.write(envelopePDF.getPDFBytes());
                os.flush(); 
            }finally{
                if (os != null) os.close();
            }
            
        }catch (Exception x){
            out.print(x.toString());
        }
%>
