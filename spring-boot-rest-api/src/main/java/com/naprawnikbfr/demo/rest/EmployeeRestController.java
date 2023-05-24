package com.naprawnikbfr.demo.rest;

import com.naprawnikbfr.demo.dao.EmployeeDAO;
import com.naprawnikbfr.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    //quick and dirty -> inject employee DAO
    @Autowired
    public EmployeeRestController (EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    //expose "/employees" and return a list o employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
