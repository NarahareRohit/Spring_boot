package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class EmployeeController {
	public EmployeeController() {
		System.out.println("inside contr"+getClass().getName());
	}
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/list")
	public List<Employee> getAllEmp(Model map) {
//		System.out.println(empService.getAllEmpList());
//		map.addAttribute("emp_list",empService.getAllEmpList());
//		return "/emp/list";
		return empService.getAllEmpList();
	}
	
	@GetMapping("/signin")
	public String loginPage() {
		return "/emp/login";
	}
	
	@PostMapping("/signin")
	public String EmpLogin(@RequestParam String username,String password,Model map) {
		Employee emp = empService.validEmp(username, password);
		if(emp!=null) {
			map.addAttribute("validEmp", emp);
			return "/emp/details";
		}
		return "/emp/login";
	}
	
	@RequestMapping("/byid")
	public List<Employee> empListByDeptId(@RequestParam long dept_id, Model map) {
		System.out.println(dept_id);
//		map.addAttribute("emp_list", empService.getEmpByDeptId(dept_id));
//		return "/emp/list";
		return empService.getEmpByDeptId(dept_id);
	}
	
	
	
	
	
	
	
}
