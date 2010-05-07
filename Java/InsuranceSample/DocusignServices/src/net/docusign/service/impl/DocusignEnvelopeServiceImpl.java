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
package net.docusign.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.docusign.model.User;
import net.docusign.service.DocusignEnvelopeService;
import net.docusign.util.LogUtil;
import net.docusign.util.Util;
import net.docusign.ws3_0.api.DocumentPDF;
import net.docusign.ws3_0.api.DocumentPDFs;
import net.docusign.ws3_0.api.EnvelopeStatus;
import net.docusign.ws3_0.api.EnvelopeStatusCode;
import net.docusign.ws3_0.api.EnvelopeStatusFilter;
import net.docusign.ws3_0.api.EnvelopeStatusFilterBeginDateTime;
import net.docusign.ws3_0.api.FilteredEnvelopeStatuses;

/**
 * Implements a service to retrieve items & information about envelopes.
 */
public class DocusignEnvelopeServiceImpl extends AuthenticatedDocusignService implements DocusignEnvelopeService {
    private static Log log = LogFactory.getLog(DocusignEnvelopeServiceImpl.class);
    
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignEnvelopeService#getEnvelopeStatus(java.lang.String, net.docusign.insco.model.User)
	 */
	public EnvelopeStatus getEnvelopeStatus(String envelopeId, User user) {
	    log.info(LogUtil.logRequestStatusRequest(envelopeId));
	    EnvelopeStatus envelopeStatus = getApi(user).requestStatus(envelopeId);
	    log.info(LogUtil.logRequestStatusResponse(envelopeStatus.getStatus().value(), envelopeStatus.getSubject()));
	    
	    return envelopeStatus;
	}
	
	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignEnvelopeService#getEnvelopeStatusesInLastDay(net.docusign.model.User)
	 */
	public Map<String, EnvelopeStatusCode> getEnvelopeStatusesInLastDay(User user) throws DatatypeConfigurationException {
	    log.info(LogUtil.logEnvelopeStatusesInLastDayBegin());
	    
		EnvelopeStatusFilter envelopeStatusFilter = new EnvelopeStatusFilter();
		envelopeStatusFilter.setAccountId(user.getAccountId());
		
		Date today = new Date();
		
		GregorianCalendar beginCal = new GregorianCalendar();
		beginCal.setTime(Util.zeroTimeForDate(today));

        EnvelopeStatusFilterBeginDateTime beginTime = new EnvelopeStatusFilterBeginDateTime();
        beginTime.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendar(beginCal));
        envelopeStatusFilter.setBeginDateTime(beginTime);
		
        GregorianCalendar endCal = new GregorianCalendar();
        endCal.setTime(Util.expireTimeForDate(today));
        envelopeStatusFilter.setEndDateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(endCal));
		
        log.info(LogUtil.logRequestStatusesRequest(envelopeStatusFilter));
		FilteredEnvelopeStatuses requestStatuses = getApi(user).requestStatuses(envelopeStatusFilter);
		log.info(LogUtil.logRequestStatusesResponse(requestStatuses));

		Map<String, EnvelopeStatusCode> envelopeStatuses = new HashMap<String, EnvelopeStatusCode>();
		for(EnvelopeStatus envelopeStatus : requestStatuses.getEnvelopeStatuses().getEnvelopeStatus()) {
			envelopeStatuses.put(envelopeStatus.getEnvelopeID(), envelopeStatus.getStatus());
			
			log.info(LogUtil.logEnvelopeStatus(envelopeStatus));
		}

		log.info(LogUtil.logEnvelopeStatusesInLastDayEnd());
		
		return envelopeStatuses;
	}

	/* (non-Javadoc)
	 * @see net.docusign.service.DocusignEnvelopeService#getDocumentsForEnvelopeId(java.lang.String, net.docusign.insco.model.User)
	 */
	public List<DocumentPDF> getDocumentsForEnvelopeId(String envelopeId, User user) {
	    log.info(LogUtil.logRequestDocumentsBegin());

	    log.info(LogUtil.logRequestDocumentPDFsRequest(envelopeId));
	    DocumentPDFs documentPDFs = getApi(user).requestDocumentPDFs(envelopeId);
	    log.info(LogUtil.logRequestDocumentPDFsResponse(documentPDFs));

	    List<DocumentPDF> envelopeDocuments = new ArrayList<DocumentPDF>();
	    
	    if(documentPDFs != null && !documentPDFs.getDocumentPDF().isEmpty()) {
	        envelopeDocuments.addAll(documentPDFs.getDocumentPDF());

	        int i = 0;
	        for(DocumentPDF envelopeDocument : envelopeDocuments) {
	            envelopeDocument.setDocumentID(new BigInteger(String.valueOf(i++)));
	        }
	    }

	    log.info(LogUtil.logRequestDocumentsEnd());
	    return envelopeDocuments;
	}
}
