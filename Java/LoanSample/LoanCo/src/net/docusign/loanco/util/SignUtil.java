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
package net.docusign.loanco.util;

import net.docusign.www.api._3_0.AnchorTab;
import net.docusign.www.api._3_0.Tab;
import net.docusign.www.api._3_0.TabTypeCode;

import org.apache.axis2.databinding.types.NonNegativeInteger;
import org.apache.axis2.databinding.types.PositiveInteger;

public class SignUtil {
	public static Tab createTab(PositiveInteger recipientId, PositiveInteger documentId, String name, String value,
			String pageNum, String xPos, String yPos) {
		Tab tab = new Tab();
		tab.setRecipientID(recipientId);
		tab.setDocumentID(documentId);
		tab.setType(TabTypeCode.Custom);
		tab.setPageNumber(new NonNegativeInteger(pageNum));
		tab.setTabLabel(name);
		tab.setName(name);
		tab.setValue(value);
		tab.setXPosition(new NonNegativeInteger(xPos));
		tab.setYPosition(new NonNegativeInteger(yPos));
		return tab;
	}

	public static Tab createTab(PositiveInteger recipientId, PositiveInteger documentId, String name, String value,
			String anchorString, double xOffset, double yOffset) {
		Tab tab = new Tab();
		tab.setRecipientID(recipientId);
		tab.setDocumentID(documentId);
		tab.setType(TabTypeCode.Custom);
		tab.setTabLabel(name);
		tab.setName(name);
		tab.setValue(value);

		AnchorTab anchor = new AnchorTab();
		anchor.setAnchorTabString(anchorString);
		anchor.setXOffset(xOffset);
		anchor.setYOffset(yOffset);
		
		tab.setAnchorTabItem(anchor);
		return tab;
	}

	public static Tab createTab(PositiveInteger recipientId, PositiveInteger documentId, TabTypeCode tabTypeCode,
			String pageNum, String xPos, String yPos) {
		Tab tab = new Tab();
		tab.setRecipientID(recipientId);
		tab.setDocumentID(documentId);
		tab.setType(tabTypeCode);
		tab.setPageNumber(new NonNegativeInteger(pageNum));
		tab.setXPosition(new NonNegativeInteger(xPos));
		tab.setYPosition(new NonNegativeInteger(yPos));
		return tab;
	}

	public static Tab createTab(PositiveInteger recipientId, PositiveInteger documentId, TabTypeCode tabTypeCode,
			String anchorString, double xOffset, double yOffset) {
		Tab tab = new Tab();
		tab.setRecipientID(recipientId);
		tab.setDocumentID(documentId);
		tab.setType(tabTypeCode);

		AnchorTab anchor = new AnchorTab();
		anchor.setAnchorTabString(anchorString);
		anchor.setXOffset(xOffset);
		anchor.setYOffset(yOffset);
		
		tab.setAnchorTabItem(anchor);
		return tab;
	}
}