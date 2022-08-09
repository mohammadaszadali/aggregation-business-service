package com.dtag.bmp.service.aggregation.dto.types;

public class ResetReqestBody {
	
	String userId;
	String emailId;
	String firstName;
	String lastName;
	String password="NA";
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "ResetReqestBody [userId=" + userId + ", emailId=" + emailId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", password=" + password + "]";
	}
	
	
}
