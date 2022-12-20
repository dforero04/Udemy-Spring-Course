package springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// You can use a specific bean id
//@Component("TennisCoach")
// OR, you can use the default bean id, which just makes the first character lower case
@Component
public class TennisCoach implements Coach {

//    This is autowired field injection
//    This is possible due to Java Reflections
    @Autowired
//    This annotation is used to specify which interface implementation to use
//    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;

//    define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

//    This is autowired constructor injection
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }

//    This is autowired setter injection
//    With the Autowired annotation, you can name the method anything you want
//    @Autowired
//    public void setupFortuneService(FortuneService theFortuneService){
//        System.out.println(">> TennisCoach: inside setupFortuneService() method");
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your serves every day!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
