package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarFactory {


    @Bean
    public Car lights() {
        // if (LocalTime.of(20,00,00)  LocalTime.of(6,00,00)) utknęłam tu. Nie wiem jak zapisać warunek o załączonych światłach od 20 do 6. Proszę o wskazówki.
    return null;
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
