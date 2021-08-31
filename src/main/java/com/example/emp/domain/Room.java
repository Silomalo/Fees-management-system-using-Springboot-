package com.example.emp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String rooID;
	private String rooName;
	private String capacity;
	
	public Room() {
		
	}
	public Room(Long id, String rooID, String rooName, String capacity) {
		super();
		this.id = id;
		this.rooID = rooID;
		this.rooName = rooName;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", rooID=" + rooID + ", rooName=" + rooName + ", capacity=" + capacity + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRooID() {
		return rooID;
	}
	public void setRooID(String rooID) {
		this.rooID = rooID;
	}
	public String getRooName() {
		return rooName;
	}
	public void setRooName(String rooName) {
		this.rooName = rooName;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
}
