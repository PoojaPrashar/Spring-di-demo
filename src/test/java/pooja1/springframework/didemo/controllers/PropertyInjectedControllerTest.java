package pooja1.springframework.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import pooja1.springframework.didemo.Controller.PropertyInjectedController;
import pooja1.springframework.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_THERE, propertyInjectedController.sayHello());
    }
}
