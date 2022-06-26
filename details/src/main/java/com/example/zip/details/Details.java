package com.example.zip.details;

public class Details {

	String state;
	String city;
	String country;
	Integer zipcode;
	public Details(String state, String city, String country, Integer zipcode) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}
	public Details() {
		super();
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	@Override
	public String toString() {
		return "Details [state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
