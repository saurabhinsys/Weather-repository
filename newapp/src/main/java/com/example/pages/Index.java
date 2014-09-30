package com.example.pages;

import java.util.Date;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.annotations.*;
import org.apache.tapestry5.corelib.components.*;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.alerts.AlertManager;

/**
 * Start page of application newapp.
 */
public class Index
{
private String username = "username";
private String password = "password";



@Persist
private boolean checkCredential;
@Persist
private String validateMessage;
  
	@InjectPage
	private Home home;
	
/*@SessionState
	private User user;
	
	public User getUser() {
		return user;
	*/
	
	
	
	public void setCheckCredential(boolean checkCredential) {
		System.out.println("setCheckCredential is called " + checkCredential);
		this.checkCredential = checkCredential;
	}
	

	public String getValidateMessage() {
		System.out.println("getValidateMessage() is called");
		return validateMessage;
	}


	public void setValidateMessage(String validateMessage) {
		System.out.println("setValidateMessage() is called " + validateMessage);
		this.validateMessage = validateMessage;
	}


	public boolean isCheckCredential() {
		System.out.println("isCheckCredential is called");
		return checkCredential;
	}



	public String getMessage(){
		return "print Message";
	}
	
	public Date getCurrentTime(){
		return new Date();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		
		System.out.println("Setting the username");
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		System.out.println("Setting the password");
		this.password = password;
	}
	
	@OnEvent(value="submit", component="loginForm")
	Object doLogin(){
		
		System.out.println("Handling Login form submission");
		
		if(username!=null && password!=null){
		if(username.equalsIgnoreCase(password)){
		home.setUsername(username);
		setCheckCredential(false);
		setValidateMessage("hhbhb");
		return home;
		
		}
		}
		setCheckCredential(true);
		setValidateMessage("Invalid Username or Password");
		return null;
		
		
		
	}
	
	
	
}
