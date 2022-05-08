package com.gasmileagereimbursement.serviceemployees.controller;

import java.util.List;
import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasmileagereimbursement.serviceemployees.model.Employee;
import com.gasmileagereimbursement.serviceemployees.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private final EmployeeRepository employeeRepo;
	
	@Autowired
	public EmployeeController(final EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		ResponseEntity<List<Employee>> httpResponse = new ResponseEntity<>(this.employeeRepo.findAll(), HttpStatus.OK);
		return httpResponse;
	}
	/*
	@GetMapping("/all")
	public Iterable<Employee> getAllPlants() {
		return this.employeeRepo.findAll();
	}
	*/

}
