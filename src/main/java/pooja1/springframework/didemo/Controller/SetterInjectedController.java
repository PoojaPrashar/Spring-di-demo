package pooja1.springframework.didemo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pooja1.springframework.didemo.services.GreetingService;
import pooja1.springframework.didemo.services.GreetingServiceImpl;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;



    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }


}
