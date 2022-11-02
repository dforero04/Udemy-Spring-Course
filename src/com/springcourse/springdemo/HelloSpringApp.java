package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){

        //load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from config file
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach swimCoach = context.getBean("mySwimmingCoach", SwimmingCoach.class);

        // Call methods on the bean
        System.out.println("Dependency Injection");
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("Setter Injection");
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        // Close the context
        context.close();

    }
}
