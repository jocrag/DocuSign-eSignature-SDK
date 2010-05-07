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
package net.docusign.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Calendar;
import java.util.Date;

/**
 * Common utility methods.
 */
public class Util {
	/**
	 * Determines if the value entered is not null or not empty (containing only whitespace).
	 * 
	 * @param text the text
	 * @return whether or not the text is not blank
	 */
	public static boolean isNotBlank(String text) {
		return text != null && !text.trim().isEmpty();
	}
	
	/**
	 * Reads a byte array out of an input stream.
	 * 
	 * @param is the input stream
	 * @return the read byte array
	 * @throws IOException an i/o error thrown during read/write
	 */
	public static byte[] bytesForStream(InputStream is) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		byte[] buffer = new byte[1024 * 4];
		
		int n;
		while(-1 != (n = is.read(buffer))) {
			out.write(buffer, 0, n);
		}
		
		return out.toByteArray();
	}
	
	/**
	 * Reads a string out of an input stream.
	 * 
	 * @param is the input stream
	 * @param encoding the stream's encoding
	 * @return the string for this stream
	 * @throws IOException an i/o error thrown during read/write
	 */
	public static String stringForStream(InputStream is, String encoding) throws IOException {
		StringBuilderWriter sw = new StringBuilderWriter();

		if (encoding == null) {
			copy(new InputStreamReader(is), sw);
		} else {
			copy(new InputStreamReader(is, encoding), sw);
		}

		return sw.toString();
	}
	
	/**
	 * Copies the content from the input stream to the output stream.
	 * 
	 * @param is the input stream
	 * @param os the output stream
	 * @throws IOException an i/o error thrown during read/write
	 */
	public static void copy(InputStream is, OutputStream os) throws IOException {
		byte[] buffer = new byte[1024 * 4];
		
		int n;
		while(-1 != (n = is.read(buffer))) {
			os.write(buffer, 0, n);
		}
	}
	
	/**
	 * Copies the content from the reader to the writer.
	 * 
	 * @param reader the reader
	 * @param writer the writer
	 * @throws IOException an i/o error thrown during read/write
	 */
	public static void copy(Reader reader, Writer writer) throws IOException {
		char[] buffer = new char[1024 * 4];
		
		int n;
		while(-1 != (n = reader.read(buffer))) {
			writer.write(buffer, 0, n);
		}
	}
	
	/**
	 * Zero out the time portion of date.
	 * 
	 * @param date the date
	 * @return date with zeroed time
	 */
	public static Date zeroTimeForDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		return cal.getTime();
	}
	
	/**
	 * Expire time portion of date
	 * 
	 * @param date the date
	 * @return date with expired time
	 */
	public static Date expireTimeForDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		
		return cal.getTime();
	}
}