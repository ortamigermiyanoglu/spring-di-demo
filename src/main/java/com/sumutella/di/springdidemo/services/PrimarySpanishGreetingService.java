package com.sumutella.di.springdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 12:10 PM
 * @since 10/26/2019, Sat
 */
@Service
@Primary
@Profile("es")

public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola - Esta dependencia inyectada por el constructor con perfil español";
    }
}
