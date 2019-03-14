package org.sql;

import java.util.Date;

 public class Eight  {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String email;
	private String teamName;
	private long contact;
	private Date dob;
public Eight() {
	System.out.println("class object created");
}
public Eight(int id, String name, int age, String gender, String email, String teamName, long contact, Date dob) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.email = email;
	this.teamName = teamName;
	this.contact = contact;
	this.dob = dob;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTeamname() {
	return teamName;
}
public void setTeamname(String teamname) {
	this.teamName = teamname;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}

}
