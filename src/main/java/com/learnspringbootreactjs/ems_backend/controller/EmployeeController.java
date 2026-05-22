package com.learnspringbootreactjs.ems_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learnspringbootreactjs.ems_backend.dtos.EmployeeDto;
import com.learnspringbootreactjs.ems_backend.service.EmployeeService;

import lombok.AllArgsConstructor;

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

}
