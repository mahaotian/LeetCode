package edu.neu.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i>0 && nums[i]==nums[i-1])
                continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    left++;
                    continue;
                }
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                    continue;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                    continue;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                }
            }
        }
        return res;
    }
}
