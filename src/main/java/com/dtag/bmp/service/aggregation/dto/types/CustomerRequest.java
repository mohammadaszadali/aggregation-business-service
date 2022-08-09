
package com.dtag.bmp.service.aggregation.dto.types;
public class CustomerRequest {

	private String familyName = "NA";
    private String givenName = "NA";
    private String emailId = "NA";
    private String telephoneNo = "NA";
    private String gender = "NA";
    private String crmid = "NA";
    private String orderLimit = "NA";
    private String organizationName = "NA";
    private String bankAc = "NA";
    private String bank = "NA";
    private String title = "NA";
    private String birthDate = "NA";
    private String nationality = "NA";
    private String accountHolder = "NA";
    private String paymentMethod = "NA";
    private String conditionOfPayment = "NA";
    private String iban = "NA";
    private String bic = "NA";
    private String identificationInfo = "NA";
    private String postalAddress = "NA";
    private String city = "NA";
    private String country = "NA";
    private String postalCode = "NA";
    private String customerType;
    private String status;
    private String identificationType = "NA";
    private String legalForm = "NA";
    private String vatId = "NA";
    private String tradeRegistrationNo = "NA";
    private String locationRegistration = "NA";
    private String dateOfRegistration = "NA";
    private String courtOfRegistration = "NA";

	
	
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getBankAc() {
		return bankAc;
	}
	public void setBankAc(String bankAc) {
		this.bankAc = bankAc;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getConditionOfPayment() {
		return conditionOfPayment;
	}
	public void setConditionOfPayment(String conditionOfPayment) {
		this.conditionOfPayment = conditionOfPayment;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getIdentificationInfo() {
		return identificationInfo;
	}
	public void setIdentificationInfo(String identificationInfo) {
		this.identificationInfo = identificationInfo;
	}
	

	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getIdentificationType() {
		return identificationType;
	}
	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
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
		return "CustomerRequest [familyName=" + familyName + ", givenName=" + givenName + ", emailId=" + emailId
				+ ", telephoneNo=" + telephoneNo + ", gender=" + gender + ", crmid=" + crmid + ", orderLimit="
				+ orderLimit + ", organizationName=" + organizationName + ", bankAc=" + bankAc + ", bank=" + bank
				+ ", title=" + title + ", birthDate=" + birthDate + ", nationality=" + nationality + ", accountHolder="
				+ accountHolder + ", paymentMethod=" + paymentMethod + ", conditionOfPayment=" + conditionOfPayment
				+ ", iban=" + iban + ", bic=" + bic + ", identificationInfo=" + identificationInfo + ", postalAddress="
				+ postalAddress + ", city=" + city + ", country=" + country + ", postalCode=" + postalCode
				+ ", customerType=" + customerType + ", status=" + status + ", identificationType=" + identificationType
				+ ", legalForm=" + legalForm + ", vatId=" + vatId + ", tradeRegistrationNo=" + tradeRegistrationNo
				+ ", locationRegistration=" + locationRegistration + ", dateOfRegistration=" + dateOfRegistration
				+ ", courtOfRegistration=" + courtOfRegistration + "]";
	}
	
	
	
	
	

}