package com.example.employeeapp1.Controller;



import com.example.employeeapp1.DTO.EmployeeDTO;
import com.example.employeeapp1.DTO.ResponseDTO;
import com.example.employeeapp1.Model.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeePayrollController {



    @GetMapping(value = {"/AddEmployee"})
    public ResponseEntity<ResponseDTO> getEmployee() {
        Employee employee =null;
        employee=new Employee(1,new EmployeeDTO("Mrunal","sales",3434));
        ResponseDTO response=new ResponseDTO("Employee added successfully", employee);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{getId}")
    public ResponseEntity<ResponseDTO> getbyIDEmployee() {
        Employee employee;
        employee=new Employee(1,new EmployeeDTO("mrunal","sales",23232));
        ResponseDTO responseDTO=new ResponseDTO("Call for Id successful", employee);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }


    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDTO> deleteEmployee(@RequestParam int id){
        ResponseDTO responseDTO= new ResponseDTO("Employee Deleted Successfully", id);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{getId}")
    public ResponseEntity<ResponseDTO> updateEmployee(@PathVariable long getId, @RequestBody EmployeeDTO employeeModelDTO){
        Employee employee;
        employee =new Employee(1,employeeModelDTO);
        ResponseDTO responseDTO= new ResponseDTO("Employee Details Updated successfully", employee);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

}