package org.example;

import org.example.FibonacciRecursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursionTest {

    @Test
    void printFibonacci() {
        Assertions.assertEquals(55, FibonacciRecursion.fibonacci(10));
    }
}