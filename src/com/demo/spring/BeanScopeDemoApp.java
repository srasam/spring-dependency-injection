package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach newCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=( theCoach ==newCoach);
		System.out.println("\npointing to the same object: "+result);
		System.out.println("\nmemory location of theCoach: "+ theCoach);
		System.out.println("\nmemory location of newCoach: "+ newCoach);
	}

}
