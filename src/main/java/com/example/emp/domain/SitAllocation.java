package com.example.emp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SitAllocation {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String regNo;
	private String roomID;
	private String date;
	private String time;
	private String sitNo;
	
	public SitAllocation() {
		
	}
	public SitAllocation(Long id, String regNo, String roomID, String date, String time, String sitNo) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.roomID = roomID;
		this.date = date;
		this.time = time;
		this.sitNo = sitNo;
	}
	@Override
	public String toString() {
		return "SitAllocation [id=" + id + ", regNo=" + regNo + ", roomID=" + roomID + ", date=" + date + ", time="
				+ time + ", sitNo=" + sitNo + "]";
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
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSitNo() {
		return sitNo;
	}
	public void setSitNo(String sitNo) {
		this.sitNo = sitNo;
	}
	
}
