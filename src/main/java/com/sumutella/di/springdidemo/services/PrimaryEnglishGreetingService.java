package com.sumutella.di.springdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 11:20 PM
 * @since 10/25/2019, Fri
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryEnglishGreetingService implements GreetingService {
    private GreetingService greetingService;

    @Override
    public String sayGreeting() {
        return "Hello - This dependency injected in constructor by @Primary annotation";
    }
}
