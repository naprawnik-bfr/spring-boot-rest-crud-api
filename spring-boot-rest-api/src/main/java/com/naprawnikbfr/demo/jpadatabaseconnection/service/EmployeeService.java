package com.naprawnikbfr.demo.jpadatabaseconnection.service;

import com.naprawnikbfr.demo.jpadatabaseconnection.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int Id);
    Employee save(Employee employee);
    Employee deleteById(int Id);

}
