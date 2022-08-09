
package com.dtag.bmp.service.aggregation.dto.types;


public class IndividualIdentification {

    private Object expiryDate;
    private Object identifactionId;
    private Object identificationNumber;
    private String identificationType;
    private Object issuingDate;

    public Object getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Object expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Object getIdentifactionId() {
        return identifactionId;
    }

    public void setIdentifactionId(Object identifactionId) {
        this.identifactionId = identifactionId;
    }

    public Object getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Object identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public Object getIssuingDate() {
        return issuingDate;
    }

    public void setIssuingDate(Object issuingDate) {
        this.issuingDate = issuingDate;
    }

}
