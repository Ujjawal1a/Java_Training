package com.employee.details.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.employee.details.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, 	Integer>{
	
	public List<Employee> findByOrganisationName (String name);

}

