package com.cg.CustomerDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String customerName;
	private String customerEmail;
	private Integer customerPhone;
	private String customerArea;
	private String customerCity;
	private String customerState;
	private String customerCountry;
	private Integer customerZipcode;
	private String customerAddress;
	
	
	public Customer() {
		
	}


	public Customer(Integer id, String customerName, String customerEmail, Integer customerPhone, String customerArea,
			String customerCity, String customerState, String customerCountry, Integer customerZipcode,
			String customerAddress) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerArea = customerArea;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerCountry = customerCountry;
		this.customerZipcode = customerZipcode;
		this.customerAddress = customerAddress;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public Integer getCustomerPhone() {
		return customerPhone;
	}


	public void setCustomerPhone(Integer customerPhone) {
		this.customerPhone = customerPhone;
	}


	public String getCustomerArea() {
		return customerArea;
	}


	public void setCustomerArea(String customerArea) {
		this.customerArea = customerArea;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	public String getCustomerState() {
		return customerState;
	}


	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}


	public String getCustomerCountry() {
		return customerCountry;
	}


	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}


	public Integer getCustomerZipcode() {
		return customerZipcode;
	}


	public void setCustomerZipcode(Integer customerZipcode) {
		this.customerZipcode = customerZipcode;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customerEmail=" + customerEmail
				+ ", customerPhone=" + customerPhone + ", customerArea=" + customerArea + ", customerCity="
				+ customerCity + ", customerState=" + customerState + ", customerCountry=" + customerCountry
				+ ", customerZipcode=" + customerZipcode + ", customerAddress=" + customerAddress + "]";
	}



}
