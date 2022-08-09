package com.dtag.bmp.service.aggregation.services.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bmp.service.aggregation.dto.types.CustomerManagementReq;
import com.dtag.bmp.service.aggregation.dto.types.CustomerRequest;
import com.dtag.bmp.service.aggregation.dto.types.ResetReqestBody;
import com.dtag.bmp.service.aggregation.dto.types.UpdatedUserName;
import com.dtag.bmp.service.aggregation.services.AggregationCustomerManagementService;
import com.dtag.bmp.service.aggregation.util.AggregationServiceConstants;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 *
 * @author TechMahindra
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bsi/5gslices/aggregate")
public class AggregationCustomerManagementController {
	private static Logger logger = LoggerFactory.getLogger(AggregationCustomerManagementController.class);
	@Autowired
	private AggregationCustomerManagementService service;
	
	private final String className=this.getClass().getSimpleName();

	
	
	/**
	 * This Method will save customer
	 * 
	 * @param list
	 * @return
	 * @throws com.fasterxml.jackson.core.JsonProcessingException 
	 * @throws BMException 
	 */
	@ApiOperation(value = "Create New customer", notes = "Create New customer")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Created new customer Successfully"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = { "/v1/createCustomer" }, method = RequestMethod.POST, consumes = { "application/json" })
	public ResponseEntity<?> createNewCustomer(@RequestBody CustomerRequest customerRequest) throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		int status=0;
		String response;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {	
			if(customerRequest.getStatus().equalsIgnoreCase("Active")){
				status=service.emailStatus(customerRequest.getEmailId());
				if(status!=201) {
				status =service.keyClocCreatekUser(customerRequest);
				  if(status==201) {
					response  = service.saveCustomer(customerRequest);
			    responseEntity = new ResponseEntity<>(response, HttpStatus.CREATED);
			    
				}else
				{responseEntity = new ResponseEntity<>( ""+AggregationServiceConstants.EXIT_USER, HttpStatus.CONFLICT);}
			}	else
			{responseEntity = new ResponseEntity<>( ""+AggregationServiceConstants.EXIT_USER, HttpStatus.CONFLICT);}
					
			}else 
			   {
			     status=service.emailStatus(customerRequest.getEmailId());
			      if(status!=201) {
			    	  logger.info(status +" == User not exist");
			        	response = service.saveCustomer(customerRequest);				
			       responseEntity = new ResponseEntity<>(response, HttpStatus.CREATED);
			
					}else {
						logger.info(status +" == User already exist");
						responseEntity = new ResponseEntity<>( ""+AggregationServiceConstants.EXIT_USER, HttpStatus.CONFLICT);
					}
			   }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;
	
	}
	
	
	/**
	 * This will find list of customers
	 * 
	 * @return
	 * @throws com.fasterxml.jackson.core.JsonProcessingException 
	 * 
	 */
	@ApiOperation(value = "Fetch All Customers", notes = "Fetch All Customer(s)")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully returns the list of Customer(s)"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = { "/v1/getCustomers" }, method = { RequestMethod.GET }, produces = { "application/json" })
	public ResponseEntity<?> getAllCustomers() throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {		
			List<CustomerManagementReq> customerList = service.getAllCustomers();	
			
				responseEntity = new ResponseEntity<>(customerList, HttpStatus.OK);
			
		} catch (Exception e) {
			
		}
		return responseEntity;
	}


	
	
	//reset password
	@PostMapping(value = { "/v1/resetPassword" })
	public ResponseEntity<?> resetPassword(@RequestBody ResetReqestBody request) throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {				
				
				String status = service.resetPassword(request);
				 if(status== null) {
					 responseEntity = new ResponseEntity<>("Unable to reset password", HttpStatus.OK);
				 }
				 else {
				responseEntity = new ResponseEntity<>("Hi!, your password has been successfully reset!", HttpStatus.OK);
				 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;
	}
	
	
	@PostMapping(value = { "/v1/updateUserRepresentation" })
	public ResponseEntity<?> updateUserRepresentation(@RequestBody UpdatedUserName request) throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try {				
				
				String status = service.updateUserRepresentation(request);
				 if(status== null) {
					 responseEntity = new ResponseEntity<>("Unable to update UserRepresentation", HttpStatus.OK);
				 }
				 else {
				responseEntity = new ResponseEntity<>("Hi!, your UserRepresentation has been successfully updated!", HttpStatus.OK);
				 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;
	}
}
