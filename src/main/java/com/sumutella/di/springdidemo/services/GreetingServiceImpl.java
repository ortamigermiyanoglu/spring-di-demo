package com.sumutella.di.springdidemo.services;

/**
 * @author sumutella
 * @time 8:19 PM
 * @since 10/25/2019, Fri
 */
public class GreetingServiceImpl implements GreetingService {
    private static final String HELLO_MSG="Hello Mr. Ups man!";

    @Override
    public String sayGreeting() {
        return HELLO_MSG;
    }
}
