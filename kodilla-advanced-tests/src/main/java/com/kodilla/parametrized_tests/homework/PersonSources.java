package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> provideIntegerForTestingBMI() {
        return Stream.of(
                Arguments.of(1.6, 50),
                Arguments.of(1.8, 78),
                Arguments.of(1.68, 70),
                Arguments.of(1.7, 54),
                Arguments.of(1.9, 104),
                Arguments.of(1.62, 45)
        );
    }
}
