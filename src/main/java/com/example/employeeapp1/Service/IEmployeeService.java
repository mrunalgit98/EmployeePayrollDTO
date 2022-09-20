package com.example.employeeapp1.Service;


import com.example.employeeapp1.DTO.EmployeeDTO;
import com.example.employeeapp1.Model.Employee;

import java.util.List;

public interface IEmployeeService {

    public String getMessage();
    Employee AddEmployee(EmployeeDTO employeeModel);

    List<Employee> getListOfEmployees();

    Employee getEmployeeDetails(int getId);

    Employee deleteEmployee(int id);

    Employee updateEmployee(long getId, EmployeeDTO employeeModelDTO);

}