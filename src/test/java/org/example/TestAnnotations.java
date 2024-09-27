package org.example;

import org.junit.jupiter.api.*;

public class TestAnnotations {

    static int number = 14;

    TestAnnotations() {
        number *= 2;
    }

    @BeforeAll
    static void method3() {
        number += 11;
    }

    @BeforeEach
    void method2() {
        number -= 4;
    }

    @AfterAll
    static void method4() {
        number /= 3;
    }

    @AfterEach
    void method5() {
        System.out.println(number);
    }

    @Test
    void method6() {
        number += 9;
    }

}
