package com.dtag.bmp.service.aggregation.dto.types;

import java.io.Serializable;



public class UserLogin implements Serializable {

	private static final long serialVersionUID = 1L;
   
	private String userName;

	

	private String password;

	public UserLogin()

	{

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLogin [userName=" + userName + ", password=" + password + "]";
	}
	

	

	
}
