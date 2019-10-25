package com.sumutella.di.springdidemo.controllers;

import com.sumutella.di.springdidemo.services.GreetingServiceImpl;

/**
 * @author sumutella
 * @time 8:18 PM
 * @since 10/25/2019, Fri
 */
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return  greetingService.sayGreeting();
    }

}
