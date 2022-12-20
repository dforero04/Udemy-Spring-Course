package springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Sorry, but today you lose!";
    }

}
