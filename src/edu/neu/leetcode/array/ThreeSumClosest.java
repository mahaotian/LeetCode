package edu.neu.leetcode.array;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[nums.length - 1], res = Math.abs(sum - target);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (Math.abs(nums[i] + nums[left] + nums[right] - target) < res) {
                    res = Math.abs(nums[i] + nums[left] + nums[right] - target);
                    sum = nums[i] + nums[left] + nums[right];
                }
                if (nums[i] + nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}
