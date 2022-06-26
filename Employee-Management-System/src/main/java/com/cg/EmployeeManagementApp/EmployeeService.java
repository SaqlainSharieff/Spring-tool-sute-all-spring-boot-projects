package com.cg.EmployeeManagementApp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class EmployeeService 
{

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> listAll() {
		
		return employeeRepository.findAll();
	}

	public Employee get(Integer id) {
		
		return employeeRepository.findById(id).get();
	}

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	public void delete(Integer id) {
		employeeRepository.deleteById(id);
	}
	
	
	
}
