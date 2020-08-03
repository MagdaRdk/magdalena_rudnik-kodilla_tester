package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarFactory {

   @Bean
    public boolean lights() {
        if (LocalTime.now().isAfter(LocalTime.of(6, 00, 00)) && LocalTime.now().isBefore(LocalTime.of(20, 00, 00))){
            return false;
        }
        return true;
    }

    @Bean
    public Car randomCar() {
        Car car;
        Random generator = new Random();
        int seasons = generator.nextInt(3);
        if (seasons == 0) {
            car = new Sedan();
        } else if (seasons == 1) {
            car = new Cabrio();
        } else {
            car = new SUV();
        }
        return car;
    }
}
