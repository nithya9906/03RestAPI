package com.webapp.rest.dao;

import java.util.List;

import com.webapp.rest.Employee;

public interface EmployeeDao {
	public abstract List<Employee> getEmployees();

}
