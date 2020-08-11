package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public interface Car {

    @Bean
    default boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(6, 0));
    }

    String getCarType();
}

