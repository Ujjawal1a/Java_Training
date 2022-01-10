package com.employee.details.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Organisation {
	
	@Id
	public int organisationId;
	public String orgName;
	public int numberOfEmloyees;
	
	@ManyToOne(cascade = CascadeType.ALL)
	public OrgAddress orgAdd;

	public int getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(int organisationId) {
		this.organisationId = organisationId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getNumberOfEmloyees() {
		return numberOfEmloyees;
	}

	public void setNumberOfEmloyees(int numberOfEmloyees) {
		this.numberOfEmloyees = numberOfEmloyees;
	}

	public OrgAddress getOrgAdd() {
		return orgAdd;
	}

	public void setOrgAdd(OrgAddress orgAdd) {
		this.orgAdd = orgAdd;
	}
	
	


}
