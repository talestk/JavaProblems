package org.example;

public class Max {
    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0; // Return 0 for an empty array
        }

        int maxSum = 0;
        int currentSum = 0;

        for (int num : arr) {
            // Apply Kadane's algorithm to keep track of the maximum sum subarray
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}