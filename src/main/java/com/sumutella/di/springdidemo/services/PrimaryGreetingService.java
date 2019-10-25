package com.sumutella.di.springdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 11:20 PM
 * @since 10/25/2019, Fri
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    private GreetingService greetingService;




    @Override
    public String sayGreeting() {
        return "This dependency injected in property by @Primary annotation";
    }
}
