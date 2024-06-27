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

    public static int binarySearch(int[] arr, int beginning, int end, int key) {
        /*
            Ideally we would use either Arrays.binarySearch(arr, key) (needs sorting first Arrays.sort(arr))
            or Collections.binarySearch(arr, key), both are O(log n) time complexity and O(1) for space complexity.

            If not allowed then we can use the recursive solution below
            call example:
                binarySearch(arr, 0, arr.length -1, 7)
         */

        if (end >= beginning) {
            int mid = beginning + (end - beginning) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == key)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > key)
                return binarySearch(arr, beginning, mid - 1, key);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, end, key);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
