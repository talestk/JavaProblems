package org.example;

public class MultiplicationTable {
    public static int[][] multiplicationTable(int n) {
        // initializing the size of 2d array
        int[][] result = new int[n][n];

        // loop to start each row
        for (int x = 0; x < result.length; x++) {
            // loop to set value on each row entry
            for (int y = 0; y < result.length; y++) {
                // pos[x][y]
                result[x][y] = (x + 1) * (y + 1);
            }
        }
        return result;
    }
}
