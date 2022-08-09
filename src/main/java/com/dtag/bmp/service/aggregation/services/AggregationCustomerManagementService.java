package com.dtag.bmp.service.aggregation.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dtag.bmp.service.aggregation.dto.types.ContactDetail;
import com.dtag.bmp.service.aggregation.dto.types.ContactNumber;
import com.dtag.bmp.service.aggregation.dto.types.Customer;
import com.dtag.bmp.service.aggregation.dto.types.CustomerAccount;
import com.dtag.bmp.service.aggregation.dto.types.CustomerManagementReq;
import com.dtag.bmp.service.aggregation.dto.types.CustomerManagementRequest;
import com.dtag.bmp.service.aggregation.dto.types.CustomerRequest;
import com.dtag.bmp.service.aggregation.dto.types.EmailAddress;
import com.dtag.bmp.service.aggregation.dto.types.EmailRequestTempPass;
import com.dtag.bmp.service.aggregation.dto.types.Individual;
import com.dtag.bmp.service.aggregation.dto.types.IndividualIdentification;
import com.dtag.bmp.service.aggregation.dto.types.KeyClockUser;
import com.dtag.bmp.service.aggregation.dto.types.Organization;
import com.dtag.bmp.service.aggregation.dto.types.OrganizationIdentification;
import com.dtag.bmp.service.aggregation.dto.types.PartyDetails;
import com.dtag.bmp.service.aggregation.dto.types.PaymentDetail;
import com.dtag.bmp.service.aggregation.dto.types.PaymentMethod;
import com.dtag.bmp.service.aggregation.dto.types.PaymentPlan;
import com.dtag.bmp.service.aggregation.dto.types.PostalAddress;
import com.dtag.bmp.service.aggregation.dto.types.ResetReqestBody;
import com.dtag.bmp.service.aggregation.dto.types.UpdatedUserName;
import com.dtag.bmp.service.aggregation.dto.types.UserContact;
import com.dtag.bmp.service.aggregation.services.wrapper.HelperAdapter;
import com.dtag.bmp.service.aggregation.util.AggregationServiceConstants;
import com.dtag.bmp.service.aggregation.util.IdGenerators;
import com.dtag.bmp.service.aggregation.util.TempPassword;

@org.springframework.stereotype.Service
public class AggregationCustomerManagementService {
	private static Logger logger = LoggerFactory.getLogger(AggregationCustomerManagementService.class);
	@Autowired
	private HelperAdapter helperAdpter;

	@Autowired
	CustAccSkuAdapterImpl adapterWrapper;

	TempPassword tempPass = new TempPassword();
   	IdGenerators ids = new IdGenerators();

	public String saveCustomer(CustomerRequest request) throws Exception {

		String custlist = addCustomerInfo(request);

		return custlist;
	}

	// for create new Customer
	private String addCustomerInfo(CustomerRequest customerRequest) throws Exception {
		String massage = null;
		CustomerManagementRequest customerReq = new CustomerManagementRequest();
		String pid = adapterWrapper.getPartyId(AggregationServiceConstants.entity);
		int partyId = Integer.parseInt(pid);
		String customerId = adapterWrapper.getId(AggregationServiceConstants.entity);
		logger.info("customerId" + customerId);
		Customer customer = new Customer();
		customer.setId(customerId);
		customer.setPartyId(partyId);
		//SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy/MM/dd ");
		// Setting the time zone
		//dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
		//Epoch date format
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat crunchifyFormat = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
		String currentTime = crunchifyFormat.format(today);
		
		// parse() parses text from the beginning of the given string to produce a date.
		Date date = crunchifyFormat.parse(currentTime);
 
		// getTime() returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
		long epochTime = date.getTime();
 
		System.out.println("Current Time in Epoch: " + epochTime);
		
		customer.setCreatedDate(String.valueOf(epochTime));
		customer.setCustomerType(customerRequest.getCustomerType());
		customer.setStatus(customerRequest.getStatus());
		customer.setStatusReason("New Customer");
		customer.setCreatedBy("DtagAdmin");

		IndividualIdentification info = new IndividualIdentification();
		info.setIdentificationType(customerRequest.getIdentificationType());
		Individual individual = new Individual();
		if(customerRequest.getStatus().equalsIgnoreCase("Individual")) {
		Random r = new Random(System.currentTimeMillis());
		int individualId = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
		individual.setIndividualCode("CI00006");
		individual.setIndividualId(individualId);
		}
		individual.setIndividualIdentification(info);
		List<EmailAddress> email = new ArrayList<>();
		EmailAddress address = new EmailAddress();
		address.setEmailAddress(customerRequest.getEmailId().toLowerCase());
		email.add(address);
		List<PostalAddress> postalAddresses = new ArrayList<PostalAddress>();
		PostalAddress postalAddress = new PostalAddress();
		postalAddress.setCity(customerRequest.getCity());
		postalAddress.setCountry(customerRequest.getCountry());
		postalAddress.setPostCode(customerRequest.getPostalCode());
		postalAddress.setAddressType(customerRequest.getPostalAddress());
		postalAddresses.add(postalAddress);
		PartyDetails partyinfo = new PartyDetails();
		partyinfo.setIndividual(individual);

		List<ContactDetail> contactDetailList = new ArrayList<>();
		ContactDetail contactinfo = new ContactDetail();
		contactinfo.setTitle(customerRequest.getTitle());
		contactinfo.setFirstName(customerRequest.getGivenName());
		contactinfo.setGender(customerRequest.getGender());
		contactinfo.setLastName(customerRequest.getFamilyName());
		contactinfo.setNationality(customerRequest.getNationality());
		contactinfo.setBirthdate(customerRequest.getBirthDate());
		contactinfo.setEmailAddress(email);
		contactinfo.setPostalAddress(postalAddresses);
		Random r = new Random(System.currentTimeMillis());
		int contactId = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
		contactinfo.setContactId(contactId);
    
		contactinfo.setPartyId(partyId);
		contactinfo.setIndividualId(contactId);
		List<ContactNumber> ContactNolist = new ArrayList<>();
		ContactNumber contactn = new ContactNumber();

		contactn.setNumber(customerRequest.getTelephoneNo());
		contactn.setContactNumberType("Mobile");
		ContactNolist.add(contactn);
		contactinfo.setContactNumber(ContactNolist);
		contactDetailList.add(contactinfo);
		customerReq.setContactDetails(contactDetailList);

		CustomerAccount customerAccount = new CustomerAccount();
		customerAccount.setCustomerAccountId("");
		customerAccount.setCustomerId(customerId);
		customerAccount.setAccountType(customerRequest.getAccountHolder());
		customerAccount.setCustomerAccountCode(customerRequest.getBankAc());
		PartyDetails party = new PartyDetails();
		Organization organization = new Organization();
		organization.setOrganizationName(customerRequest.getOrganizationName());
	
		OrganizationIdentification organizationIdentification=new OrganizationIdentification();
		
		organizationIdentification.setIdentificationInfo(customerRequest.getIdentificationInfo());
		organization.setOrganizationIdentification(organizationIdentification);
		organization.setLegalForm(customerRequest.getLegalForm());
		organization.setVatId(customerRequest.getVatId());
		organization.setTradeRegistrationNo(customerRequest.getTradeRegistrationNo());
		organization.setLocationRegistration(customerRequest.getLocationRegistration());
		organization.setDateOfRegistration(customerRequest.getDateOfRegistration());
		organization.setCourtOfRegistration(customerRequest.getCourtOfRegistration());
		organization.setCrmid(customerRequest.getCrmid());
		
		organization.setOrganizationId(155);
		organization.setOrganizationCode("");
		party.setOrganization(organization);
		party.setIndividual(individual);
		PaymentPlan pay = new PaymentPlan();
		PaymentDetail bankdetail = new PaymentDetail();
		bankdetail.setBankAccountNumber(customerRequest.getBankAc());
		bankdetail.setBic(customerRequest.getBic());
		bankdetail.setAccountHolder(customerRequest.getAccountHolder());
		bankdetail.setBankName(customerRequest.getBank());
		bankdetail.setNameOnCard(customerRequest.getFamilyName());
		bankdetail.setIban(customerRequest.getIban());
		PaymentMethod method = new PaymentMethod();
		method.setPaymentMethodName(customerRequest.getPaymentMethod());
		method.setDescription(customerRequest.getConditionOfPayment());
		pay.setPaymentMethod(method);
		pay.setPaymentDetail(bankdetail);

		customerReq.setPartyDetails(partyinfo);
		customerReq.setCustomerAccount(customerAccount);
		customerReq.setPartyDetails(party);
		customerReq.setPaymentPlan(pay);
		customerReq.setCustomer(customer);
		CustomerManagementReq customerManagmentRequest = new CustomerManagementReq();
		customerManagmentRequest.setCustomerId(customerId);
		customerManagmentRequest.setCustomerManagementRequest(customerReq);
		  massage = helperAdpter.invokeDTAGCustomerCreate(customerManagmentRequest);
		return massage;
	}

	

	// for get all Customer
	public List<CustomerManagementReq> getAllCustomers() {

		return helperAdpter.getAllCustomers();
	}

//Reset Password
	public String resetPassword(ResetReqestBody request) {
		String password = tempPass.temp_Password().concat("@6");
		logger.info("" + password);
		ResetReqestBody req = new ResetReqestBody();
		req.setEmailId(request.getEmailId());
		req.setUserId(request.getUserId());
		req.setPassword(password);

		String status = helperAdpter.resetpwdkeyClockUser(req);
		logger.info("" + status);
		if (status != null) {
			// send temp password throught mail
			EmailRequestTempPass emailRequest = new EmailRequestTempPass();
			emailRequest.setMessageBody(password);
			emailRequest.setToMail(request.getEmailId());
			emailRequest.setFirstName(request.getFirstName());
			emailRequest.setLastName(request.getLastName());
			emailRequest.setSubject("Your reset password request for 5G Network Slicing Trial");

			helperAdpter.tempPasswordToMail(emailRequest);
		}
		return status;

	}

	// for create user of customer in keyclock
	public Integer keyClocCreatekUser(CustomerRequest customerRequest) {
		KeyClockUser user1 = new KeyClockUser();
		user1.setEmailId(customerRequest.getEmailId());
		user1.setFamilyName(customerRequest.getFamilyName());
		user1.setGivenName(customerRequest.getGivenName());
		String password = tempPass.temp_Password().concat("#5");
		user1.setPassword(password);
		user1.setUserName(customerRequest.getEmailId());
		int userId = helperAdpter.keyClockUser(user1);
		// send temp password throught mail
		if (userId == 201) {
			EmailRequestTempPass emailRequest = new EmailRequestTempPass();
			emailRequest.setMessageBody(password);
			emailRequest.setFirstName(customerRequest.getGivenName());
			emailRequest.setLastName(customerRequest.getFamilyName());
			emailRequest.setToMail(customerRequest.getEmailId());
			emailRequest.setSubject("Temporary Password");
			helperAdpter.tempPasswordToMail(emailRequest);
		}

		return userId;
	}

	// for create user in keyclock
	public Integer keyClocCreatekUsers(UserContact userDto) {
		KeyClockUser user = new KeyClockUser();
		String password = tempPass.temp_Password().concat("#5");
		user.setEmailId(userDto.getEmailId());
		user.setFamilyName(userDto.getFamilyName());
		user.setGivenName(userDto.getGivenName());
		user.setUserName(userDto.getEmailId());
		user.setPassword(password);
		int userId = helperAdpter.keyClockUser(user);
		// send temp password throught mail
		if (userId == 201) {
			EmailRequestTempPass emailRequest = new EmailRequestTempPass();
			emailRequest.setMessageBody(password);
			emailRequest.setFirstName(userDto.getGivenName());
			emailRequest.setLastName(userDto.getFamilyName());
			emailRequest.setToMail(userDto.getEmailId());
			emailRequest.setSubject("Temporary Password");
			helperAdpter.tempPasswordToMail(emailRequest);
		}
		return userId;
	}

	

	public int emailStatus(String email) {

		return helperAdpter.findByEmailId(email);
	}

	public String updateUserRepresentation(UpdatedUserName request) {

		String sucess = helperAdpter.updateUserRepresentation(request);
		
		
		return sucess;
	}

}
