package edu.neu.leetcode.array;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (res < count)
                    res = count;
                count = 0;
            }
        }
        if (res < count) {
            return count;
        }
        return res;
    }
}
