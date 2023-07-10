package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name = "course")
@JsonIgnoreType
public class Course extends BaseEntity{
	@Column(length = 50,unique = true)
	private String title;
	private LocalDate start_date;
	private LocalDate end_date;
	private double fee;
	private double min_score;
	
	@OneToMany(mappedBy = "assignedCourse", cascade = CascadeType.ALL ,orphanRemoval = true,fetch = FetchType.EAGER)
	private List<Student> listStudent = new ArrayList<>();
	
	public void addStudent(Student s) {
		listStudent.add(s);
		s.setAssignedCourse(this);
	}
	public void removeStudent(Student s) {
		listStudent.remove(s);
		s.setAssignedCourse(null);
	}
	
	public List<Student> getListStudent() {
		return listStudent;
	}
	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String title, LocalDate start_date, LocalDate end_date, double fee, double min_score) {
		super();
		this.title = title;
		this.start_date = start_date;
		this.end_date = end_date;
		this.fee = fee;
		this.min_score = min_score;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getMin_score() {
		return min_score;
	}
	public void setMin_score(double min_score) {
		this.min_score = min_score;
	}
	@Override
	public String toString() {
		return "Course [title=" + title + ", start_date=" + start_date + ", end_date=" + end_date + ", fee=" + fee
				+ ", min_score=" + min_score + "]";
	}
	
}	
