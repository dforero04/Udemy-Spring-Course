package com.springcourse.springdemo;

public class BaseballCoach implements Coach{

    // define a private field for the dependency
    private final RandomFortuneService randomFortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(RandomFortuneService theRandomFortuneService) {
        randomFortuneService = theRandomFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune(){
        // use my fortuneService to get a fortune
        return "Baseball coach says: "+randomFortuneService.getFortune();
    }
}
