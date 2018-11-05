package com.cg.tes.beans;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class User {
	
@NotEmpty(message = "Please Enter user Name")
@Size(min=3,max=20,message="Username must be between 3 and 20 characters long.")
@Pattern(regexp="^[a-zA-Z0-9]+$",message="No spaces allowed.")	
private String username;
@NotEmpty(message = "Please Enter password")
@Size(min=6,max=12,message="Password must be between 6 and 12 characters long.")
private String password;
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

}
