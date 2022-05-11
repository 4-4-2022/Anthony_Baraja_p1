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

import com.gasmileagereimbursement.model.Employee;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private String url = "http://localhost:8082/employees/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * GET - Retrieve list of Employees from the Employee Service.
	 * @return
	 */
	@GetMapping(value = "/all")
	public List<Employee> getAllEmployees() {		
		ResponseEntity<List> httpResponse = restTemplate.getForEntity(url + "all", List.class);
		List<Employee> listEmployees = httpResponse.getBody();
		return listEmployees;
	}	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		ResponseEntity<Employee> employee = restTemplate.getForEntity(url + id, Employee.class);
		return employee.getBody();
	}
	
	@GetMapping("/firstname/{fname}")
	public List<Employee> getEmployeeByFname(@PathVariable("fname") String fname) {
		ResponseEntity<List> httpResponse = restTemplate.getForEntity(url + "firstname/" + fname, List.class);
		List<Employee> listEmployees = httpResponse.getBody();
		return listEmployees;
	}
	
	@GetMapping("/lastname/{lname}")
	public List<Employee> getEmployeeByLname(@PathVariable("lname") String lname) {
		ResponseEntity<List> httpResponse = restTemplate.getForEntity(url + "lastname/" + lname, List.class);
		List<Employee> listEmployees = httpResponse.getBody();
		return listEmployees;
	}
	
	@GetMapping("/jobrole/{jobrole}")
	public List<Employee> getEmployeeByJobrole(@PathVariable("jobrole") String jobrole) {
		ResponseEntity<List> httpResponse = restTemplate.getForEntity(url + "jobrole/" + jobrole, List.class);
		List<Employee> listEmployees = httpResponse.getBody();
		return listEmployees;
	}
	
	/**
	 * POST - Creates new Employee entry, sending it to the Employee Service.
	 * @param employee
	 * @return
	 */
	@PostMapping("/newhire")
	public Employee createNewRequest(@RequestBody Employee employee) {
		ResponseEntity<Employee> httpResponse = restTemplate.postForEntity(url + "newhire", employee, Employee.class);
		return httpResponse.getBody();
	}
	

	/**
	 * PUT - Updates the given Employee with the given body parameters
	 * @param id
	 * @param employee
	 * @return
	 */
	@PutMapping("/{id}")
	public String updateEmployee(@PathVariable("id") String id, @RequestBody Employee employee) {
		restTemplate.put(url + id, employee);
		return "Employee sucessfully added!";
		
	}
	
	/**
	 * DELETE - Deletes an Employee by the given id. 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") String id) {
		restTemplate.delete(url + id);
		return "Employee sucessfully deleted!";
	}
	

}
