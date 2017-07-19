package com.example.jpaDemos.read.google.driver.sheet.data.service;

import com.example.jpaDemos.read.google.driver.sheet.data.model.Employee;
import com.example.jpaDemos.read.google.driver.sheet.data.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lycus 01 on 7/18/2017.
 */
@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee){
        return employee;
    }

    public void deleteEmployee(){}

    public void updateEmployee(){}

    public Employee getEmployee(Long eid){
        return this.employeeRepository.findOne(eid);
    }

    public void getEmployees(){}
}
