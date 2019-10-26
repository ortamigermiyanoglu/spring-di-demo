package com.sumutella.di.springdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 12:31 PM
 * @since 10/26/2019, Sat
 */
@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo - Diese Abhängigkeit wird vom Konstruktor mit deutschem Profil injiziert";
    }
}
