package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthDTO;
import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class EmployeeController {
	public EmployeeController() {
		System.out.println("inside contr" + getClass().getName());
	}

	@Autowired
	private EmployeeService empService;

	@GetMapping("/list")
	public List<Employee> getAllEmp() {
		return empService.getAllEmpList();
	}

	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee emp) {
		return empService.addEmp1(emp);
	}

	@PostMapping("/getid/{id}")
	public Employee getById(@PathVariable("id") Long id) {
		return empService.getEmpDetail(id);
	}

	@DeleteMapping("/delete/{eid}")
	public Employee deleteEmp(@PathVariable(value = "eid") Long eid) {
		Employee emp = empService.getEmpDetail(eid);
		empService.deleteEmpDetail(emp);
		return emp;
	}
	 
	@PutMapping("/update")
	public Employee updateEmp(@RequestBody Employee emp) {
		return empService.updateEmpDetails(emp);
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> signIn(@RequestBody @Valid AuthDTO req) {
		return ResponseEntity.status(HttpStatus.OK).body(empService.validate(req));
	}
	
	

}
