package com.springcourse.springdemo;

public class SoccerCoach implements Coach{
    private final FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Juggle the ball 500 times";
    }

    @Override
    public String getDailyFortune() {
        return "Soccer coach says: "+fortuneService.getFortune();
    }
}
