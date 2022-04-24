package com.mileageReimbursement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mileageReimbursment.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// Create
	public <S extends Employee> S addRecord(Employee employee);
	
	// Read
	public List<Employee> findAllRecords();
	public List<Employee> findRecord(float cost);
	
	// Update
	public <S extends Employee> S save(Employee employee);
	
	// Delete
	public void delete(Employee employee);
	

}
