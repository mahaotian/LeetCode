package edu.neu.leetcode.array;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> numMap = new HashMap<>();
        for (int num : nums) {
            if (!numMap.containsKey(num))
                numMap.put(num, true);
            else
                return true;
        }
        return false;
    }
}
