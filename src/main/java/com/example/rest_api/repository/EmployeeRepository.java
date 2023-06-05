package com.example.rest_api.repository;

import com.example.rest_api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud database methods
}
