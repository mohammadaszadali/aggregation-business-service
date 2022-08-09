
package com.dtag.bmp.service.aggregation.dto.types;

import java.util.List;

public class ContactDetail {

    private String birthdate;
    private String title;
    private String firstName;
    private String gender;
    private String lastName;
    private String nationality;
    private Object contactCode;
    private Integer contactId;
    private List<ContactNumber> contactNumber = null;
    private List<EmailAddress> emailAddress = null;
    private Object individualId;
    private Object organizationId;
    private Integer partyId;
    private Object partyRoleDetails;
    private Object partyType;
    private List<PostalAddress> postalAddress = null;
    private Object preferredContactMedium;

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Object getContactCode() {
        return contactCode;
    }

    public void setContactCode(Object contactCode) {
        this.contactCode = contactCode;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public List<ContactNumber> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(List<ContactNumber> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<EmailAddress> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(List<EmailAddress> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Object getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Object individualId) {
        this.individualId = individualId;
    }

    public Object getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Object organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Object getPartyRoleDetails() {
        return partyRoleDetails;
    }

    public void setPartyRoleDetails(Object partyRoleDetails) {
        this.partyRoleDetails = partyRoleDetails;
    }

    public Object getPartyType() {
        return partyType;
    }

    public void setPartyType(Object partyType) {
        this.partyType = partyType;
    }

    public List<PostalAddress> getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(List<PostalAddress> postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Object getPreferredContactMedium() {
        return preferredContactMedium;
    }

    public void setPreferredContactMedium(Object preferredContactMedium) {
        this.preferredContactMedium = preferredContactMedium;
    }

}
