package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Student;

public interface StudentRespo extends JpaRepository<Student, Long>{

}
