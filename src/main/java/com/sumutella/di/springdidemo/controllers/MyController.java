package com.sumutella.di.springdidemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author sumutella
 * @time 3:04 PM
 * @since 10/25/2019, Fri
 */

@Controller
public class MyController {

    public String hello(){
        System.out.println("hello man!");
        return "foo";
    }

}
