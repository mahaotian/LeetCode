package edu.neu.leetcode;

import java.util.Hashtable;

/**
 * Created by haotianm on 16-4-10.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Hashtable<Integer, Integer> dataSet = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (dataSet.get(new Integer(target - nums[i])) != null) {
                res[0] = dataSet.get(new Integer(target - nums[i])).intValue();
                res[1] = i;
                return res;
            } else {
                dataSet.put(new Integer(nums[i]), new Integer(i));
            }
        }
        return res;
    }

}