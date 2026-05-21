package com.learnspringbootreactjs.ems_backend.service.serviceimpl;

import org.springframework.stereotype.Service;

import com.learnspringbootreactjs.ems_backend.dtos.EmployeeDto;
import com.learnspringbootreactjs.ems_backend.entities.Employee;
import com.learnspringbootreactjs.ems_backend.mappers.EmployeeMapper;
import com.learnspringbootreactjs.ems_backend.repositories.EmployeeRepository;
import com.learnspringbootreactjs.ems_backend.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository empRepo;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeedto) {
		// TODO Auto-generated method stub
		Employee employee = EmployeeMapper.mapToEmployee(employeedto);
		Employee savedEmployee = empRepo.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

}
