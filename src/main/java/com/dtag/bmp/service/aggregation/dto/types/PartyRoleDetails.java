
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
    "roleDescription",
    "roleId",
    "roleName"
})
public class PartyRoleDetails {

    @JsonProperty("roleDescription")
    private String roleDescription;
    @JsonProperty("roleId")
    private Integer roleId;
    @JsonProperty("roleName")
    private String roleName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("roleDescription")
    public String getRoleDescription() {
        return roleDescription;
    }

    @JsonProperty("roleDescription")
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @JsonProperty("roleId")
    public Integer getRoleId() {
        return roleId;
    }

    @JsonProperty("roleId")
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @JsonProperty("roleName")
    public String getRoleName() {
        return roleName;
    }

    @JsonProperty("roleName")
    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
