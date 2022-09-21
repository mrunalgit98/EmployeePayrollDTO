package com.example.employeeapp1.Controller;



import com.example.employeeapp1.DTO.EmployeeDTO;
import com.example.employeeapp1.DTO.ResponseDTO;
import com.example.employeeapp1.Model.Employee;
import com.example.employeeapp1.Service.EmployeePayrollService;
import com.example.employeeapp1.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//@RequestMapping("/employeePayrollService")
public class EmployeePayrollController {

    @Autowired

    IEmployeeService employeeService;
    @GetMapping("/home")
    public String home() {
        String message = employeeService.getMessage();
        return message;
    }

    @PostMapping("/AddEmployee")
    public ResponseEntity<ResponseDTO> getEmployee(@Valid @RequestBody EmployeeDTO employeeModel) {

        Employee addEmployee = employeeService.AddEmployee(employeeModel);
        ResponseDTO responseDTO=new ResponseDTO("Employee added successfully", addEmployee);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{getId}")
    public ResponseEntity<ResponseDTO> getEmployee(@PathVariable int getId) {
        Employee employeeModel = employeeService.getEmployeeDetails(getId);
        ResponseDTO responseDTO=new ResponseDTO("Call for Id successful", employeeModel);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<ResponseDTO> getEmployees()
    {
        List<Employee> employeeModel = employeeService.getListOfEmployees();
        ResponseDTO responseDTO=new ResponseDTO("Call for employee successful", employeeModel);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDTO> deleteEmployee(@RequestParam int id){
        employeeService.deleteEmployee(id);
        ResponseDTO responseDTO= new ResponseDTO("Employee Deleted Successfully", id);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployee(@Valid@PathVariable int empId, @RequestBody EmployeeDTO employeeModelDTO){
     ResponseDTO responseDTO= new ResponseDTO("Employee Details Updated successfully",  employeeService.updateEmployee(empId, employeeModelDTO));
      return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

}