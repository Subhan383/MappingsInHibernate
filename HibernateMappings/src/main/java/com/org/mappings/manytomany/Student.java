package com.org.mappings.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
@Table(name="student383")
public class Student {
	@Id
	@Column(name="stdid")
	private int stdId;
	@Column(name="stdname")
	private String stdName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course", joinColumns= {@JoinColumn(name="stdid")},inverseJoinColumns= {@JoinColumn(name="courseid")})
	private Set<Course> courses=new HashSet<Course>();

	public Student(int stdId, String stdName, Set<Course> courses) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.courses = courses;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	

}
