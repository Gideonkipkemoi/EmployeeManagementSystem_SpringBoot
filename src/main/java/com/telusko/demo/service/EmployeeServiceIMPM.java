package com.telusko.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.demo.model.Employee;
import com.telusko.demo.repository.EmployeeRepo;
import com.telusko.demo.model.*;


@Service
public class EmployeeServiceIMPM implements EmployeeService{

	@Autowired 
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub{
		this.employeeRepo.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional= employeeRepo.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for ID: "+id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepo.deleteById(id);
		
	}
		
	}
	
	

