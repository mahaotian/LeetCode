package edu.neu.leetcode.array;

import java.util.Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0)
                continue;
            if (nums[i] < res)
                continue;
            else if (nums[i] == res)
                res++;
            else
                return res;
        }
        return res;
    }
}
