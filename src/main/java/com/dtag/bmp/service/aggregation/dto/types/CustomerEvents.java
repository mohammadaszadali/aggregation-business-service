package com.dtag.bmp.service.aggregation.dto.types;



import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerEvents {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("customerManagement")
	private CustomerManagementReq CustomerManagement;
	public CustomerManagementReq getCustomerManagement() {
		return CustomerManagement;
	}
	public void setCustomerManagement(CustomerManagementReq customerManagement) {
		CustomerManagement = customerManagement;
	}
	@Override
	public String toString() {
		return "Event [CustomerManagement=" + CustomerManagement + "]";
	}


	

	

	
	
}
