package com.app.service;



import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CourseRepo;
import com.app.dao.StudentRespo;
import com.app.dto.CourseDto;
import com.app.pojos.Course;
import com.app.pojos.Student;

@Service
@Transactional
public class CourserServiceImpl implements CourseService {
	
	@Autowired	
	private CourseRepo crepo;
	
	@Autowired
	private StudentRespo srepo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@Override
	public Course findCourse(long id) {
		return crepo.findById(id).orElseThrow();
	}


	@Override
	public List<Course> getAllCourse() {
		return crepo.findAll();
	}


	@Override
	public Course newCourse(CourseDto cdto) {
		Course course = mapper.map(cdto, Course.class);
		return crepo.save(course);
	}


	@Override
	public List<Course> courseByTitle(String title) {
		return crepo.findByTitle(title);
	}
	
	

	@Override
	public String cancleAddmission(long cid, long sid) {
		Course c = crepo.findById(cid).orElseThrow();
		Student s = srepo.findById(sid).orElseThrow();
		c.removeStudent(s);
		if(crepo.existsById(cid)) {
			return "deleted";
		}
		return "Not deleted";
	}


	@Override
	public String updateFee(long cid, double fee) {
		Course c = crepo.findById(cid).orElseThrow();
		c.setFee(fee);
		Course newCourse = crepo.save(c);
		if(newCourse.getFee()==fee) {
			return "fee updated";
		}
		return "Not updated";
	}
	
	
}
