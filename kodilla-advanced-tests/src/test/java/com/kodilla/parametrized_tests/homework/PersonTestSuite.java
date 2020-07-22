package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#provideIntegerForTestingBMI")
    public void shouldGetBMI(String expected, String BMI){// help! nie mam pojęcia jak w ogóle się za to zabrać. W osobnej klasie mam zestaw danych (wzorst i kilogramy) i co dalej?
        //assertion here
    }


}