package com.employee.details.EmployeeDetails;



public class Employee {
	public int EmployeeId;
	public String Name;
	public String OrganisationName;
	public int Age;
	public int Salary;
	

	public Employee(int EmployeeId, String Name, String OrganisationName, int Age, int Salary) {
		// TODO Auto-generated constructor stub
		this.EmployeeId = EmployeeId;
		this.Name = Name;
		this.OrganisationName = OrganisationName;
		this.Age = Age;
		this.Salary = Salary;
		
	}


	public int getEmployeeId() {
		return EmployeeId;
	}


//	public void setEmployeeId(int employeeId) {
//		EmployeeId = employeeId;
//	}


	public String getName() {
		return Name;
	}


//	public void setName(String name) {
//		Name = name;
//	}


	public String getOrganisationName() {
		return OrganisationName;
	}


//	public void setOrganisationName(String organisationName) {
//		OrganisationName = organisationName;
//	}


	public int getAge() {
		return Age;
	}


//	public void setAge(int age) {
//		Age = age;
//	}


	public int getSalary() {
		return Salary;
	}


//	public void setSalary(int salary) {
//		Salary = salary;
//	}


}
