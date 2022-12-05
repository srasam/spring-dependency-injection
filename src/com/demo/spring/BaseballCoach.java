package com.demo.spring;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "warm up-6 mins ; main workout-45 mins ; cooldown: 10 mins ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
}
