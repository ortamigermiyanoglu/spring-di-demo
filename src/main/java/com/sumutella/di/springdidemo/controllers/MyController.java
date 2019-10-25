package com.sumutella.di.springdidemo.controllers;

import com.sumutella.di.springdidemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author sumutella
 * @time 3:04 PM
 * @since 10/25/2019, Fri
 */

@Controller
public class MyController {
    @Autowired
    private GreetingService greetingService;

    public String hello(){
        return greetingService.sayGreeting();
    }

}
