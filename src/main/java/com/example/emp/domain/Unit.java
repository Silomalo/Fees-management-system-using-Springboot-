package com.example.emp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	private String unitCode;
	private String unitName;
	private String unitCreditUnits;
	private String session;
	private String deptID;
	
	
	public Unit() {
		
	}
	public Unit(Long id, String unitCode, String unitName, String unitCreditUnits, String session, String deptID) {
		super();
		this.id = id;
		this.unitCode = unitCode;
		this.unitName = unitName;
		this.unitCreditUnits = unitCreditUnits;
		this.session = session;
		this.deptID = deptID;
	}
	@Override
	public String toString() {
		return "Unit [id=" + id + ", unitCode=" + unitCode + ", unitName=" + unitName + ", unitCreditUnits="
				+ unitCreditUnits + ", session=" + session + ", deptID=" + deptID + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitCreditUnits() {
		return unitCreditUnits;
	}
	public void setUnitCreditUnits(String unitCreditUnits) {
		this.unitCreditUnits = unitCreditUnits;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDeptID() {
		return deptID;
	}
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}	
}
