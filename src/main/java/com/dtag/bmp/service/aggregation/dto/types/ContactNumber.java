
package com.dtag.bmp.service.aggregation.dto.types;


public class ContactNumber {

    private Object areaCode;
    private String contactNumberType;
    private Object countryCode;
    private Object extension;
    private String number;

    public Object getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Object areaCode) {
        this.areaCode = areaCode;
    }

    public String getContactNumberType() {
        return contactNumberType;
    }

    public void setContactNumberType(String contactNumberType) {
        this.contactNumberType = contactNumberType;
    }

    public Object getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public Object getExtension() {
        return extension;
    }

    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
