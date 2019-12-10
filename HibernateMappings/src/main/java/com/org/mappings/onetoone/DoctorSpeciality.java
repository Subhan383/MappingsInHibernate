package com.org.mappings.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="doc_skill")
public class DoctorSpeciality {
	@Id
	@Column(name="specializationid",length=10)
	private int skillId;
	@Column(name="specializationname",length=10)
	private String specialityName;
	@Column(name="specializationfee",length=10)
	private int specialityFee;
	@OneToOne(targetEntity=Doctor.class,cascade=CascadeType.ALL)
	@JoinColumn(name="doctorid",referencedColumnName="docid")
	private Doctor doctor;
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public String getSpecialityName() {
		return specialityName;
	}
	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}
	public int getSpecialityFee() {
		return specialityFee;
	}
	public void setSpecialityFee(int specialityFee) {
		this.specialityFee = specialityFee;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	

	
	
	
}
