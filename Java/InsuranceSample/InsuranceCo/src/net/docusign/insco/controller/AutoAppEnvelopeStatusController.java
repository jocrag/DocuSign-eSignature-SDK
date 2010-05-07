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
package net.docusign.insco.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.docusign.insco.model.EnvelopeDetails;
import net.docusign.service.DocusignEnvelopeService;
import net.docusign.ws3_0.api.ArrayOfRecipientStatus;
import net.docusign.ws3_0.api.DocumentPDF;
import net.docusign.ws3_0.api.EnvelopeStatus;
import net.docusign.ws3_0.api.TabStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller to show status and documents, if available, for a processed envelope.
 */
@Controller
@RequestMapping("/autoAppEnvelopeStatus.html")
public class AutoAppEnvelopeStatusController extends AbstractController {
    private DocusignEnvelopeService docusignEnvelopeService;

    @Autowired
    public void setDocusignEnvelopeService(DocusignEnvelopeService docusignEnvelopeService) {
        this.docusignEnvelopeService = docusignEnvelopeService;
    }

    /**
     * Show the envelope status view.
     *
     * @param request
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/autoAppEnvelopeStatus.html", method = RequestMethod.GET, params="envelopeId")
    public ModelAndView onView(@RequestParam(value="envelopeId", required=true) String envelopeId) throws Exception {
        EnvelopeDetails envelopeDetails = new EnvelopeDetails();
        envelopeDetails.setDocumentPdfs(docusignEnvelopeService.getDocumentsForEnvelopeId(envelopeId, getUser()));
        envelopeDetails.setEnvelopeId(envelopeId);

        EnvelopeStatus envelopeStatus = docusignEnvelopeService.getEnvelopeStatus(envelopeId, getUser());
        envelopeDetails.setEnvelopeStatusCode(envelopeStatus.getStatus());
        envelopeDetails.setTabStatuses(findTabStatuses(envelopeStatus));

        Map<String, Object> model = new HashMap<String, Object>();
        model.put(USER_ATTR, getUser());
        model.put(ENVELOPE_STATUS_ATTR, envelopeDetails);

        return new ModelAndView("autoAppEnvelopeStatus", "model", model);
    }

    @RequestMapping(value = "/autoAppEnvelopeStatus.html", method = RequestMethod.GET, params={"envelopeId", "documentId"})
    public void onDocumentView(HttpServletResponse response, @RequestParam(value="envelopeId", required=true) String envelopeId, @RequestParam(value="documentId", required=true) BigInteger documentId) throws Exception {
        List<DocumentPDF> documentPdfs = docusignEnvelopeService.getDocumentsForEnvelopeId(envelopeId, getUser());

        for(DocumentPDF documentPdf : documentPdfs) {
            if(documentId.equals(documentPdf.getDocumentID())) {
                byte[] documentBytes = documentPdf.getPDFBytes();
                response.setHeader("Content-Disposition", "attachment;filename=" + (documentPdf.getName() == null ? "document.pdf" : documentPdf.getName().replace(' ', '_')));
                response.setContentLength(documentBytes.length);
                response.setContentType("application/pdf");
                response.getOutputStream().write(documentBytes);
                return;
            }
        }
    }

    /**
     * Find the {@link List} of {@link TabStatus} making sure we check for nulls.
     *
     * @param envelopeStatus
     * @return
     */
    protected List<TabStatus> findTabStatuses(EnvelopeStatus envelopeStatus) {
        ArrayOfRecipientStatus recipientStatuses = envelopeStatus.getRecipientStatuses();
        if (recipientStatuses != null && recipientStatuses.getRecipientStatus() != null && !recipientStatuses.getRecipientStatus().isEmpty() && recipientStatuses.getRecipientStatus().get(0).getTabStatuses() != null) {
            return recipientStatuses.getRecipientStatus().get(0).getTabStatuses().getTabStatus();
        }

        return null;
    }
}
