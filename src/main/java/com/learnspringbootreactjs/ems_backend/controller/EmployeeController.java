package com.learnspringbootreactjs.ems_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learnspringbootreactjs.ems_backend.dtos.EmployeeDto;
import com.learnspringbootreactjs.ems_backend.service.EmployeeService;

import lombok.AllArgsConstructor;
import java.util.*;
@AllArgsConstructor
@Controller
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService empService;
	
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto empDto){
		
		EmployeeDto savedempdto = empService.createEmployee(empDto);
		return new ResponseEntity<>(savedempdto, HttpStatus.CREATED);
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long empId){
		EmployeeDto empDto = empService.getEmployee(empId);
		return ResponseEntity.ok(empDto);
	}
	
	//Rest endpoint for get all employees
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		List<EmployeeDto> employees = empService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	
	//Rest endpoint for updating employee
	@PutMapping("/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long empId,@RequestBody EmployeeDto updatedEmployeeDto){
		EmployeeDto updatedEmployee = empService.updateEmployee(empId, updatedEmployeeDto);
		return ResponseEntity.ok(updatedEmployee);
	}
	
	// Rest endpoint for deleting employee
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long empId) {
		empService.deleteEmployee(empId);
		return ResponseEntity.ok("Employee is deleted successfully");
	}

}
