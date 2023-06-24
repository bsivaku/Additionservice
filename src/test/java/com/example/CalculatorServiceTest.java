package com.example;

import org.example.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAddition() {
        int num1 = 5;
        int num2 = 3;
        int expectedSum = 8;

        int result = calculatorService.add(num1, num2);

        Assertions.assertEquals(expectedSum, result, "Incorrect addition result");
    }

    @Test
    public void testAdditionFailure() {
        int num1 = 5;
        int num2 = 3;
        int expectedSum = 2;

        int result = calculatorService.add(num1, num2);

        Assertions.assertNotEquals(expectedSum, result, "Incorrect addition result");;
    }
}
