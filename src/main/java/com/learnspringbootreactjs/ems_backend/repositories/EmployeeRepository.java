package com.learnspringbootreactjs.ems_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspringbootreactjs.ems_backend.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

