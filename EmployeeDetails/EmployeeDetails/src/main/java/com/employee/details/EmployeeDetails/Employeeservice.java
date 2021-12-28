package com.employee.details.EmployeeDetails;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class Employeeservice {
	
	
	private static List<Employee> list = new ArrayList<Employee>();
	
/////////////////////////////////// Add Element /////////////////////////////////////
	public List<Employee> addele() {
		list.add(new Employee(1,"Ram","Wipro", 23, 1000));
		list.add(new Employee(27,"Laxaman","Samsung", 21, 6453));
		list.add(new Employee(35,"Sita","Amazon", 34, 5863));
		list.add(new Employee(46,"Gita","Flipkart", 26, 6842));
		list.add(new Employee(58,"Niraj","Swiggy", 56, 8475));
		list.add(new Employee(64,"Dhiraj","GoldmanSach", 23, 73641));
		list.add(new Employee(73,"Sunita","JpMorgan", 76, 75863));
		list.add(new Employee(80,"Rahul","Arcesium", 37, 98675));
		list.add(new Employee(90,"Jai","Rubric", 52, 974863));
		list.add(new Employee(101,"Veeru","AmericanExpress", 64, 52642));
		return list;
	}
	
/////////////////////////////////Max Salary /////////////////////////////////////////////////
	public int  maxsal() {
		int max = 0;
		for	(int i = 0; i<list.size();i++) {
			if(max < list.get(i).getSalary()) {
				max = list.get(i).getSalary();
			}	
		}
		return( max );
	}

/////////////////////////////////// Fetch Employee by Id /////////////////////////////////////
	public Employee fetchById(int Id) {
		int i = 0;
		int flag=0;
		while	(i<list.size()) {
			if(Id == list.get(i).getEmployeeId()) {
				flag = 1;
				break;
			}
			i++;
		}
//		if(flag == 0) {
//			return ("Id not found");
//		}
//		else {
//			return ("Employee Id: "+ list.get(i).getEmployeeId()
//				+"\nEmployee Name: "+ list.get(i).getName()
//				+ "\nOrganisation: "+ list.get(i).getOrganisationName() 
//				+"\nAge: "+ list.get(i).getAge()
//				+ "\nSalary: "+ list.get(i).getSalary() );
//		}
		return list.get(i);
	}

/////////////////////////////////// Delete By Id ////////////////////////
	
	public Employee deletebyid (int Id) {
		int i = 0;
		while	(i<list.size()) {
			if(Id == list.get(i).getEmployeeId()) {
				list.remove(i);
				break;
			}
		}
		Employee e = list.get(i);
		list.remove(i);
		return e;
	}
////////////////////////////////update by id///////////////////
	
	
	
	public Employee updatebyid (Employee e, int Id) {
		int i = 0;
		while	(i<list.size()) {
			if(Id == list.get(i).getEmployeeId()) {
				list.set(i,e);
				break;
			}
		}
		return e;
	}

	
	
//////////////////////////////post element////////////////////
	
	public Employee addelebypost(Employee e) {
		list.add(e);
		return e;
	}
	
	public List<Employee> addelebypost(List<Employee> e) {
		for(Employee i : e) {
			list.add(i);
		}
		return e;
	}
	
}
