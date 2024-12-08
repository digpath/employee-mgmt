package com.spring.filter.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.filter.test.model.Employee;
import com.spring.filter.test.dao.EmployeeRepository;

@RestController
public class EmployeeController {
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		EmployeeRepository employeeRepository = new EmployeeRepository();
		return employeeRepository.findAll();
	}
}
