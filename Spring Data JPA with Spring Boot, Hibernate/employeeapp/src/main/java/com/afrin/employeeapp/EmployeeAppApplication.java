package com.afrin.employeeapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.afrin.employeeapp.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeAppApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(EmployeeRepository repo) {
        return args -> {
      
        	        Employee emp1 = new Employee(1, "AFRIN", "Developer");
        	        Employee emp2 = new Employee(2, "RAHUL", "Tester");
        	        Employee emp3 = new Employee(3, "NEHA", "Manager");
        	        Employee emp4 = new Employee(4, "VIKRAM", "Designer");
        	        Employee emp5 = new Employee(5, "SARA", "DevOps");

        	        repo.save(emp1);
        	        repo.save(emp2);
        	        repo.save(emp3);
        	        repo.save(emp4);
        	        repo.save(emp5);
        	    };
        	}
    }

