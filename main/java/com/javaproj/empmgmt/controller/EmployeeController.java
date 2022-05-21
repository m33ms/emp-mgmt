package com.javaproj.empmgmt.controller;

import com.javaproj.empmgmt.model.Employee;
import com.javaproj.empmgmt.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
         return employeeRepo.findAll();
    }
}
