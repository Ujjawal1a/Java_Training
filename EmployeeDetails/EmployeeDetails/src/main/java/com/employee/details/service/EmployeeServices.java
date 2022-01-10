package com.employee.details.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.details.dao.EmployeeRepo;
import com.employee.details.model.Employee;

@Service
public class EmployeeServices {
	
	
	@Autowired
	EmployeeRepo empRepo;
	
//	private static List<Employee> list = new ArrayList<Employee>();
//	
///////////////////////////////////// Add Element /////////////////////////////////////
//	public List<Employee> addele() {
//		list.add(new Employee(1,"Ram","Wipro", 23, 1000));
//		list.add(new Employee(27,"Laxaman","Samsung", 21, 6453));
//		list.add(new Employee(35,"Sita","Amazon", 34, 5863));
//		list.add(new Employee(46,"Gita","Flipkart", 26, 6842));
//		list.add(new Employee(58,"Niraj","Swiggy", 56, 8475));
//		list.add(new Employee(64,"Dhiraj","GoldmanSach", 23, 73641));
//		list.add(new Employee(73,"Sunita","JpMorgan", 76, 75863));
//		list.add(new Employee(80,"Rahul","Arcesium", 37, 98675));
//		list.add(new Employee(90,"Jai","Rubric", 52, 974863));
//		list.add(new Employee(101,"Veeru","AmericanExpress", 64, 52642));
//		return list;
//	}
//	
///////////////////////////////////Max Salary /////////////////////////////////////////////////
//	public int  maxsal() {
//		int max = 0;
//		for	(int i = 0; i<list.size();i++) {
//			if(max < list.get(i).getSalary()) {
//				max = list.get(i).getSalary();
//			}	
//		}
//		return( max );
//	}

/////////////////////////////////// Fetch Employee by Id /////////////////////////////////////
	public Optional<Employee> fetchById(int Id) {
		Optional<Employee> e = empRepo.findById(Id);
		return e;
	}

/////////////////////////////////// Delete By Id ////////////////////////
	
	public String deletebyid (int Id) {
		empRepo.deleteById(Id);
		return "Employee Deleted";
	}
////////////////////////////////update by id///////////////////
	
	
	
//	public Employee updatebyid (Employee employee, int Id) {
//		int i = 0;
//		while	(i<list.size()) {
//			if(Id == list.get(i).getEmployeeId()) {
//				empRepo.save(employee);
//				break;
//			}
//		}
//		return employee;
//	}

	
	
//////////////////////////////post element////////////////////
	
	public Employee addelebypost(Employee employee) {
		empRepo.save(employee);
		return employee;
	}
	
	public List<Employee> addelebypost(List<Employee> employees) {
		for(Employee employee : employees) {
			empRepo.save(employee);
		}
		return employees;
	}
	
///////////////find all employee by organization name///////////////
	public List<Employee>empsByOrgName (String orgName){
		return empRepo.findByOrganisationName(orgName);
	}
	
}
