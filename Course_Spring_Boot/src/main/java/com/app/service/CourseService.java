package com.app.service;

import java.util.List;

import com.app.dto.CourseDto;
import com.app.pojos.Course;

public interface CourseService {
	 Course findCourse(long id);
	 List<Course> getAllCourse();
	 Course newCourse(CourseDto cdto);
	 List<Course> courseByTitle(String title);
	 String cancleAddmission(long cid,long sid);
	 String updateFee(long cid,double fee);
}
