package com.dtag.bmp.service.aggregation.dto.types;

public class UpdatedUserName {
	private String userId;
	private String emailId;
	private String firstName;
	private String lasstName;
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
	public String getLasstName() {
		return lasstName;
	}
	public void setLasstName(String lasstName) {
		this.lasstName = lasstName;
	}
	@Override
	public String toString() {
		return "UpdatedUserName [userId=" + userId + ", emailId=" + emailId + ", firstName=" + firstName
				+ ", lasstName=" + lasstName + "]";
	}
	
}
