package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Product;
import com.app.service.ProductServiceInterface;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class HomePageController {
	public HomePageController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private ProductServiceInterface pService;
	
	@GetMapping
	public List<Product> productList(){
		return pService.getAllProduct();	
	}
	
	@PostMapping("/add")
	public Product sendProduct(@RequestBody Product product) {
		return pService.addProduct(product);	
	}
	
}
