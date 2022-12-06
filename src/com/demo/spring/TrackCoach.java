package com.demo.spring;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "run 3 miles";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach: "+fortuneService.getFortune();
	}

	public TrackCoach() {
	}
	

}
