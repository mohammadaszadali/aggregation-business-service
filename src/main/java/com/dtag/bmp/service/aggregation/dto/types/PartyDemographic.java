
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
    "demographicId",
    "partyDemographicSource",
    "uom",
    "updateDate",
    "value",
    "valueTo"
})
public class PartyDemographic {

    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("demographicId")
    private Integer demographicId;
    @JsonProperty("partyDemographicSource")
    private String partyDemographicSource;
    @JsonProperty("uom")
    private String uom;
    @JsonProperty("updateDate")
    private String updateDate;
    @JsonProperty("value")
    private String value;
    @JsonProperty("valueTo")
    private String valueTo;
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

    @JsonProperty("demographicId")
    public Integer getDemographicId() {
        return demographicId;
    }

    @JsonProperty("demographicId")
    public void setDemographicId(Integer demographicId) {
        this.demographicId = demographicId;
    }

    @JsonProperty("partyDemographicSource")
    public String getPartyDemographicSource() {
        return partyDemographicSource;
    }

    @JsonProperty("partyDemographicSource")
    public void setPartyDemographicSource(String partyDemographicSource) {
        this.partyDemographicSource = partyDemographicSource;
    }

    @JsonProperty("uom")
    public String getUom() {
        return uom;
    }

    @JsonProperty("uom")
    public void setUom(String uom) {
        this.uom = uom;
    }

    @JsonProperty("updateDate")
    public String getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("updateDate")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("valueTo")
    public String getValueTo() {
        return valueTo;
    }

    @JsonProperty("valueTo")
    public void setValueTo(String valueTo) {
        this.valueTo = valueTo;
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
