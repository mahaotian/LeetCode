package edu.neu.leetcode.array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int key = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[key++] = nums[i];
        }
        while (key < nums.length) {
            nums[key++] = 0;
        }
    }
}
