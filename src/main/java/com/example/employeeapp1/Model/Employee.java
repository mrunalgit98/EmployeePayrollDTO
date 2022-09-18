package com.example.employeeapp1.Model;



import com.example.employeeapp1.DTO.EmployeeDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    private String employeeName;

    private String department;
    private long salary;


    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public Employee(){
    }

    public Employee(long id, String employeeName,  String department, long salary) {
        this.id = id;
        this.employeeName = employeeName;

        this.department = department;
        this.salary = salary;

    }

    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }



    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public long getSalary() {

        return salary;
    }

    public void setSalary(long salary) {

        this.salary = salary;
    }


    public Employee(int id,EmployeeDTO employeeModelDTO){
        this.employeeName=employeeModelDTO.getEmployeeName();

        this.department=employeeModelDTO.getDepartment();
        this.salary=employeeModelDTO.getSalary();


    }



}