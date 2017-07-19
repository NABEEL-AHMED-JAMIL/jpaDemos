package com.example.jpaDemos.read.google.driver.sheet.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Lycus 01 on 7/18/2017.
 */
// test1 used to read the data from the google drive
// file and put the data into the database
@Entity
@Table(name = "employee")
public class Employee extends DeletableModel implements Serializable{
    //
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "eid")
    private Long eid;
    @Column(name = "ename",nullable = false)
    private String ename;
    @Column(name = "salary", nullable = false)
    private Double salary;
    @Column(name = "deg")
    @ElementCollection
    private List<String> deg;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "username", unique = true, nullable = false,length = 50)
    private String username;
    @Column(name = "password", unique = true, nullable = false,length = 50)
    @Size(min = 8, max = 50)
    private String password;
    @Column(name = "age")
    private Integer age;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "employee_authority",
            joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "eid"),
            inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    private List<Authority> authorities;

    public Employee() { super(); }


    public Employee(Long eid, String ename, Double salary, List<String> deg, Gender gender, String username, String password, Integer age, List<Authority> authorities) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.age = age;
        this.authorities = authorities;
    }

    public Long getEid() { return eid; }

    public void setEid(Long eid) { this.eid = eid; }

    public String getEname() { return ename; }

    public void setEname(String ename) { this.ename = ename; }

    public Double getSalary() { return salary; }

    public void setSalary(Double salary) { this.salary = salary; }

    public List<String> getDeg() { return deg; }

    public void setDeg(List<String> deg) { this.deg = deg; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public Integer getAge() { return age; }

    public void setAge(Integer age) { this.age = age; }

    @JsonIgnore
    public List<Authority> getAuthorities() { return authorities; }

    public void setAuthorities(List<Authority> authorities) { this.authorities = authorities; }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", deg='" + deg + '\'' +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
