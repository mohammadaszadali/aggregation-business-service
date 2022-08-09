package com.dtag.bmp.service.aggregation.dto.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerInfo {
	
	@JsonProperty("crmId") 
	private String crmId;
	
	@JsonProperty("orderLimit")
	private String orderLimit;
	
	@JsonProperty("users")
	private List<UserDTO> users;

	public String getCrmId() {
		return crmId;
	}

	public void setCrmId(String crmId) {
		this.crmId = crmId;
	}

	public String getOrderLimit() {
		return orderLimit;
	}

	public void setOrderLimit(String orderLimit) {
		this.orderLimit = orderLimit;
	}

	public List<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}
	
}
