package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.add(10, 5);
        Assertions.assertEquals(15, value, 0.01);
    }

    @Test
    public void shouldReturnCorrectSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.subtract(10, 5);
        Assertions.assertEquals(5, value, 0.01);
    }

    @Test
    public void shouldReturnCorrectMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.multiply(10, 5);
        Assertions.assertEquals(50, value, 0.01);
    }

    @Test
    public void shouldReturnCorrectDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double value = bean.divide(10, 5);
        Assertions.assertEquals(2, value, 0.01);
    }
}


