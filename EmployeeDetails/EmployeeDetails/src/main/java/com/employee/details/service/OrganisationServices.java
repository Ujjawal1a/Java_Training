package com.employee.details.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.details.dao.OrganisationRepo;
import com.employee.details.model.Organisation;

@Service
public class OrganisationServices {
	
	@Autowired
	OrganisationRepo orgRepo;
	
	public Optional<Organisation> fetchById(int Id) {
		Optional<Organisation> e = orgRepo.findById(Id);
		return e;
	}
	
	public String deletebyid (int Id) {
		orgRepo.deleteById(Id);
		return "Employee Deleted";
	}

	
	public Organisation addelebypost(Organisation organisation) {
		orgRepo.save(organisation);
		return organisation;
	}
	
	public List<Organisation> addelebypost(List<Organisation> organisation) {
		for(Organisation org : organisation) {
			orgRepo.save(org);
		}
		return organisation;
	}
	
}


