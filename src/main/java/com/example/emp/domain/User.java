package com.example.emp.domain;
 
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String userName;
    private String password;
    @Column(unique = true)
    private String regStaffNo;
    private String gender;
    private String roles;
    private String deptid;
    @Column(unique = true)
    private String email;
    private String dob;
    LocalDateTime createdOn;
    LocalDateTime updatedOn;
    
    
    
    
    
    
	public User() {
		
	}
	public User(int id, String userName, String password, String regStaffNo, String gender, boolean active,
			String roles, String deptid, String email, String dob, LocalDateTime createdOn, LocalDateTime updatedOn) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.regStaffNo = regStaffNo;
		this.gender = gender;
		this.roles = roles;
		this.deptid = deptid;
		this.email = email;
		this.dob = dob;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", regStaffNo=" + regStaffNo
				+ ", gender=" + gender + ", active=" + ", roles=" + roles + ", deptid=" + deptid + ", email="
				+ email + ", dob=" + dob + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the regStaffNo
	 */
	public String getRegStaffNo() {
		return regStaffNo;
	}
	/**
	 * @param regStaffNo the regStaffNo to set
	 */
	public void setRegStaffNo(String regStaffNo) {
		this.regStaffNo = regStaffNo;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * @return the roles
	 */
	public String getRoles() {
		return roles;
	}
	/**
	 * @param roles the roles to set
	 */
	public void setRoles(String roles) {
		this.roles = roles;
	}
	/**
	 * @return the deptid
	 */
	public String getDeptid() {
		return deptid;
	}
	/**
	 * @param deptid the deptid to set
	 */
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the createdOn
	 */
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the updatedOn
	 */
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
    
}

	