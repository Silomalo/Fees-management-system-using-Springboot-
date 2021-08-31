package com.example.emp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AllocatedRoom {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String roomID;
	private String unitCode;
	private String examDate;
	private String startTime;
	
	
	public AllocatedRoom() {
	
	}
	
	
	public AllocatedRoom(Long id, String roomID, String unitCode, String examDate, String startTime) {
		super();
		this.id = id;
		this.roomID = roomID;
		this.unitCode = unitCode;
		this.examDate = examDate;
		this.startTime = startTime;
	}
	@Override
	public String toString() {
		return "AllocatedRoom [id=" + id + ", roomID=" + roomID + ", unitCode=" + unitCode + ", examDate=" + examDate
				+ ", startTime=" + startTime + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
}
