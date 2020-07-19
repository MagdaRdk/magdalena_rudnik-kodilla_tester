package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources.provideIntegerForTestingBMI")
    public void shouldGetBMI(){

    }


}