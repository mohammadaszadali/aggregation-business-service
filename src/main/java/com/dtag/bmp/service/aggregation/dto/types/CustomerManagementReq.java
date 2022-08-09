package com.dtag.bmp.service.aggregation.dto.types;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CustomerManagementNew")
public class CustomerManagementReq {
	@Id
	private String customerId;
	private CustomerManagementRequest customerManagementRequest;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public CustomerManagementRequest getCustomerManagementRequest() {
		return customerManagementRequest;
	}
	public void setCustomerManagementRequest(CustomerManagementRequest customerManagementRequest) {
		this.customerManagementRequest = customerManagementRequest;
	}
    
}
