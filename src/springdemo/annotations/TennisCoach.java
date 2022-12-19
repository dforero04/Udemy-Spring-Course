package springdemo.annotations;

import org.springframework.stereotype.Component;

// You can use a specific bean id
//@Component("TennisCoach")
// OR, you can use the default bean id, which just makes the first character lower case
@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice serves ever day!";
    }
}
