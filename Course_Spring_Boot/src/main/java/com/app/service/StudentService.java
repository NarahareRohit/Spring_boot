package com.app.service;

import java.util.List;

import com.app.dto.StudentDto;
import com.app.pojos.Student;

public interface StudentService {
	public List<Student> getAllstudent();
	public Student addStudent(StudentDto s);
}
