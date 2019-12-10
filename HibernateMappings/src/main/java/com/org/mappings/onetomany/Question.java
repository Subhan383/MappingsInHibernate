package com.org.mappings.onetomany;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="qstn123")
public class Question {
	
	@Id
	private int qId;
	private String qname;
	@OneToMany(targetEntity=Answer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="ansid")
	@OrderColumn(name="type")
	private List<Answer> answers=new ArrayList<Answer>();
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	
	
	
	

}
