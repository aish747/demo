package com.example1.demo1.models;
//import javax.persistence.Entity;
import javax.persistence.*;
//import javax.persistence.GeneratedValue;

//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String userName;
private String password;
private String roles;
private boolean active;

public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id=id;
}
public String getUserName() {
	return userName;
}
public void setName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRoles() {
	return roles;
}
public void setRole(String roles) {
	this.roles = roles;
}
public boolean isActive()
{
	return true;
}
public void setActive(boolean active)
{
	this.active=active;
}
}
