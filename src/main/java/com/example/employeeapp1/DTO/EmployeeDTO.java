package com.example.employeeapp1.DTO;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


@Data


public class EmployeeDTO {

    @NotEmpty(message = "not valid")
   @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name is Invalid")

    public String employeeName;

    public String department;
    public long salary;

    public EmployeeDTO(String employeeName, String department, long salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}