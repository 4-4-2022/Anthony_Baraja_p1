package com.gasmileagereimbursement.serviceemployees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasmileagereimbursement.serviceemployees.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
}
