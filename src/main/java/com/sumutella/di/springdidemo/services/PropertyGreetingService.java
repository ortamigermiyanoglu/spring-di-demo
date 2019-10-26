package com.sumutella.di.springdidemo.services;

import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 12:51 PM
 * @since 10/26/2019, Sat
 */
@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - This dependency injected by the property";
    }
}
