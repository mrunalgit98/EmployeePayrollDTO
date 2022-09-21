package com.example.employeeapp1.Exception;

import com.example.employeeapp1.DTO.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeeAppException {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO>handleException(MethodArgumentNotValidException exception){
        List<ObjectError>errorList=exception.getBindingResult().getAllErrors();
        List<String>errorMessage=errorList.stream().map(objectError -> objectError.getDefaultMessage()).collect(Collectors.toList());
     ResponseDTO responseDTO=new ResponseDTO("exception while processing Rest",errorMessage);
     return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
