package com.springcourse.springdemo;

public class SwimmingCoach implements Coach {

    // Class fields
    private String emailAddress;
    private String team;

    // Class Injections
    private FortuneService fortuneService;

    // create a no-arg constructor
    public SwimmingCoach() {
        System.out.println("Swimming Coach: inside no-arg constructor");
    }

    // Getters and Setters
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Swimming Coach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Swimming Coach: inside setter method - setTeam");
        this.team = team;
    }

    // Our Setter methods (Setter Injection)
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Swimming Coach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1500 meters today";
    }

    @Override
    public String getDailyFortune() {
        return "Swimming Coach says: " + fortuneService.getFortune();
    }
}
