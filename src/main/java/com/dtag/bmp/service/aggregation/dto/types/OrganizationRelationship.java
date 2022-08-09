
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
    "organizationId",
    "organizationName",
    "relationshipType"
})
public class OrganizationRelationship {

    @JsonProperty("organizationId")
    private Integer organizationId;
    @JsonProperty("organizationName")
    private String organizationName;
    @JsonProperty("relationshipType")
    private String relationshipType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("organizationId")
    public Integer getOrganizationId() {
        return organizationId;
    }

    @JsonProperty("organizationId")
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @JsonProperty("organizationName")
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty("organizationName")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @JsonProperty("relationshipType")
    public String getRelationshipType() {
        return relationshipType;
    }

    @JsonProperty("relationshipType")
    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
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
