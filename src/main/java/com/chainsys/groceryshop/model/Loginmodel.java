package com.chainsys.groceryshop.model;

import org.springframework.stereotype.Component;

@Component
public class Loginmodel {
	private String userName;
	private String password;
	public Loginmodel(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Loginmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
