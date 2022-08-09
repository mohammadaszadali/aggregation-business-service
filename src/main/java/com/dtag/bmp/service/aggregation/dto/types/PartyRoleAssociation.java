
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
    "associationType",
    "endDate",
    "partyAssociationId",
    "partyId",
    "startDate",
    "status"
})
public class PartyRoleAssociation {

    @JsonProperty("associationType")
    private String associationType;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("partyAssociationId")
    private Integer partyAssociationId;
    @JsonProperty("partyId")
    private Integer partyId;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("associationType")
    public String getAssociationType() {
        return associationType;
    }

    @JsonProperty("associationType")
    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("partyAssociationId")
    public Integer getPartyAssociationId() {
        return partyAssociationId;
    }

    @JsonProperty("partyAssociationId")
    public void setPartyAssociationId(Integer partyAssociationId) {
        this.partyAssociationId = partyAssociationId;
    }

    @JsonProperty("partyId")
    public Integer getPartyId() {
        return partyId;
    }

    @JsonProperty("partyId")
    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
