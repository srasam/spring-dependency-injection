package com.demo.spring;

public class BasketballCoach implements Coach {
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "50 hoops in 10 minutes";
	}
	
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
