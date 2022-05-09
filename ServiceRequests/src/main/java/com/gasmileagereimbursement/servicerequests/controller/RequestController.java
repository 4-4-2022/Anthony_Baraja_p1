package com.gasmileagereimbursement.servicerequests.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasmileagereimbursement.servicerequests.model.Request;
import com.gasmileagereimbursement.servicerequests.repository.RequestRepository;

@RestController
@RequestMapping("/requests")
public class RequestController {
	
	private final RequestRepository requestRepo;
	
	@Autowired
	public RequestController(final RequestRepository requestRepo) {
		this.requestRepo = requestRepo;
	}
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Request>> getAllRequests() {
		ResponseEntity<List<Request>> httpResponse = new ResponseEntity<>(this.requestRepo.findAll(), HttpStatus.OK);
		return httpResponse;
	}

}
