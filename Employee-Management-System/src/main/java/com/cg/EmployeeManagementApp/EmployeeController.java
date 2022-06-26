package com.cg.EmployeeManagementApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController 
{

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/emp")
	public List<Employee> list(){
		return service.listAll();
	}
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> get(@PathVariable Integer id)
	{
	try 
	
		{
			Employee employee = service.get(id);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}
	 
	catch (Exception e) 
	{
		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		
	}
	
	
	}
	
	@PostMapping("/emp")
	public void add(@RequestBody Employee employee) 
	{
		service.save(employee);
	}
	
	@PutMapping("/emp/{id}")
	public ResponseEntity<?> update(@RequestBody Employee employee,@PathVariable Integer id)
	{
		try {
			Employee existEmp = service.get(id);
			service.save(employee);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} 
		catch (Exception e) 
		{
		
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/emp/{id}")
	public void delete(@PathVariable Integer id) 
	{
		service.delete(id);
	}
	
	
}
