package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
   private UserValidator userValidator = new UserValidator();

   @ParameterizedTest
   @CsvSource(value = {"ala.ma", "ala.kotota"})
    public void shouldValidateUsername(String username) {
       assertTrue(userValidator.validateUsername(username));
   }

   @ParameterizedTest
   @CsvSource(value = {"al", "ala.kotota@"})
   public void shouldNotValidateUsername(String username) {
      assertFalse(userValidator.validateUsername(username));
   }

   @ParameterizedTest
   @CsvSource(value = {"ala.ma", "ala.kotota"})
   public void shouldNotValidateEmail(String email) {
      assertFalse(userValidator.validateEmail(email));
   }

   @ParameterizedTest
   @CsvSource(value = {"ala.ma@kot.pl", "ala.ko_tota@k.pl"})
   public void shouldValidateEmail(String email) {
      assertTrue(userValidator.validateEmail(email));
   }

}