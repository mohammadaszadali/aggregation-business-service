package com.dtag.bmp.service.aggregation.services.wrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.dtag.bmp.service.aggregation.dto.types.CustomerManagementReq;
import com.dtag.bmp.service.aggregation.dto.types.CustomerManagementRequest;
import com.dtag.bmp.service.aggregation.dto.types.EmailRequestTempPass;
import com.dtag.bmp.service.aggregation.dto.types.KeyClockUser;
import com.dtag.bmp.service.aggregation.dto.types.ResetReqestBody;
import com.dtag.bmp.service.aggregation.dto.types.UpdatedUserName;
import com.dtag.bmp.service.aggregation.dto.types.UserContact;
import com.dtag.bmp.service.aggregation.services.CustAccSkuAdapterImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class HelperAdapter  {
	private Logger logger = LoggerFactory.getLogger(HelperAdapter.class);
	@Autowired
	private RestTemplate template;
		
	@Value("${coreCustomer.url}")
	private String coreUrl;
	
	@Value("${dtagCustomer.url}")
	private String dtagUrl;
	
	@Value("${coreCreateCustomer}")
	private String coreCreateUrl;
	
	@Value("${dtagCreateCustomer}")
	private String dtagCreateUrl;
	
	@Value("${dtagGetCustomer}")
	private String dtagGetUrl;
	
	@Value("${keyclockurl}")
	private String keyclockurl;
	
	@Value("${resetpwdkeyclockurl}")
	private String resetpwdkeyclockurl;
	
	@Value("${adduser}")
	private String adduser;
	@Value("${userlogin}")
	private String userLogin;
	
	@Value("${keycloak.mail.url}")
	private String emailurl;
	
	@Value("${keycloak.userRepre.url}")
	private String userRepre;
	
	@Value("${datg.email}")
	private String getbyEmail;
	
	
	@Autowired
	CustAccSkuAdapterImpl adapterWrapper;
	private ApplicationEventPublisher publisher;
	
	public List<CustomerManagementRequest> invokeCoreCustomerCreate(CustomerManagementRequest createCustomerRequest)
			throws Exception {
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		CustomerManagementRequest customerCreationResponse = new CustomerManagementRequest();
		List<CustomerManagementRequest> customerCreationResponseList = new ArrayList<>();
		try {		
		
			HttpHeaders header = new HttpHeaders();
			ObjectMapper objectMapper = new ObjectMapper();
			header.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Object> entity = new HttpEntity<>(createCustomerRequest, header);
			
			 customerCreationResponse = template.postForObject(coreUrl + coreCreateUrl, entity, CustomerManagementRequest.class);
			 
			 customerCreationResponseList.add(customerCreationResponse);	
		} catch (HttpClientErrorException e) {
			e.getResponseBodyAsString();
		} catch (Exception e) {
			throw e;
		}
		return customerCreationResponseList;
	}
	
	public String invokeDTAGCustomerCreate(CustomerManagementReq customerManagmentRequest )
			throws Exception {
		final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String response = null;
		try {		
		
			HttpHeaders header = new HttpHeaders();
			
			header.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Object> entity = new HttpEntity<>(customerManagmentRequest, header);
			logger.info("###customerManagmentRequest");
			 logger.info(dtagUrl + dtagCreateUrl +entity);
			  response = template.postForObject(dtagUrl + dtagCreateUrl, entity, String.class);
			 logger.info("#####Customer Create successfully");
			
		} catch (HttpClientErrorException e) {
			e.getResponseBodyAsString();
		} catch (Exception e) {
			throw e;
		}	
		
		return response;
	}
	
	
		
  //get all customer service
	public List<CustomerManagementReq> getAllCustomers() {
		List<CustomerManagementReq> customerCreationResponseList =null;
		HttpHeaders header = new HttpHeaders();
			
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> entity = new HttpEntity<>(header);
		logger.info(dtagUrl+dtagGetUrl +entity);
		ResponseEntity<?> respEntity = template.exchange(dtagUrl+dtagGetUrl, HttpMethod.GET, entity, List.class);
		customerCreationResponseList = getModelCustomerResponse(customerCreationResponseList, (List<Object>) respEntity.getBody());
		//sorting by name
		customerCreationResponseList.sort((CustomerManagementReq customer1, CustomerManagementReq customer2) -> customer1.getCustomerManagementRequest().getContactDetails().get(0).getFirstName().compareTo
				(customer2.getCustomerManagementRequest().getContactDetails().get(0).getFirstName()));
		logger.info(""+customerCreationResponseList);
		return customerCreationResponseList;
	}
	
	private List<CustomerManagementReq> getModelCustomerResponse(
		List<CustomerManagementReq> customerCreationResponseList, List<Object> customerCreationList) {
		ObjectMapper objectMapper = new ObjectMapper();
		String modelCustomerResponse = null;
		try {
			modelCustomerResponse = objectMapper.writeValueAsString(customerCreationList);

		} catch (JsonProcessingException e1) {
			e1.getMessage();
		}
		try {
			customerCreationResponseList = objectMapper.readValue(modelCustomerResponse,
					new TypeReference<List<CustomerManagementReq>>() {
					});
		} catch (JsonParseException e) {
			e.getMessage();
		} catch (JsonMappingException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getStackTrace();
		}
		return customerCreationResponseList;
	}
	
	//add user service
		public String invokeAddUser(UserContact user)throws Exception {
			final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String users =null;
			try {		
			
				HttpHeaders header = new HttpHeaders();
				header.setContentType(MediaType.APPLICATION_JSON);
				HttpEntity<Object> entity = new HttpEntity<>(user, header);
				
				 logger.info(dtagUrl+adduser  +entity);
				users = template.postForObject(dtagUrl+adduser, entity, String.class);
				logger.info("#####"+users);
			} catch (HttpClientErrorException e) {
				e.getResponseBodyAsString();
			} catch (Exception e) {
				throw e;
			}	
			 logger.info("user created"  +users);
			return users;
		}
	
	
	  public Integer keyClockUser(KeyClockUser user) {
		  
		  Integer userId = null;
		  try {
			logger.info("Request:"+keyclockurl+user);
	       userId = template.postForObject(keyclockurl, user,Integer.class); 
	      
	  
		  } catch(Exception e)
		  {
			  e.printStackTrace();
			  }
		  logger.info("####User created in keycloak");
		  return userId;
	  }


	public String resetpwdkeyClockUser(ResetReqestBody request) {
		String status = null;
		try {
		logger.info(resetpwdkeyclockurl+request);
		 status = template.postForObject(resetpwdkeyclockurl, request,String.class); 
		 logger.info(resetpwdkeyclockurl+status);
		 logger.info(status);
		}catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		return status;
		}
	//temp Password 
   public void tempPasswordToMail(EmailRequestTempPass emailRequest ) {
	try {
		 logger.info(emailurl  +emailRequest);
		 String sucess = template.postForObject(emailurl, emailRequest, String.class);
		 logger.info(emailurl  +sucess);
		
	}catch(Exception e){
		
		e.printStackTrace();
	}
	
}

@SuppressWarnings("unchecked")
public int findByEmailId(String email) {
	List<CustomerManagementReq> customerCreationResponseList =null;
	int status=409;
	try {		
		
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> entity = new HttpEntity<>(email, header);
		
		 logger.info(dtagUrl+getbyEmail  +entity);
		 ResponseEntity<?> respEntity=template.exchange(dtagUrl+getbyEmail, HttpMethod.POST, entity, CustomerManagementReq.class);
		
		 if (respEntity!=null) {
				status = 201;
				logger.info(status +" == User Unavailable");
			} else {

				logger.info(status +" == User available");
				status = 409;
		}
 
		
	} catch (Exception e) {
		System.out.println("Exception "+ e.getMessage());
	}
	return status;	

	
}

public String updateUserRepresentation(UpdatedUserName request) {
	logger.info("Update Keycloak User request"  +request);
	 String sucess = template.postForObject(userRepre, request, String.class);
	 logger.info("#####Update Keycloak User Response"  +sucess);
	return sucess;
	
}



}
