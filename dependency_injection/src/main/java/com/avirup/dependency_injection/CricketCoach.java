package com.avirup.dependency_injection;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: inside setter method - setTeam");
        this.team = team;
    }

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
