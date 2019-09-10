package pooja1.springframework.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import pooja1.springframework.didemo.Controller.ConstructorInjectedController;
import pooja1.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_THERE , constructorInjectedController.sayHello());

    }
}
