package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Course;

public interface CourseRepo extends JpaRepository<Course, Long >{

	List<Course> findByTitle(String title);
	
}
