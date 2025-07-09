package com.afrin.employeeapp.controller;
import com.afrin.employeeapp.Employee;
import com.afrin.employeeapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    @PostMapping("/add")
    public String saveEmployee(@RequestBody Employee emp) {
        repo.save(emp);
        return "Employee saved successfully!";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}
