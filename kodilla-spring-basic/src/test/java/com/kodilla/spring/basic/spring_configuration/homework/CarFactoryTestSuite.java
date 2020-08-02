package com.kodilla.spring.basic.spring_configuration.homework;


import com.kodilla.spring.basic.spring_configuration.Animal;
import com.kodilla.spring.basic.spring_configuration.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldLightsTurnedOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When

        //Then

    }

    @Test
    public void shouldCreateRandomCar() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleTypes = Arrays.asList("Cabrio", "Sedan", "SUV");
        Assertions.assertTrue(possibleTypes.contains(type));
    }
}
