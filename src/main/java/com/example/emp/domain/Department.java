package com.example.emp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Department {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String deptID;
	private String deptName;
	private String deptHOD;
	
	
	public Department() {
	
	}
	public Department(Long id, String deptID, String deptName, String deptHOD) {
		super();
		this.id = id;
		this.deptID = deptID;
		this.deptName = deptName;
		this.deptHOD = deptHOD;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptID=" + deptID + ", deptName=" + deptName + ", deptHOD=" + deptHOD + "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeptID() {
		return deptID;
	}
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHOD() {
		return deptHOD;
	}
	public void setDeptHOD(String deptHOD) {
		this.deptHOD = deptHOD;
	}
	
	

}
