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

/**
 * Represents the insured car details supplied by the user.
 */
public class Car {
	private String make;
	private String model;
	private String VIN;
	
	public String getCarMake() {
		return make;
	}
	
	public void setMake(String carMake) {
		this.make = carMake;
	}
	
	public String getCarModel() {
		return model;
	}
	
	public void setModel(String carModel) {
		this.model = carModel;
	}
	
	public String getCarVIN() {
		return VIN;
	}
	
	public void setVIN(String carVIN) {
		this.VIN = carVIN;
	}
}
