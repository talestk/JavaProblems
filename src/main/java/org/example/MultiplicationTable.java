package org.example;

public class MultiplicationTable {
    public static int[][] multiplicationTable(int n) {
        // initializing the size of 2d array
        int[][] result = new int[n][n];

        // loop to start each row
        for (int i = 0; i < result.length; i++) {
            // loop to set value on each row entry
            for (int z = 0; z < result.length; z++) {
                // pos[x][y]
                result[i][z] = (i + 1) * (z + 1);
            }
        }
        return result;
    }
}
