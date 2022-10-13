package com.avirup.dependency_injection;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    // Create a no-arg constructor
    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-arg constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practive fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
