package com.example.employeeapp1;

import com.example.employeeapp1.DTO.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeeApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApp1Application.class, args);
		log.info("app started");
	}

}
