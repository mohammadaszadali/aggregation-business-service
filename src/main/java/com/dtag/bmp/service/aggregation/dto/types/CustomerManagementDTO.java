package com.dtag.bmp.service.aggregation.dto.types;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerManagementDTO {
	
	
	private String dtagId;
	private CustomerManagementRequest customermanagement;
    private String password;
    private String crmid;
    private String orderLimit;
    private String bic;
    private String iban;
    private String title;
    private String accountHolder;
    private String identificationInfo ;
    private String legalForm ;
    private String vatId ;
    private String tradeRegistrationNo;
    private String locationRegistration ;
    private String dateOfRegistration ;
    private String courtOfRegistration ;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getDtagId() {
		return dtagId;
	}
	public void setDtagId(String dtagId) {
		this.dtagId = dtagId;
	}
	public CustomerManagementRequest getCustomermanagement() {
		return customermanagement;
	}
	public void setCustomermanagement(CustomerManagementRequest customermanagement) {
		this.customermanagement = customermanagement;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCrmid() {
		return crmid;
	}
	public void setCrmid(String crmid) {
		this.crmid = crmid;
	}
	public String getOrderLimit() {
		return orderLimit;
	}
	public void setOrderLimit(String orderLimit) {
		this.orderLimit = orderLimit;
	}
	public String getIdentificationInfo() {
		return identificationInfo;
	}
	public void setIdentificationInfo(String identificationInfo) {
		this.identificationInfo = identificationInfo;
	}
	public String getLegalForm() {
		return legalForm;
	}
	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}
	public String getVatId() {
		return vatId;
	}
	public void setVatId(String vatId) {
		this.vatId = vatId;
	}
	public String getTradeRegistrationNo() {
		return tradeRegistrationNo;
	}
	public void setTradeRegistrationNo(String tradeRegistrationNo) {
		this.tradeRegistrationNo = tradeRegistrationNo;
	}
	public String getLocationRegistration() {
		return locationRegistration;
	}
	public void setLocationRegistration(String locationRegistration) {
		this.locationRegistration = locationRegistration;
	}
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public String getCourtOfRegistration() {
		return courtOfRegistration;
	}
	public void setCourtOfRegistration(String courtOfRegistration) {
		this.courtOfRegistration = courtOfRegistration;
	}
	@Override
	public String toString() {
		return "CustomerManagementDTO [dtagId=" + dtagId + ", customermanagement=" + customermanagement + ", password="
				+ password + ", crmid=" + crmid + ", orderLimit=" + orderLimit + ", bic=" + bic + ", iban=" + iban
				+ ", title=" + title + ", accountHolder=" + accountHolder + ", identificationInfo=" + identificationInfo
				+ ", legalForm=" + legalForm + ", vatId=" + vatId + ", tradeRegistrationNo=" + tradeRegistrationNo
				+ ", locationRegistration=" + locationRegistration + ", dateOfRegistration=" + dateOfRegistration
				+ ", courtOfRegistration=" + courtOfRegistration + "]";
	}
	
	
	
	
	
	
}
