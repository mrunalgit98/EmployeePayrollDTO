
package com.example.employeeapp1.Repository;


import com.example.employeeapp1.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<Employee, Integer> {
}
