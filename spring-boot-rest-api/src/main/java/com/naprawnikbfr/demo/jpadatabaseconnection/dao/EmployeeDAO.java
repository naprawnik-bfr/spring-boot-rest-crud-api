package com.naprawnikbfr.demo.jpadatabaseconnection.dao;

import com.naprawnikbfr.demo.jpadatabaseconnection.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int Id);
    Employee save(Employee employee);
    Employee deleteById(int Id);

}
