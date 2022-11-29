package com.springcourse.springdemo;

public class RandomFortuneService implements FortuneService{

    // Create array for random fortune
    private final String[] fortuneArray = {
            "This is fortune #1",
            "This is fortune #2",
            "This is fortune #3",
            "This is fortune #4",
            "This is fortune #5"
    };

    @Override
    public String getFortune() {
        return this.fortuneArray[(int) (Math.random() * this.fortuneArray.length)];
    }

}
