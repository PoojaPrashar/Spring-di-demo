package pooja1.springframework.didemo.Controller;

import pooja1.springframework.didemo.services.GreetingService;
import pooja1.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


}
