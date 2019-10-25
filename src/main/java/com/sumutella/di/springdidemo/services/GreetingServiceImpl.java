package com.sumutella.di.springdidemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 8:19 PM
 * @since 10/25/2019, Fri
 */

@Service
public class GreetingServiceImpl implements GreetingService {
    private static final String HELLO_MSG="Hello Mr. Ups man!";

    @Override
    public String sayGreeting() {
        return HELLO_MSG;
    }
}
