package com.dtag.bmp.service.aggregation.dto.types;

public class KeyClockUser {
	
	
 private String Id;
private String userName;

private String emailId;

private String familyName;

private String givenName;

private String password;
private String customerType;

public KeyClockUser()

{

}

public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}



public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getFamilyName() {
	return familyName;
}

public void setFamilyName(String familyName) {
	this.familyName = familyName;
}

public String getGivenName() {
	return givenName;
}

public void setGivenName(String givenName) {
	this.givenName = givenName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



public String getCustomerType() {
	return customerType;
}

public void setCustomerType(String customerType) {
	this.customerType = customerType;
}

}
