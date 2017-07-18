package com.example.jpaDemos.read.google.driver.sheet.data.controller;

import com.example.jpaDemos.read.google.driver.sheet.data.service.EmployeeService;
import com.example.jpaDemos.read.google.driver.sheet.data.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lycus 01 on 7/18/2017.
 */
@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value = "/saveEmployee" ,method =RequestMethod.POST)
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(this.employeeService.saveEmployee(employee), HttpStatus.OK);

    }
    @RequestMapping(value = "/deleteEmployee/{eid}" ,method =RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Long eid){}

    @RequestMapping(value = "/updateEmployee/{eid}" ,method =RequestMethod.PUT)
    public void updateEmployee(@PathVariable Long eid, @RequestBody Employee employee){}

    @RequestMapping(value = "/getEmployee/{eid}" ,method =RequestMethod.GET)
    public ResponseEntity<Employee> getEmployee(@PathVariable Long eid){
        return new ResponseEntity<Employee>(this.employeeService.getEmployee(eid), HttpStatus.OK);
    }
    @RequestMapping(value = "/getEmployees" ,method =RequestMethod.GET)
    public void getEmployees(){}
}
