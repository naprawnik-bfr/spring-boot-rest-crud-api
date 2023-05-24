package com.naprawnikbfr.demo.dao;

import com.naprawnikbfr.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
