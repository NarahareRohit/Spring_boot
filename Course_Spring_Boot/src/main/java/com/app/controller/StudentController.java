package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.StudentDto;
import com.app.service.StudentService;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> allStudent(){
		return new ResponseEntity<>(service.getAllstudent(),HttpStatus.ACCEPTED);
	}
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody StudentDto s) {
		return new ResponseEntity<>(service.addStudent(s),HttpStatus.ACCEPTED);
	}
	

}
