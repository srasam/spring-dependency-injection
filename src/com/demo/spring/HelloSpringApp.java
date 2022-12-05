package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the sprig configuration file
		 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		 Coach theCoach=context.getBean("myCoach", Coach.class);
		 //FortuneService theCoach1=context.getBean("myCoach1", FortuneService.class);
		 //oach basketballCoach=context.getBean("basketballCoach", Coach.class);
		
		 //call methods on the bean
		 System.out.println(theCoach.getDailyWorkout());
		 System.out.println(theCoach.getDailyFortune());

//		 System.out.println(basketballCoach.getDailyWorkout());
//		 System.out.println(basketballCoach.getDailyFortune());
		//close the context
		 context.close();
		

	}

}
