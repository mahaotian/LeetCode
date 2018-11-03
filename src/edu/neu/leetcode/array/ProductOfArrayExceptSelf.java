package edu.neu.leetcode.array;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] productLeft = new int[nums.length];
        int[] productRight = new int[nums.length];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                productLeft[i] = 1;
                productRight[nums.length - 1] = 1;
            } else {
                productLeft[i] = productLeft[i - 1] * nums[i - 1];
                productRight[nums.length - 1 - i] = productRight[nums.length - i] * nums[nums.length - i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = productLeft[i] * productRight[i];
        }
        return res;
    }
}
