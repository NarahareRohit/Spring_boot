package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AddressDto;
import com.app.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllAddress(){
		return new ResponseEntity<>(service.allAddress(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addAddress(@RequestBody AddressDto address){
		System.out.println(address);
		return new ResponseEntity<>(service.addAddress(address),HttpStatus.ACCEPTED);
	}
	
}
