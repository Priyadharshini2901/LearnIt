package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity

public class Signup 
{
   @Id
   private String username;
   private String email;
   private String password;
   private String mobile;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
   
}


