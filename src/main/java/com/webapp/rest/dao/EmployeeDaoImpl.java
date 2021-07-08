package com.webapp.rest.dao;

import java.util.ArrayList;
import java.util.List;

import com.webapp.rest.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	public List<Employee> getEmployees(){
		Employee e1=new Employee(101,"Jas");
		Employee e2=new Employee(102,"Nithya");
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		return list;	
	}
}
