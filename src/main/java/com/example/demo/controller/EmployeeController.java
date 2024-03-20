package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/createEmployee")
	public void createEmployee(@RequestBody EmployeeDto dto) {

		employeeService.createEmployee(dto);
	}

	@GetMapping("/getEmployees")
	public List<Employee> getEmployee() {

		return employeeService.getAllEmployees();
	}
}
