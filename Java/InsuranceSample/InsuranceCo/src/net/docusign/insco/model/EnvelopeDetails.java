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
package net.docusign.insco.model;

import java.util.List;

import net.docusign.ws3_0.api.DocumentPDF;
import net.docusign.ws3_0.api.EnvelopeStatusCode;
import net.docusign.ws3_0.api.TabStatus;

/**
 * Represents a processed envelope and its related documents.
 */
public class EnvelopeDetails {
    private String envelopeId;
    private EnvelopeStatusCode envelopeStatusCode;
    private List<DocumentPDF> documentPdfs;
    private List<TabStatus> tabStatuses;

    /**
     * <p>Obtain the {@link String}.</p>
     *
     * @return the envelopeId
     */
    public String getEnvelopeId() {
        return envelopeId;
    }

    /**
     * <p>Set the {@link String}.</p>
     *
     * @param envelopeId the envelopeId to set
     */
    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    /**
     * <p>Obtain the {@link EnvelopeStatusCode}.</p>
     *
     * @return the envelopeStatusCode
     */
    public EnvelopeStatusCode getEnvelopeStatusCode() {
        return envelopeStatusCode;
    }

    /**
     * <p>Set the {@link EnvelopeStatusCode}.</p>
     *
     * @param envelopeStatusCode the envelopeStatusCode to set
     */
    public void setEnvelopeStatusCode(EnvelopeStatusCode envelopeStatusCode) {
        this.envelopeStatusCode = envelopeStatusCode;
    }

    /**
     * <p>Obtain the {@link List<DocumentPDF>}.</p>
     *
     * @return the documentPdfs
     */
    public List<DocumentPDF> getDocumentPdfs() {
        return documentPdfs;
    }

    /**
     * <p>Set the {@link List<DocumentPDF>}.</p>
     *
     * @param documentPdfs the documentPdfs to set
     */
    public void setDocumentPdfs(List<DocumentPDF> documentPdfs) {
        this.documentPdfs = documentPdfs;
    }

    /**
     * <p>Obtain the {@link List<TabStatus>}.</p>
     *
     * @return the tabStatuses
     */
    public List<TabStatus> getTabStatuses() {
        return tabStatuses;
    }

    /**
     * <p>Set the {@link List<TabStatus>}.</p>
     *
     * @param tabStatuses the tabStatuses to set
     */
    public void setTabStatuses(List<TabStatus> tabStatuses) {
        this.tabStatuses = tabStatuses;
    }
}
