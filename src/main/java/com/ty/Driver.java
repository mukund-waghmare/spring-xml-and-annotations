package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Driver {
	
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext contex=new ClassPathXmlApplicationContext("conf.xml");
		
		Person per=(Person)contex.getBean("per");
		
		per.run();
		
		
		System.out.println("------------------------------------------------------------------");
		
		RCB r=(RCB)contex.getBean("RCB"); // RC- both capital so spring will not convert them into lower case
		
		r.win();
		
		
		
	}
	
	
}
