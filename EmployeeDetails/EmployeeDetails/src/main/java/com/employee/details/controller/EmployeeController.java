package com.employee.details.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.details.model.Employee;
import com.employee.details.service.EmployeeServices;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServices es;
	
	
	
//	@Autowired
//	OrganisationRepo orgRepo;
	
	
	
//	@GetMapping("/employee/addele")
//	public List<Employee> addele() {
//		return (es.addele());
//	}
	
//	@GetMapping("/employee/maxsal")
//	public int maxsal() {
//		return (es.maxsal());
//		
//	}
	
	@GetMapping("/employee/{emloyeeId}")
	public Optional<Employee> fetchbyid(@PathVariable ("emloyeeId") int employeeId) {
		return (es.fetchById(employeeId));
		
	}
	
	
	@DeleteMapping("/employee/{Emloyee_id}")
	public String deletebyid(@PathVariable ("Emloyee_id") int Employee_id) {
		return es.deletebyid(Employee_id);
		
	}
	
//	@PutMapping("/employee/{Emloyee_id}")
//	public Employee updatebyid(@RequestBody Employee e,@PathVariable ("Emloyee_id") int Employee_id ) {
//		return es.updatebyid(e, Employee_id);
//		

	
	////////////adding single employee//////////////////////
	@PostMapping("/employee")
	public ResponseEntity<Employee> addemployee(@RequestBody Employee e) {
		return ResponseEntity.accepted().body(es.addelebypost(e));	
	}
	
	//////////for adding multiple employees///////////
	@PostMapping("/employee/addemployees")
	public List<Employee> addemployee(@RequestBody List<Employee> e) {
		return es.addelebypost(e);	
	}
	
	@GetMapping("/employee/empsByOrgName/{orgName}")
	public List<Employee> empsByOrgName(@PathVariable ("orgName") String orgName) {
		return (es.empsByOrgName(orgName));
		
	}
}
