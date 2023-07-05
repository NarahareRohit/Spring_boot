package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptservice;
	
	@RequestMapping("/list")
	public ModelAndView getDeptList() {
		return new ModelAndView("/dept/list","dept_list",deptservice.getAllDept());
		
	}
}
