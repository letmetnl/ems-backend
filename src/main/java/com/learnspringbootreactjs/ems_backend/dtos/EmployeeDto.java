package com.learnspringbootreactjs.ems_backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeDto {
	
	private Long empId;
	private String firstName;
	private String lastName;
	private String email;

}
