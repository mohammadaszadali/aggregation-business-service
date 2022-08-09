
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
    "createDate",
    "endDate",
    "partyCode",
    "partyId",
    "partyType",
    "updateDate"
})
public class Party {

    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("partyCode")
    private String partyCode;
    @JsonProperty("partyId")
    private Integer partyId;
    @JsonProperty("partyType")
    private String partyType;
    @JsonProperty("updateDate")
    private String updateDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("createDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("partyCode")
    public String getPartyCode() {
        return partyCode;
    }

    @JsonProperty("partyCode")
    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    @JsonProperty("partyId")
    public Integer getPartyId() {
        return partyId;
    }

    @JsonProperty("partyId")
    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    @JsonProperty("partyType")
    public String getPartyType() {
        return partyType;
    }

    @JsonProperty("partyType")
    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    @JsonProperty("updateDate")
    public String getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("updateDate")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
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
