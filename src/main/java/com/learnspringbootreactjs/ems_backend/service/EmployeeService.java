package com.learnspringbootreactjs.ems_backend.service;

import com.learnspringbootreactjs.ems_backend.dtos.EmployeeDto;
import java.util.*;
public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeedto);
	
	EmployeeDto getEmployee(Long empId);
	
	List<EmployeeDto> getAllEmployees();
	
	EmployeeDto updateEmployee(Long empId, EmployeeDto updatedEmployeeDto);

}
