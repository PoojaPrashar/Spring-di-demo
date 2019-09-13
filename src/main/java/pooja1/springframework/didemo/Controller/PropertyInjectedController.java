package pooja1.springframework.didemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pooja1.springframework.didemo.services.GreetingService;
import pooja1.springframework.didemo.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
       return greetingService.sayGreeting();
    }




}





