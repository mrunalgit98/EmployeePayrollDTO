package com.example.employeeapp1.DTO;

public class EmployeeDTO {

    private String employeeName;

    private String department;
    private long salary;


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




    public EmployeeDTO(String employeeName,  String department, long salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;

    }

    public EmployeeDTO() {
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