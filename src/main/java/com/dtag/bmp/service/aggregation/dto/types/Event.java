package com.dtag.bmp.service.aggregation.dto.types;



import com.fasterxml.jackson.annotation.JsonProperty;

public class Event{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("customerManagement")
	private CustomerManagementDTO CustomerManagement;
	public CustomerManagementDTO getCustomerManagement() {
		return CustomerManagement;
	}
	public void setCustomerManagement(CustomerManagementDTO customerManagement) {
		CustomerManagement = customerManagement;
	}
	@Override
	public String toString() {
		return "Event [CustomerManagement=" + CustomerManagement + "]";
	}


	

	

	
	
}
