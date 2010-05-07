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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller to spit back the contents of the LoanCo event log.
 */
public class LogDumpAction implements Controller {
    private String NOT_FOUND_MESSAGE = "The LoanCo event-log file could not be found.  Check the Log4j configuration.";
    private Logger rootLogger = Logger.getRootLogger();
    private String LOG_BODY = "<html><body>%s</body></html>";
    
    /* (non-Javadoc)
     * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    @SuppressWarnings("unchecked")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html");
        
        Enumeration<Appender> appenders = rootLogger.getAllAppenders();
        while(appenders.hasMoreElements()) {
            Appender appender = appenders.nextElement();
            if(appender instanceof FileAppender) {
                writeLogToResponse((FileAppender) appender, response);
                return null;
            }
        }
        
        response.sendError(HttpServletResponse.SC_NOT_FOUND, NOT_FOUND_MESSAGE);
        return null;
    }
    
    /**
     * Writes the log file, obtained from the log4j {@link FileAppender}, to the response for client consumption.
     * 
     * @param fileAppender the log4j file appender
     * @throws IOException thrown if there is an i/o error reading/copying the file
     * @throws FileNotFoundException thrown if the log file is not found
     */
    protected void writeLogToResponse(FileAppender fileAppender, HttpServletResponse response) throws FileNotFoundException, IOException {
    	String logFile = FileUtils.readFileToString(new File(fileAppender.getFile()));
    	logFile = logFile.replace("\n", "<br/>");
    	
    	IOUtils.write(String.format(LOG_BODY, logFile), response.getWriter());
    }
}
