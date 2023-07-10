package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CourseDto;
import com.app.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	public CourseService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> courseList(){
		return new ResponseEntity<>(service.getAllCourse(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addCousrse(@RequestBody CourseDto coursedto){
		return new ResponseEntity<>(service.newCourse(coursedto),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/ctitle/{title}")
	public ResponseEntity<?> getByTitle(@PathVariable String title){
		return new ResponseEntity<>(service.courseByTitle(title),HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updatefee/{cid}/{fee}") 
	public ResponseEntity<?> updateCourseFee(@PathVariable long cid,@PathVariable double fee){
		return new ResponseEntity<>(service.updateFee(cid,fee),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{cid}/std/{sid}")
	public ResponseEntity<?> cancleAddmission(@PathVariable Long cid, @PathVariable Long sid){
		return new ResponseEntity<>(service.cancleAddmission(cid, sid),HttpStatus.ACCEPTED);
	}
}
