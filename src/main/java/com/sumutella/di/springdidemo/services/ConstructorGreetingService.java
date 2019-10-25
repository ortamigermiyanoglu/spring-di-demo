package com.sumutella.di.springdidemo.services;

import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 11:03 PM
 * @since 10/25/2019, Fri
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - This dependency injected by the constructor";
    }
}
