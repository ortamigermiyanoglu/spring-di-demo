package com.sumutella.di.springdidemo.controllers;

import com.sumutella.di.springdidemo.services.GreetingService;
import com.sumutella.di.springdidemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author sumutella
 * @time 8:18 PM
 * @since 10/25/2019, Fri
 */
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    @Autowired // is optional in contructor based dependency injection
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
