package com.sumutella.di.springdidemo.services;

import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 11:02 PM
 * @since 10/25/2019, Fri
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - This dependency injected by the setter";
    }
}
