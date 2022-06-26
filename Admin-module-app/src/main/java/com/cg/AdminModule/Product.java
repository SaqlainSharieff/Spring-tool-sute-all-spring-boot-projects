package com.cg.AdminModule;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productid;
    private String name;
    private float cost;
	public Product() 
	{
		
	}
	public Product(Integer productid, String name, float cost) {
		super();
		this.productid = productid;
		this.name = name;
		this.cost = cost;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", cost=" + cost + "]";
	}
 
    
    
}