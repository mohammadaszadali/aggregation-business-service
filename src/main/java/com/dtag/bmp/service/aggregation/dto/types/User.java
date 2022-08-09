package com.dtag.bmp.service.aggregation.dto.types;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
	
@JsonIgnore	
private String userId;
private String CID;
private String firstname;
private String lastName;
private String username;
private String password;
private String email;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}

public String getCID() {
	return CID;
}
public void setCID(String cID) {
	CID = cID;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", CID=" + CID + ", firstname=" + firstname + ", lastName=" + lastName
			+ ", username=" + username + ", password=" + password + ", email=" + email + "]";
}



}
