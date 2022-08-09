package com.dtag.bmp.service.aggregation.dto.types;

public class ResetPassword {
	private String customerId;
	private String userName;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "ResetPassword [customerId=" + customerId + ", userName=" + userName + "]";
	}

}
