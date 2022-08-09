
package com.dtag.bmp.service.aggregation.dto.types;


public class PostalAddress {

    private String addressType;
    private String city;
    private String country;
    private Object landmark;
    private String postCode;
    private Object state;
    private Object street1;
    private Object street2;

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
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

    public Object getLandmark() {
        return landmark;
    }

    public void setLandmark(Object landmark) {
        this.landmark = landmark;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getStreet1() {
        return street1;
    }

    public void setStreet1(Object street1) {
        this.street1 = street1;
    }

    public Object getStreet2() {
        return street2;
    }

    public void setStreet2(Object street2) {
        this.street2 = street2;
    }

}
