package com.example.employeeapp1.DTO;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;


@Data


public class EmployeeDTO {

    @NotEmpty(message = "not valid")
   @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name is Invalid")

    public String employeeName;

    public String department;
    @Min(value=500,message="Min wage should be more than 500")
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