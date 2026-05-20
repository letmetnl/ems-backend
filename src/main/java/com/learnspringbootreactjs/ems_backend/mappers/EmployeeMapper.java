package com.learnspringbootreactjs.ems_backend.mappers;

import com.learnspringbootreactjs.ems_backend.dtos.EmployeeDto;
import com.learnspringbootreactjs.ems_backend.entities.Employee;

public class EmployeeMapper {
	
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return new EmployeeDto(employee.getEmpId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
	}
	
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		return new Employee(employeeDto.getEmpId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail());
	}

}
