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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FontStyleCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FontStyleCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RageItalic"/>
 *     &lt;enumeration value="Mistral"/>
 *     &lt;enumeration value="BradleyHandITC"/>
 *     &lt;enumeration value="KaufmannBT"/>
 *     &lt;enumeration value="Freehand575"/>
 *     &lt;enumeration value="LuciaBT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FontStyleCode")
@XmlEnum
public enum FontStyleCode {

    @XmlEnumValue("RageItalic")
    RAGE_ITALIC("RageItalic"),
    @XmlEnumValue("Mistral")
    MISTRAL("Mistral"),
    @XmlEnumValue("BradleyHandITC")
    BRADLEY_HAND_ITC("BradleyHandITC"),
    @XmlEnumValue("KaufmannBT")
    KAUFMANN_BT("KaufmannBT"),
    @XmlEnumValue("Freehand575")
    FREEHAND_575("Freehand575"),
    @XmlEnumValue("LuciaBT")
    LUCIA_BT("LuciaBT");
    private final String value;

    FontStyleCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontStyleCode fromValue(String v) {
        for (FontStyleCode c: FontStyleCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
