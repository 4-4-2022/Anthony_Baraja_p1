package com.gasmileagereimbursement.servicerequests.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	// Read : GET
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Request>> getAllRequests() {
		ResponseEntity<List<Request>> httpResponse = new ResponseEntity<>(this.requestRepo.findAll(), HttpStatus.OK);
		return httpResponse;
	}
	@GetMapping("/{id}")
	public Optional<Request> getRequestByRequestId(@PathVariable("id") Integer id){
		return this.requestRepo.findById(id.toString());
	}
	@GetMapping("/approval/{approvalStatus}") // List<Request> findByApprovalStatus(Boolean approvalStatus);
	public List<Request> getRequestByApprovalStatus(@PathVariable("approvalStatus") Boolean approvalStatus){
		return this.requestRepo.findByApprovalStatus(approvalStatus);
	}
	@GetMapping("/bill/{billStatus}") // List<Request> findByBillStatus(Boolean billStatus);
	public List<Request> getRequestByBillStatus(@PathVariable("billStatus") Boolean billStatus){
		return this.requestRepo.findByBillStatus(billStatus);
	}
	
	// Create : POST	
	@PostMapping("/reimbursement")
	public Request createNewRequest(@RequestBody Request request) {
		Request newRequest = this.requestRepo.save(request);
		return newRequest;
	}
	
	
	// Update : PUT
	@PutMapping("/{id}")
	public Request updateRequest(@PathVariable("id") String id, @RequestBody Request request) {
		Optional<Request> requestToUpdateOptional = this.requestRepo.findById(id);
		if(!requestToUpdateOptional.isPresent()) {
			return null;
		}
		Request requestToUpdate = requestToUpdateOptional.get();
		if(request.getId() != null) {
			requestToUpdate.setId(request.getId());
		}
		if(request.getEmployeeId() != null) {
			requestToUpdate.setEmployeeId(request.getEmployeeId());
		}
		if(request.getRequestAmount() != null) {
			requestToUpdate.setRequestAmount(request.getRequestAmount());
		}
		if(request.getRequestReason() != null) {
			requestToUpdate.setRequestReason(request.getRequestReason());
		}
		if(request.getApprovalStatus() != null) {
			requestToUpdate.setApprovalStatus(request.getApprovalStatus());
		}
		if(request.getBillStatus() != null) {
			requestToUpdate.setBillStatus(request.getBillStatus());
		}
		Request updatedToUpdate = this.requestRepo.save(requestToUpdate);
		return updatedToUpdate;
		
	}
	
	// Delete : DELETE
	@DeleteMapping("/{id}")
	public Request deleteRequest(@PathVariable("id") String id) {
		Optional<Request> requestToDeleteOptional = this.requestRepo.findById(id);
		if(!requestToDeleteOptional.isPresent()) {
			return null;
		}
		Request requestToDelete = requestToDeleteOptional.get();
		this.requestRepo.delete(requestToDelete);
		return requestToDelete;
	}
	

}
