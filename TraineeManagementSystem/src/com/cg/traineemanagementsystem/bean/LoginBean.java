package com.cg.traineemanagementsystem.bean;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBean {
	
	@NotEmpty(message="User Name Cannot be Empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")
	private String userName;
	
	@NotEmpty(message="Password Cannot be Empty")
	@Pattern(regexp = "^[a-zA-Z0-9+@]+$", message = "Password must be AlphaNumeric")
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public LoginBean() {
	}

	public LoginBean(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
