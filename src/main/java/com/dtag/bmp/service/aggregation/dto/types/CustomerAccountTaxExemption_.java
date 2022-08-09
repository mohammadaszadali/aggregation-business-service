
package com.dtag.bmp.service.aggregation.dto.types;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "certificateNumber",
    "id",
    "issuingDate",
    "issuingJurisdiction",
    "validTill"
})
public class CustomerAccountTaxExemption_ {

    @JsonProperty("certificateNumber")
    private String certificateNumber;
    @JsonProperty("id")
    private String id;
    @JsonProperty("issuingDate")
    private String issuingDate;
    @JsonProperty("issuingJurisdiction")
    private String issuingJurisdiction;
    @JsonProperty("validTill")
    private String validTill;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("certificateNumber")
    public String getCertificateNumber() {
        return certificateNumber;
    }

    @JsonProperty("certificateNumber")
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("issuingDate")
    public String getIssuingDate() {
        return issuingDate;
    }

    @JsonProperty("issuingDate")
    public void setIssuingDate(String issuingDate) {
        this.issuingDate = issuingDate;
    }

    @JsonProperty("issuingJurisdiction")
    public String getIssuingJurisdiction() {
        return issuingJurisdiction;
    }

    @JsonProperty("issuingJurisdiction")
    public void setIssuingJurisdiction(String issuingJurisdiction) {
        this.issuingJurisdiction = issuingJurisdiction;
    }

    @JsonProperty("validTill")
    public String getValidTill() {
        return validTill;
    }

    @JsonProperty("validTill")
    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
