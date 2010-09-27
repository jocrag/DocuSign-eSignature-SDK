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

package net.docusign.ws3_0.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrectionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvelopeSettingsCorrectionStatus" type="{http://www.docusign.net/API/3.0}EnvelopeSettings" minOccurs="0"/>
 *         &lt;element name="RecipientCorrectionStatuses" type="{http://www.docusign.net/API/3.0}ArrayOfRecipientCorrectionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectionStatus", propOrder = {
    "envelopeSettingsCorrectionStatus",
    "recipientCorrectionStatuses"
})
public class CorrectionStatus {

    @XmlElement(name = "EnvelopeSettingsCorrectionStatus")
    protected EnvelopeSettings envelopeSettingsCorrectionStatus;
    @XmlElement(name = "RecipientCorrectionStatuses")
    protected ArrayOfRecipientCorrectionStatus recipientCorrectionStatuses;

    /**
     * Gets the value of the envelopeSettingsCorrectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeSettings }
     *     
     */
    public EnvelopeSettings getEnvelopeSettingsCorrectionStatus() {
        return envelopeSettingsCorrectionStatus;
    }

    /**
     * Sets the value of the envelopeSettingsCorrectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeSettings }
     *     
     */
    public void setEnvelopeSettingsCorrectionStatus(EnvelopeSettings value) {
        this.envelopeSettingsCorrectionStatus = value;
    }

    /**
     * Gets the value of the recipientCorrectionStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientCorrectionStatus }
     *     
     */
    public ArrayOfRecipientCorrectionStatus getRecipientCorrectionStatuses() {
        return recipientCorrectionStatuses;
    }

    /**
     * Sets the value of the recipientCorrectionStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientCorrectionStatus }
     *     
     */
    public void setRecipientCorrectionStatuses(ArrayOfRecipientCorrectionStatus value) {
        this.recipientCorrectionStatuses = value;
    }

}
