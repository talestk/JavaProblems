package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursionTest {

    @Test
    void printFibonacci() {
        assertEquals(55,FibonacciRecursion.fibonacci(10));
    }
}