package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.*;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideIntegerForTestingBMI() {
        return Stream.of(
                Arguments.of("Overweight", new Person(1.80,90.0).getBMI()),
                Arguments.of("Normal healthy weight", new Person(1.6, 54).getBMI()),
                Arguments.of("Underweight", new Person(1.7, 48).getBMI()),
                Arguments.of("Very severely underweight", new Person(1.9, 42).getBMI()),
                Arguments.of("Obese class IV", new Person(1.85, 180).getBMI()),
                Arguments.of("Normal healthy weight", new Person(1.72, 68).getBMI())
        );
    }
}
