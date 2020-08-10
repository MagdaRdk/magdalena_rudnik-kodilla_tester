package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldLightsTurnedOn() {
        //Given podpowiesz jak stworzyć ten test? Gdy metoda jest podana w interfejsie Car.Jak ją sprawdzić?

        //When
        boolean lights = suv.hasHeadlightsTurnedOn();
        //Then
        Assertions.assertEquals(true, lights);
    }

    @Test
    public void shouldCreateRandomCar() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean("randomCar", Car.class);
        //When
        String type = car.getCarType();
        System.out.println(type);
        //Then
        List<String> possibleTypes = Arrays.asList("Cabrio", "Sedan", "SUV");
        Assertions.assertTrue(possibleTypes.contains(type));
    }
}
