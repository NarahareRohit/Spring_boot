package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name = "student")
@JsonIgnoreType
public class Student extends BaseEntity{
	private String fname;
	private String lname;
	private String email;
	private double score_ob;
	
	@ManyToOne
	@JoinColumn(name = "dept_id",nullable = false)
	private Course assignedCourse;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String fname, String lname, String email, double score_ob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.score_ob = score_ob;
	}
	
	public Course getAssignedCourse() {
		return assignedCourse;
	}
	public void setAssignedCourse(Course assignedCourse) {
		this.assignedCourse = assignedCourse;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getScore_ob() {
		return score_ob;
	}
	public void setScore_ob(double score_ob) {
		this.score_ob = score_ob;
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", email=" + email + ", score_ob=" + score_ob + "]";
	}
	
}
