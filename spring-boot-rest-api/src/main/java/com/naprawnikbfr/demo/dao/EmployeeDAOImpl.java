package com.naprawnikbfr.demo.dao;

import com.naprawnikbfr.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    //field for entity manager
    private EntityManager entityManager;

    //define constructor injection
    @Autowired
    public EmployeeDAOImpl (EntityManager entityManager){ //entityManager automatically created by SpringBoot
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        //execute a query and get result
        List<Employee> employees = theQuery.getResultList();

        //return the result
        return employees;
    }
}
