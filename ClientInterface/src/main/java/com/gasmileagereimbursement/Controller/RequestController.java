package com.gasmileagereimbursement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gasmileagereimbursement.model.Request;

@RestController
@RequestMapping("/requests")
public class RequestController {
	
	private String url = "http://localhost:8084/requests/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/all")
	public List<Request> getAllRequests() {		
		ResponseEntity<List> httpResponse = restTemplate.getForEntity(url + "all", List.class);
		List<Request> listRequests = httpResponse.getBody();
		return listRequests;
	}
	@GetMapping("/{id}")
	public Request getRequestById(@PathVariable("id") Integer id) {
		ResponseEntity<Request> request = restTemplate.getForEntity("http://localhost:8084/requests/" + id, Request.class);
		return request.getBody();
	}	
	@GetMapping("/approval/{approvalStatus}")
	public List<Request> getRequestsByApprovalStatus(@PathVariable("approvalStatus") String approvalStatus) {
		ResponseEntity<List> httpResponse = restTemplate.getForEntity(url + approvalStatus, List.class);
		List<Request> listRequests = httpResponse.getBody();
		return listRequests;
	}	
	@GetMapping("/bill/{billStatus}")
	public List<Request> getRequestsByBillStatus(@PathVariable("billStatus") String billStatus) {
		ResponseEntity<List> httpResponse = restTemplate.getForEntity(url + "bill/" + billStatus, List.class);
		List<Request> billRequests = httpResponse.getBody();
		return billRequests;
	}
	
	@PostMapping("/reimbursement")
	public Request createNewRequest(@RequestBody Request request) {
		ResponseEntity<Request> httpResponse = restTemplate.postForEntity(url + "reimbursement", request, Request.class);
		return httpResponse.getBody();
	}
	
	@PutMapping("/{id}")
	public String updateRequest(@PathVariable("id") String id, @RequestBody Request request) {
		restTemplate.put(url + id, request);
		return "Request sucessfully added!";		
	}
	
	@DeleteMapping("/{id}")
	public String deleteRequest(@PathVariable("id") String id) {
		restTemplate.delete(url + id);
		return "Request sucessfully deleted!";
	}

}
