package com.telusko.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.demo.model.*;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
