package org.example;

public class RemoveDuplicatesSortedArr {

    public static int[] removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums; // No need to process arrays with <= 2 elements
        }

        // Pointer for placing the next valid element
        int index = 2;

        // Traverse the array starting from the third element
        for (int i = 2; i < nums.length; i++) {
            // If the current element is not equal to the element at index - 2,
            // it means it can be included (appears at most twice).
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return nums;
    }

}
