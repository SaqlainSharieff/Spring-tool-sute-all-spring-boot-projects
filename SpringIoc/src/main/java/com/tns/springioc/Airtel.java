package com.tns.springioc;

public class Airtel implements Sim
{
	public Airtel() 
  {
		System.out.println("Airtel object is created");
	}

	public void calling() 
	{
	System.out.println("Calling using Airtel sim.....!");	
		
	}

	public void data() 
	{
	System.out.println("Browsing using Airtel sim.....!");
		
	}

}
