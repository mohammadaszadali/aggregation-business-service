
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
    "creditProfileDate",
    "creditRiskRating",
    "creditScore",
    "id",
    "validTill"
})
public class CustomerCreditProfile {

    @JsonProperty("creditProfileDate")
    private String creditProfileDate;
    @JsonProperty("creditRiskRating")
    private Integer creditRiskRating;
    @JsonProperty("creditScore")
    private Integer creditScore;
    @JsonProperty("id")
    private String id;
    @JsonProperty("validTill")
    private String validTill;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("creditProfileDate")
    public String getCreditProfileDate() {
        return creditProfileDate;
    }

    @JsonProperty("creditProfileDate")
    public void setCreditProfileDate(String creditProfileDate) {
        this.creditProfileDate = creditProfileDate;
    }

    @JsonProperty("creditRiskRating")
    public Integer getCreditRiskRating() {
        return creditRiskRating;
    }

    @JsonProperty("creditRiskRating")
    public void setCreditRiskRating(Integer creditRiskRating) {
        this.creditRiskRating = creditRiskRating;
    }

    @JsonProperty("creditScore")
    public Integer getCreditScore() {
        return creditScore;
    }

    @JsonProperty("creditScore")
    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
