package com.gasmileagereimbursement.servicemanagementemployees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasmileagereimbursement.servicemanagementemployees.model.ManagementEmployees;
import com.gasmileagereimbursement.servicemanagementemployees.repository.ManagementEmployeesRepository;

@RestController
@RequestMapping("/manager")
public class ManagementEmployeesController {
	
	private final ManagementEmployeesRepository meRepo;
	
	@Autowired
	public ManagementEmployeesController(final ManagementEmployeesRepository meRepo) {
		this.meRepo = meRepo;
	}
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ManagementEmployees>> getAllEmployees() {
		ResponseEntity<List<ManagementEmployees>> httpResponse = new ResponseEntity<>(this.meRepo.findAll(), HttpStatus.OK);
		return httpResponse;
	}

}
