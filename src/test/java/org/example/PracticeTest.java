package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PracticeTest {

    @Test
    public void testReverseString() {
        assertEquals("dlroW olleH", Practice.reverseString("Hello World"));
        assertNotEquals("olleH", Practice.reverseString("Hello World"));
        assertNotEquals("abcd", Practice.reverseString("abcd"));
    }

    @Test
    public void testLargestElementInArray() {
        int arr[] = {1, 4, 7, 3, 2};

        // Java 8 stream
        assertEquals(7, Practice.largestElementInArray(arr));
        assertNotEquals(3, Practice.largestElementInArray(arr));

        // Old Java
        assertEquals(7, Practice.largestElementInArrayOldJava(arr));
    }

    @Test
    public void testCheckPrimeNumber() {
        assertTrue(Practice.isPrimeNumber(7));
        assertTrue(Practice.isPrimeNumber(11));
        assertTrue(Practice.isPrimeNumber(13));
        assertFalse(Practice.isPrimeNumber(10));
        assertFalse(Practice.isPrimeNumber(27));
    }

    @Test
    @DisplayName("Testing debugger with binary option")
    public void testDebuggingBinary() {
        int number1 = 38;
        int number2 = 54;

        number1 = number1 << 2;
        number2 = number2 >> 1;
        int result = number2 ^ number1;
        System.out.println(result);

        int prev = 0;
        int current = 1;
        for (int i = 0; i <= 25; i++) {
            int swap = prev;
            prev = current;
            current += swap;
            System.out.println(current);
        }

        int a = 16;
        a = (int) Math.pow(a, 2);
        int anotherResult = a + 10;
    }
}
