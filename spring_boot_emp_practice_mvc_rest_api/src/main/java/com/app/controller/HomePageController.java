package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	public HomePageController() {
		System.out.println("in Contr of home page Contorller");
	}
	
	@RequestMapping("/")
	public String HomePage(Model map) {
		map.addAttribute("name", "Rohit");
		return "/index";
	}
}
