package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String username = "Sparsh";
        int age = 21;

        logger.info("User {} logged in successfully.", username);

        logger.info("User {} is {} years old.", username, age);

        double salary = 55000.75;

        logger.info("Salary of {} is {}", username, salary);

    }
}