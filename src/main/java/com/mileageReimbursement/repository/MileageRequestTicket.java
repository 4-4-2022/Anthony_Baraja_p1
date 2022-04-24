package com.mileageReimbursement.repository;


import java.util.List;

import com.mileageReimbursment.model.Employee;

public class MileageRequestTicket {
	
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
