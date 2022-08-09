package com.dtag.bmp.service.aggregation.errors;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value={"statusCode"})
public class CustomerServiceErrorResponse {
	private List<ErrorResponse> errorResponse = new ArrayList<>();
	@JsonIgnore
	private int statusCode;

	public List<ErrorResponse> getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(List<ErrorResponse> errorResponse) {
		this.errorResponse = errorResponse;
	}

	public CustomerServiceErrorResponse() {
		super();
	}

	public CustomerServiceErrorResponse(List<ErrorResponse> errorResponse) {
		super();
		this.errorResponse = errorResponse;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "CustomerServiceErrorResponse [errorResponse=" + errorResponse + ", statusCode=" + statusCode + "]";
	}

	
}
