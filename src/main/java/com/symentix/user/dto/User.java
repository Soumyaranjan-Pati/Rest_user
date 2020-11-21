package com.symentix.user.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
@Id
private int userId;
private String username;
private int rollNo;
private String email;
private long mobile;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String username, int rollNo, String email, long mobile) {
	super();
	this.userId = userId;
	this.username = username;
	this.rollNo = rollNo;
	this.email = email;
	this.mobile = mobile;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}

}
