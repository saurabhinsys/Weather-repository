package com.example.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.SessionState;

public class Home {
	
	private String username;
	private String password;
	
	@SessionState
	private User myUser;
	
	public User getMyUser() {
		return myUser;
	}
	
	String onPassivate(){
		System.out.println("onPassivate is called");
		return username;
	}
	
	public void onActivate(String username){
		System.out.println("onActivate is called");
		this.username = username;
		}

	public String getUsername() {
		System.out.println("getUsername() method is called");
		return username;
	}
	public void setUsername(String username) {
		System.out.println("setUsername() method is called");
		this.username = username;
	}
	public String getPassword() {
		System.out.println("getPassword() is called");
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setPassword() is called");
		this.password = password;
	}
	
	

}
