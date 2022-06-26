package com.springcore.assignments;

import org.springframework.beans.factory.annotation.Autowired;

public class Coustomer {
 int CoustomerID;
 String CoustomerName;
 String CoustomerContact;
 String CoustomerAddress;
 @Autowired
public int getCoustomerID() {
	return CoustomerID;
}
public void setCoustomerID(int coustomerID) {
	CoustomerID = coustomerID;
}
public String getCoustomerName() {
	return CoustomerName;
}
public void setCoustomerName(String coustomerName) {
	CoustomerName = coustomerName;
}
public String getCoustomerContact() {
	return CoustomerContact;
}
public void setCoustomerContact(String coustomerContact) {
	CoustomerContact = coustomerContact;
}
public String getCoustomerAddress() {
	return CoustomerAddress;
}
public void setCoustomerAddress(String coustomerAddress) {
	CoustomerAddress = coustomerAddress;
}
 
  void coustomerDetails() {
	  System.out.println(getCoustomerID()+" "+"This is coustomer id");
  }
}
