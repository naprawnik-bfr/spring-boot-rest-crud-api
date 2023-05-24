package com.naprawnikbfr.demo.rest;

import com.naprawnikbfr.demo.entity.Employee;
import com.naprawnikbfr.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController (EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //expose "/employees" and return a list o employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
