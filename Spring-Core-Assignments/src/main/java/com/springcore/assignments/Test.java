package com.springcore.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("mybeans.xml");
		//Coustomer CoustomerID c.getBean("12",Coustomer.class); 

	}

}
