package com.springcore.assignments;

public class Address {
 String Street;
 String City;
 String State;
 String Zip;
 String Country;
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getZip() {
	return Zip;
}
public void setZip(String zip) {
	Zip = zip;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
 

 void details() {
	 System.out.println(getStreet()+" "+"This is the street name");
 }
}
