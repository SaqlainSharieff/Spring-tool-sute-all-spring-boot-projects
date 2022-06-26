package com.cg.UserOrderManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OrderDetails 
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderid;
	private String orderType;
	private double orderAmount;
	
	
	public OrderDetails() 
	{
		
	}


	public OrderDetails(Integer orderid, String orderType, double orderAmount) {
		super();
		this.orderid = orderid;
		this.orderType = orderType;
		this.orderAmount = orderAmount;
	}


	public Integer getOrderid() {
		return orderid;
	}


	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}


	public String getOrderType() {
		return orderType;
	}


	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


	public double getOrderAmount() {
		return orderAmount;
	}


	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}


	@Override
	public String toString() {
		return "OrderDetails [orderid=" + orderid + ", orderType=" + orderType + ", orderAmount=" + orderAmount + "]";
	}
	
	
	
	
}
