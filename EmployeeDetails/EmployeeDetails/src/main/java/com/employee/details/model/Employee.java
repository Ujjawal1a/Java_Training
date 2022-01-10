package com.employee.details.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	public int employeeId;
	public String name;
	public String organisationName;
	public int age;
	public int salary;
	
//	public Employee(int employeeId, String name, String organisationName, int age, int salary) {
//		// TODO Auto-generated constructor stub
//		this.employeeId = employeeId;
//		this.name = name;
//		this.organisationName = organisationName;
//		this.age = age;
//		this.salary = salary;
//		
//	}
	

	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOrganisationName() {
		return organisationName;
	}


	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	


	


}
