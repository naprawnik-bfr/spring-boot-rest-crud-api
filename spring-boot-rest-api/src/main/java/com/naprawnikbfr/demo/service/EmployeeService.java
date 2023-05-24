package com.naprawnikbfr.demo.service;

import com.naprawnikbfr.demo.dao.EmployeeDAO;
import com.naprawnikbfr.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int Id);
    Employee save(Employee employee);
    Employee deleteById(int Id);

}
