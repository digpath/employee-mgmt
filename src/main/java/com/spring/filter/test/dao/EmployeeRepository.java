package com.spring.filter.test.dao;

import com.spring.filter.test.model.Address;
import com.spring.filter.test.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    public EmployeeRepository() {
        super();
    }

    public List<Employee> findAll() {
        List<Employee> employee = new ArrayList<Employee>();

        Address address = new Address("Anspach","1","1000","brussels");
        Employee e = new Employee(1,"fn1","ln1","programmer",address);
        employee.add(e);

        address = new Address("Rue philippe Baucq","2","1040","etterbeek");
        e = new Employee(2,"fn2","ln2","techlead",address);
        employee.add(e);

        return employee;
    }
}
