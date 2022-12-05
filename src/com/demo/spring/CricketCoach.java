package com.demo.spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	//add new fields
	private String email;
	private String team;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter setEmail method");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter setTeam method");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg construtor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice bowling for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

}
