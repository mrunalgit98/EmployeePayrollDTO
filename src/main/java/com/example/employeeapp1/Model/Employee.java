package com.example.employeeapp1.Model;



import com.example.employeeapp1.DTO.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.intellij.lang.annotations.Pattern;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@ToString
public class Employee {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;


    private String employeeName;

    private String department;
    private int salary;

    public Employee(int empId){
        this.employeeid=empId;


    }


    public Employee(EmployeeDTO employeeModelDTO) {
        this.employeeName=employeeModelDTO.getEmployeeName();

        this.department=employeeModelDTO.getDepartment();
        this.salary=employeeModelDTO.getSalary();
    }
}