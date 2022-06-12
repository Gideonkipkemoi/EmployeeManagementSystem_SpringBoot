package com.telusko.demo.service;

import java.util.List;

import com.telusko.demo.model.*;


public interface EmployeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
}
