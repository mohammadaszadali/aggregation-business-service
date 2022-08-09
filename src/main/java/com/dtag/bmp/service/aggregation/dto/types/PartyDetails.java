
package com.dtag.bmp.service.aggregation.dto.types;


public class PartyDetails {

    private Individual individual;
    private Organization organization;

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

}
