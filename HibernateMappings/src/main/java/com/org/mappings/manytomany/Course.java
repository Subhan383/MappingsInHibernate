package com.org.mappings.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses383")
public class Course {

	@Id
	@Column(name="courseid")
	private int courseid;
	@Column(name="course_name")
	private String courseName;
	public Course(int courseid, String courseName) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}
