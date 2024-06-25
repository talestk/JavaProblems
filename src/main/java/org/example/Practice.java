package org.example;

import java.util.Arrays;

public class Practice {


    public static String reverseString(String str) {
        // simple and elegant solution
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static int largestElementInArray(int[] elements) {
        // simple Java 8 solution
        return Arrays.stream(elements).max().getAsInt();
    }

    public static int largestElementInArrayOldJava(int[] arr) {
        // set max as first element of the array
        int max = arr[0];
        // start from second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean isPrimeNumber(int num) {

        // check for 1 and negative numbers
        if (num <= 1) {
            return false;
        }

        // this is not the fastest but the simplest
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
