package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){

        //load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from config file
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Close the context
        context.close();

    }
}
