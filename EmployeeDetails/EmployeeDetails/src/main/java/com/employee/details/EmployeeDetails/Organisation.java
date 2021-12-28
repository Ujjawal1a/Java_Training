package com.employee.details.EmployeeDetails;



public class Organisation {
	public int OrganisationId;
	public String Name;
	public int NumberOfEmloyees;
	public OrgAddress Add;
	public int getOrganisationId() {
		return OrganisationId;
	}
	public void setOrganisationId(int organisationId) {
		OrganisationId = organisationId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumberOfEmloyees() {
		return NumberOfEmloyees;
	}
	public void setNumberOfEmloyees(int numberOfEmloyees) {
		NumberOfEmloyees = numberOfEmloyees;
	}
	public OrgAddress getAdd() {
		return Add;
	}
	public void setAdd(OrgAddress add) {
		Add = add;
	}


	

}
