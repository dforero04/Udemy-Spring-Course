package com.springcourse.springdemo;

public class SwimmingCoach implements Coach {

    private FortuneService fortuneService;

    // create a no-arg constructor
    public SwimmingCoach() {
        System.out.println("Swimming Coach: inside no-arg constructor");
    }

    // Our Setter method (Setter Injection)
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
