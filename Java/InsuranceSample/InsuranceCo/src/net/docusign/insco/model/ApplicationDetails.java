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
 * Represents the application details supplied by the user.
 */
public class ApplicationDetails {
	private String firstName;
	private String lastName;
	private String carMake;
	private String carModel;
	private String carVIN;
	private String emailDestination;
	private String emailDestinationCC;
	private Boolean idCheck;
	private String accessCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarVIN() {
		return carVIN;
	}

	public void setCarVIN(String carVIN) {
		this.carVIN = carVIN;
	}

	public String getEmailDestination() {
		return emailDestination;
	}

	public void setEmailDestination(String emailDestination) {
		this.emailDestination = emailDestination;
	}

    public String getEmailDestinationCC() {
        return emailDestinationCC;
    }

    public void setEmailDestinationCC(String emailDestinationCC) {
        this.emailDestinationCC = emailDestinationCC;
    }

    public Boolean getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(Boolean idCheck) {
        this.idCheck = idCheck;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
}
