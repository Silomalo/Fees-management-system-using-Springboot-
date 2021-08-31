package com.example.emp.domain;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;



public class MyUserDetails implements UserDetails {

	 	/**
	 * 
	 */
	private static final long serialVersionUID = 4127648125860634684L;
		private String userName;
	    private String password;
	    private String regStaffNo;
	    private String gender;
	    private String roles;
	    private String deptid;
	    private String email;
	    private String dob;
    private List<GrantedAuthority> authorities;

    public MyUserDetails(User user) {
    	
        this.userName = user.getUserName();
        this.password = user.getPassword();
		this.regStaffNo = user.getRegStaffNo();
		this.gender = user.getGender();
		this.roles = user.getRoles();
		this.deptid = user.getDeptid();
		this.email = user.getEmail();
		this.dob = user.getDob();
        
        
        this.authorities = Arrays.stream(user.getRoles().split(","))
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

    
}
