package com.example.employeeapp1.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString

public class EmployeeDTO {

    private String employeeName;

    private String department;
    private long salary;

}