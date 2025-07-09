package com.afrin.employeeapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.afrin.employeeapp.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
