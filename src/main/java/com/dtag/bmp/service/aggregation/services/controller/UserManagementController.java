package com.dtag.bmp.service.aggregation.services.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bmp.service.aggregation.dto.types.SkuReference;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceParty;
import com.dtag.bmp.service.aggregation.dto.types.SkuReferenceUser;
import com.dtag.bmp.service.aggregation.dto.types.UserContact;
import com.dtag.bmp.service.aggregation.services.AggregationCustomerManagementService;
import com.dtag.bmp.service.aggregation.services.SkuReferenceService;
import com.dtag.bmp.service.aggregation.services.UserManagementService;
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
	public class UserManagementController {
		
		private static Logger logger = LoggerFactory.getLogger(UserManagementController.class);
		@Autowired
		private UserManagementService userService;
		@Autowired
		private SkuReferenceService skuReferenceService;
		
		@Autowired
		private  AggregationCustomerManagementService customerService;
		private final String className=this.getClass().getSimpleName();
		/**
		 * This Method will add user
		 * 
		 * @param list
		 * @return
		 * @throws com.fasterxml.jackson.core.JsonProcessingException 
		 * @throws BMException 
		 */
		@ApiOperation(value = "Add user", notes = "Add new user")
		@ApiResponses(value = { @ApiResponse(code = 200, message = "Add new User Successfully"),
				@ApiResponse(code = 500, message = "Internal Server Error") })
		@RequestMapping(value = { "/v1/addContact" }, method = RequestMethod.POST, consumes = { "application/json" })
		public ResponseEntity<?> addUser(@RequestBody UserContact user) throws com.fasterxml.jackson.core.JsonProcessingException {
			ResponseEntity<?> responseEntity = null;
			Integer status=0;
			
			final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
			try {
				
				status=customerService.emailStatus(user.getEmailId());
				if(status!=201) {
				 status =customerService.keyClocCreatekUsers(user);
					if(status!=409) {
						status=customerService.emailStatus(user.getEmailId());
				      String userlist = userService.addUser(user);				
				     	responseEntity = new ResponseEntity<>(userlist, HttpStatus.CREATED);
						}else
						{responseEntity = new ResponseEntity<>( ""+AggregationServiceConstants.EXIT_USER, HttpStatus.CONFLICT);}
					}else {
						
						responseEntity = new ResponseEntity<>( " "+AggregationServiceConstants.EXIT_USER, HttpStatus.CONFLICT);
					}
					
			} catch (Exception e) {
				e.printStackTrace();
			}
			return responseEntity;
		}
		
		
		@RequestMapping(value = { "/skuCId" }, method = RequestMethod.POST)
		public ResponseEntity<?> createServiceSkuDetails(@RequestBody SkuReference skuReference) {
			try {

				SkuReference result = skuReferenceService.save(skuReference);
				return new ResponseEntity<Object>(result, HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
				return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
			}
		}

		@RequestMapping(value = { "/getskuCId" }, method = RequestMethod.GET)
		public ResponseEntity<?> createServiceSku() {
			try {

				String entity = "00";
				String result = skuReferenceService.getId(entity);
				return new ResponseEntity<Object>(result, HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
				return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
			}
		}

		// for partId
		@RequestMapping(value = { "/skuPId" }, method = RequestMethod.POST)
		public ResponseEntity<?> createServiceSkuParty(@RequestBody SkuReferenceParty skuReference) {
			try {

				SkuReferenceParty result = skuReferenceService.saveParty(skuReference);
				return new ResponseEntity<Object>(result, HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
				return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
			}
		}

		@RequestMapping(value = { "/getskuPId" }, method = RequestMethod.GET)
		public ResponseEntity<?> createServiceSkuParty() {
			try {

				String entity = "00";
				String result = skuReferenceService.getPartyId(entity);
				return new ResponseEntity<Object>(result, HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
				return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
			}
		}

		// for User ID
		@RequestMapping(value = { "/skuUserId" }, method = RequestMethod.POST)
		public ResponseEntity<?> createServiceSkuUser(@RequestBody SkuReferenceUser skuReference) {
			try {

				SkuReferenceUser result = skuReferenceService.saveUserId(skuReference);
				return new ResponseEntity<Object>(result, HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
				return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
			}
		}

		@RequestMapping(value = { "/getskuUserId" }, method = RequestMethod.GET)
		public ResponseEntity<?> createServiceUserId() {
			try {

				String entity = "00";
				String result = skuReferenceService.getUserId(entity);
				return new ResponseEntity<Object>(result, HttpStatus.CREATED);
			} catch (Exception e) {
				e.printStackTrace();
				return (new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR));
			}
		}
}
