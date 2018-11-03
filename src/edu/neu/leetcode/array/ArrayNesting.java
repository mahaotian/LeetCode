package edu.neu.leetcode.array;

public class ArrayNesting {
    public static int arrayNesting(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) continue;
            int length = 0, key = i;
            while (nums[key] != -1) {
                int tmp = key;
                key = nums[key];
                nums[tmp] = -1;
                length++;
            }
            if (length > res)
                res = length;
        }
        return res;
    }
}
