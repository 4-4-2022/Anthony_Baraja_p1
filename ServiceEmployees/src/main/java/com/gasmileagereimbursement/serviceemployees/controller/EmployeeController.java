package com.gasmileagereimbursement.serviceemployees.controller;

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
	
	// Read : GET
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		ResponseEntity<List<Employee>> httpResponse = new ResponseEntity<>(this.employeeRepo.findAll(), HttpStatus.OK);
		return httpResponse;
	}
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") Integer id) {
		return this.employeeRepo.findById(id.toString());
	}	
	@GetMapping("/firstname/{fname}")
	public List<Employee> getEmployeeByFname(@PathVariable("fname") String fname) {
		return this.employeeRepo.findByFname(fname);
	}	
	@GetMapping("/lastname/{lname}")
	public List<Employee> getEmployeeByLname(@PathVariable("lname") String lname) {
		return this.employeeRepo.findByLname(lname);
	}
	@GetMapping("/jobrole/{jobrole}")
	public List<Employee> getEmployeeByJobrole(@PathVariable("jobrole") String jobrole) {
		return this.employeeRepo.findByJobRole(jobrole);
	}
	
	// Create : POST
	@PostMapping("/newhire")
	public Employee createNewEmployee(@RequestBody Employee employee) {
		Employee newEmployee = this.employeeRepo.save(employee);
		return newEmployee;
	}
	
	
	// Update : PUT
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable("id") String id, @RequestBody Employee employee) {
		Optional<Employee> employeeToUpdateOptional = this.employeeRepo.findById(id);
		if(!employeeToUpdateOptional.isPresent()) {
			return null;
		}
		Employee employeeToUpdate = employeeToUpdateOptional.get();
		if (employee.getId() != null) {
			employeeToUpdate.setId(employee.getId());
	    }
	    if (employee.getFname() != null) {
	    	employeeToUpdate.setFname(employee.getFname());
	    }
	    if (employee.getLname() != null) {
	    	employeeToUpdate.setLname(employee.getLname());
	    }
	    if (employee.getJobRole() != null) {
	    	employeeToUpdate.setJobRole(employee.getJobRole());
	    }
	    Employee updatedEmployee = this.employeeRepo.save(employeeToUpdate);
		return updatedEmployee;
		
	}
	
	// Delete : DELETE
	@DeleteMapping("/{id}")
	public Employee deleteEmployee(@PathVariable("id") String id) {
		Optional<Employee> employeeToDeleteOptional = this.employeeRepo.findById(id);
		if(!employeeToDeleteOptional.isPresent()) {
			return null;
		}
		Employee employeeToDelete = employeeToDeleteOptional.get();
		this.employeeRepo.delete(employeeToDelete);
		return employeeToDelete;
		
	}
	

}
