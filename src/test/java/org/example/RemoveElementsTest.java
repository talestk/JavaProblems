package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementsTest {
    @Test
    public void caseOne() {
        int[] nums = {3, 2, 2, 3};
        int result = new RemoveElements().removeElement(nums, 3);
        assertEquals(result, 2);

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = new RemoveElements().removeElement(nums2, 2);
        assertEquals(k2, 5);
    }
}
