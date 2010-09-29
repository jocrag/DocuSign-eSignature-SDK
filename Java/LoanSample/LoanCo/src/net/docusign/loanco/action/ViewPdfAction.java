/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
*/
package net.docusign.loanco.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.docusign.wsclient.APIServiceStub;
import net.docusign.www.api._3_0.RequestPDF;
import net.docusign.www.api._3_0.RequestPDFResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Retrieves the pdf data from the webservice and sets in response.  The pdf can then be saved/viewed.
 */
public class ViewPdfAction implements Controller {
	private APIServiceStub apiService;

	public void setApiService(APIServiceStub apiService) {
		this.apiService = apiService;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String envelopeId = request.getParameter("envelopeId");

		RequestPDF requestPdf = new RequestPDF();
		requestPdf.setEnvelopeID(envelopeId);

		RequestPDFResponse pdfResponse = apiService.RequestPDF(requestPdf);

		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=envelope.pdf");
		IOUtils.copyLarge(pdfResponse.getRequestPDFResult().getPDFBytes().getInputStream(), response.getOutputStream());

		return null;
	}
}