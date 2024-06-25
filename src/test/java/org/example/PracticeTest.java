package org.example;

import org.junit.Test;

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
}
