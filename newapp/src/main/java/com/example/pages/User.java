package com.example.pages;

public class User {
	
	private String username;
	private String password;
	private String lastname;
	private boolean userExist;
	
	
	
	public boolean isUserExist() {
		return userExist;
	}
	public void setUserExist(boolean userExist) {
		this.userExist = userExist;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	

}
