package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{

	public static void main(String[] args) 
	{
		
  ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");
System.out.println("config loaded!!!!");
Airtel a=(Airtel) c.getBean("air");
a.calling();
a.data();
Jio j=(Jio) c.getBean("jio");
j.calling();
j.data();
BSNL b=(BSNL) c.getBean("bsnl");
b.calling();
b.data();
	}  

}
