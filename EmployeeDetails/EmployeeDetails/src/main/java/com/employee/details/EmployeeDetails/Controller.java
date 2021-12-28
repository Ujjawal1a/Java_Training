package com.employee.details.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	

	
	@Autowired
	Employeeservice es;
	
	@GetMapping("/employee/addele")
	public List<Employee> addele() {
		return (es.addele());
	}
	
	@GetMapping("/employee/maxsal")
	public int maxsal() {
		return (es.maxsal());
		
	}
	
	@GetMapping("/employee/{Emloyee_id}")
	public Employee fetchbyid(@PathVariable ("Emloyee_id") int Employee_id) {
		return (es.fetchById(Employee_id));
		
	}
	
	
	@DeleteMapping("/employee/{Emloyee_id}")
	public Employee deletebyid(@PathVariable ("Emloyee_id") int Employee_id) {
		return (es.deletebyid(Employee_id));
		
	}
	
	@PutMapping("/employee/{Emloyee_id}")
	public Employee deletebyid(@RequestBody Employee e,@PathVariable ("Emloyee_id") int Employee_id ) {
		return (es.updatebyid(e, Employee_id));
		
	}
	
	////////////adding single employee//////////////////////
	@PostMapping("/employee")
	public Employee addemployee(@RequestBody Employee e) {
		return (es.addelebypost(e));	
	}
	
	//////////for adding multiple employees///////////
	@PostMapping("/employee/addemployees")
	public List<Employee> addemployee(@RequestBody List<Employee> e) {
		return (List<Employee>) (es.addelebypost(e));	
	}
	
}
