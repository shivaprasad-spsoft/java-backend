package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public void createEmployee(EmployeeDto dto) {
		Employee emp = new Employee();

		emp.setEmpName(dto.getName());
		emp.setPhoneNumber(dto.getMobileNo());
		emp.setSalary(dto.getSalary());

		employeeRepository.save(emp);

	}

	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

}
