package com.example.employeeapp1.Service;


import com.example.employeeapp1.DTO.EmployeeDTO;
import com.example.employeeapp1.Model.Employee;
import com.example.employeeapp1.Repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollService implements IEmployeeService {

    @Autowired
    EmployeePayrollRepository repository;

    @Override
    public String getMessage() {

        return "This is Employee payroll service";
    }

    @Override
    public Employee AddEmployee(EmployeeDTO employeeModelDTO) {
        Employee employeeModel=new Employee(employeeModelDTO);
        repository.save(employeeModel);
        return employeeModel;
    }

    @Override
    public List<Employee> getListOfEmployees() {
        List<Employee> employeeModels = repository.findAll();
        return employeeModels;
    }

    @Override
    public Employee getEmployeeDetails(int getId) {
        Optional<Employee> employeeModel = repository.findById((long) getId);
        return employeeModel.get();
    }

    @Override
    public Employee deleteEmployee(int id) {
        repository.deleteById((long) id);
        return null;
    }

    @Override
    public Employee updateEmployee(long getId, EmployeeDTO employeeModelDTO) {
        Optional<Employee> employeeModel1 = repository.findById(getId);
        if (employeeModel1.isPresent()) {
            employeeModel1.get().setEmployeeName(employeeModelDTO.getEmployeeName());
            employeeModel1.get().setDepartment(employeeModelDTO.getDepartment());

            employeeModel1.get().setSalary(employeeModelDTO.getSalary());

            repository.save(employeeModel1.get());
            return employeeModel1.get();
        } else {
            return null;
        }
    }

}