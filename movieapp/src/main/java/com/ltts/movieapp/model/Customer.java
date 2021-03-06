package com.ltts.movieapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private String email;
	private String name;
	private String mobile;
	private String location;
	
	
	public Customer() {
		super();
	}
	public Customer(String email, String name, String mobile, String location) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name + ", mobile=" + mobile + ", location=" + location + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
