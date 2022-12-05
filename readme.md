


About the project:

Instructions:
1. How to checkout the code from git?
2. How to Run the code locally?
3. How to deploy to Tomcat locally and on remote server?
4. How to run standalone in a Linux server?
5. How to generate a runnable executable?





dependency = helper

Injection types- common

constructor injection 

setter injection

Development process:

define the dependency interface and class
FortuneService.java- interface
HappyFortune.java- implementation of the fortune service interface

create a constructor in your class for injections
public class TrackCoach implements Coach {
private FortuneService fortuneService;
public TrackCoach(FortuneService fortuneService) { - (constructor injection)
this.fortuneService = fortuneService;
}

configure the dependency injection in spring config file
<bean id="happyFortune" class="com.demo.spring.HappyFortune">
</bean>---- (define dependency)
<bean id="basketballCoach" class="com.demo.spring.BasketballCoach">
<constructor-arg ref="happyFortune" /> ---inject dependency using constructor injection
</bean>

BTS: HappyFortune MyFortune= new HappyFortune ();
BasketballCoach myCoach= new BasketballCoach(MyFortune);

setter injection:

public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}

<bean id="cricketCoach" class="com.demo.spring.CricketCoach">
		<property name="fortuneService" ref="myFortune" />

BTS: CricketCoach myCricketCoach= new CricketCoach();

CricketCoach.setFortuneService(myFortune);


Download libraries into Lib folder:
1. Go to this URL: https://repo.spring.io/ui/packages
2. Use the path below to coose the latest version of spring version to download the libraries
	Path: Artifactory->choose artifacts->libs-release->org->springframework->spring->choose latest version->download spring dist.zip
3. unzip file->libs->copy all jar files->paste in lib folder of the project
4. Add these jar file to java build path (Classpath)

TODO:
- Execute the same project using Maven instead of downloading the lirbaries manually
