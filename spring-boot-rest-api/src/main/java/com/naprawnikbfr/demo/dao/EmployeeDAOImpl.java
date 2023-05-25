package com.naprawnikbfr.demo.dao;

import com.naprawnikbfr.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

    @Override
    public Employee findById(int Id) {
        //get employee
        Employee theEmployee = entityManager.find(Employee.class, Id);

        //return the result
        return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        //save or update employee
        Employee dbEmployee = entityManager.merge(employee);

        //return the db employee
        return dbEmployee;
    }

    @Override
    public void deleteById(int Id) {
        //find employee by id
        Employee employeeToDelete = entityManager.find(Employee.class, Id);

        //remove employee
        entityManager.remove(employeeToDelete);
    }
}
