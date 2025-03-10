package org.example;

import org.example.MultiplicationTable;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;

public class MultiplicationTableTest {
    @Test
    @DisplayName("n = 3")
    public void test3() {
        int[][] test = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        assertArrayEquals(test, MultiplicationTable.multiplicationTable(3));
    }

    @Test
    @DisplayName("n = 1")
    public void test1() {
        int[][] test1 = {{1}};
        assertArrayEquals(test1, MultiplicationTable.multiplicationTable(1));
    }
}
