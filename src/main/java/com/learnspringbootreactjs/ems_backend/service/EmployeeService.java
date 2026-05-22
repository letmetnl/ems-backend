package com.learnspringbootreactjs.ems_backend.service;

import com.learnspringbootreactjs.ems_backend.dtos.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeedto);
	
	EmployeeDto getEmployee(Long empId);

}
