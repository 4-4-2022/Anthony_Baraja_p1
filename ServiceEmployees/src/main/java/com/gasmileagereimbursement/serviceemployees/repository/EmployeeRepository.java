package com.gasmileagereimbursement.serviceemployees.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasmileagereimbursement.serviceemployees.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	List<Employee> findByFname(String fname);
	List<Employee> findByLname(String lname);
	List<Employee> findByJobRole(String jobRole);
	
}
