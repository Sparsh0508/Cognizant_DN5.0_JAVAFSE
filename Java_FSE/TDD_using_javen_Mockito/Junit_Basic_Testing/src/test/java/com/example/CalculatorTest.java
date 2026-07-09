package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setup() {
        System.out.println("Setup");
        calculator = new Calculator();
    }

    @After
    public void teardown() {
        System.out.println("Teardown");
    }

    @Test
    public void testAdd() {
        System.out.println("Running testAdd");
        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiply() {
        System.out.println("Running testMultiply");
        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }
}