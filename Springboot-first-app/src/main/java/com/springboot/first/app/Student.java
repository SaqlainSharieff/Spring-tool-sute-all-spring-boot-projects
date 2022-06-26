package com.springboot.first.app;


public class Student {
	
	private String Firstname;
	private String Lastname;
	
	
	
	public Student() {
		super();
	}
	public Student(String firstname, String lastname) {
		super();
		Firstname = firstname;
		Lastname = lastname;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	@Override
	public String toString() {
		return "Student [Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}
	
	


}
