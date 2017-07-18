package com.example.jpaDemos.read.google.driver.sheet.data.repository;

import com.example.jpaDemos.read.google.driver.sheet.data.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Lycus 01 on 7/18/2017.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
