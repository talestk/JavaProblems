package org.example;

import java.util.Arrays;

public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int[] array = Arrays.stream(nums)
                .filter(num -> num != val)
                .toArray();
        // Copy the filtered elements back to the original array
        System.arraycopy(array, 0, nums, 0, array.length);

        return array.length;
    }

    //  0 ms solution from LeetCode
    public int removeElementBest(int[] nums, int val) {
        int k = 0;  // Pointer for elements not equal to val

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;  // Number of elements not equal to val
    }
}
