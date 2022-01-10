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
import org.springframework.web.client.RestTemplate;

import com.employee.details.model.Employee;
import com.employee.details.model.Organisation;
import com.employee.details.service.OrganisationServices;

@RestController
public class OrganisationController {
	
	@Autowired
	OrganisationServices os;
	
	RestTemplate restTemplate = new RestTemplate();
	
	///////////////////for fetching single organization/////////////
	@GetMapping("/organisation/{organisationId}")
	public Optional<Organisation> fetchbyid(@PathVariable ("organisationId") int organisationId) {
		return (os.fetchById(organisationId));
		
	}
	
	////////////////for deleting an organization//////////////////
	@DeleteMapping("/organisation/{organisationId}")
	public String deletebyid(@PathVariable ("organisationId") int organisationId) {
		return os.deletebyid(organisationId);
		
	}
	
	//////////for adding single organization///////////
	@PostMapping("/organisation")
	public ResponseEntity<Organisation> addOrganisation(@RequestBody Organisation org) {
		return ResponseEntity.accepted().body(os.addelebypost(org));	
	}
	
	//////////for adding multiple organization///////////
	@PostMapping("/organisation/addorganisations")
	public List<Organisation> addOrganisation(@RequestBody List<Organisation> org) {
		return os.addelebypost(org);	
	}
	
	
    //-----------------------calling method of employee service from here -------------------
    @GetMapping("/organisation/employeeByOrgName/{organisationName}")
	public Employee[] employeeByOrgName(@PathVariable ("organisationName") String organisationName) {
    	Employee[] result =  restTemplate.getForObject("http://localhost:9090/employee/empsByOrgName/" + organisationName, Employee[].class);
        return result;
		//
	}
}
