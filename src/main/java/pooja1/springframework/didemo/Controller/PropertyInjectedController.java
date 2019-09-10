package pooja1.springframework.didemo.Controller;

import pooja1.springframework.didemo.services.GreetingService;
import pooja1.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
       return greetingService.sayGreeting();
    }




}





