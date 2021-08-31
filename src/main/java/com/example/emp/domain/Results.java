package com.example.emp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Results {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	private String regNo;
	private String unitCode;
	private String courseWork;
	private String exam;
	
	
	public Results() {
	
	}
	
	public Results(Long id, String regNo, String unitCode, String courseWork, String exam) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.unitCode = unitCode;
		this.courseWork = courseWork;
		this.exam = exam;
	}
	@Override
	public String toString() {
		return "Results [id=" + id + ", regNo=" + regNo + ", unitCode=" + unitCode + ", courseWork=" + courseWork
				+ ", exam=" + exam + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getCourseWork() {
		return courseWork;
	}
	public void setCourseWork(String courseWork) {
		this.courseWork = courseWork;
	}
	public String getExam() {
		return exam;
	}
	public void setExam(String exam) {
		this.exam = exam;
	}
	
	
	
}
