package pooja1.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_THERE = "HeLLO wORLD!";


    public String sayGreeting() {
        return HELLO_THERE;
    }


}
