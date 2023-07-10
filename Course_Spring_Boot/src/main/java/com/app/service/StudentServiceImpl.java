package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dao.StudentRespo;
import com.app.dto.StudentDto;
import com.app.pojos.Course;
import com.app.pojos.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRespo repo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private CourserServiceImpl cService;
	
	@Override
	public List<Student> getAllstudent() {
		return repo.findAll();
	}

	@Override
	public Student addStudent(StudentDto s) {
		Course c = cService.findCourse(s.getDept_id());
		Student std = mapper.map(s, Student.class);
		std.setAssignedCourse(c);
		c.addStudent(std);
		return repo.save(std);
	}
	
	

}
