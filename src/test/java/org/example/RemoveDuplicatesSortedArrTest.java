package org.example;

import org.junit.Test;

public class RemoveDuplicatesSortedArrTest {

    @Test
    public void testCaseOne() {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int[] result = RemoveDuplicatesSortedArr.removeDuplicates(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
