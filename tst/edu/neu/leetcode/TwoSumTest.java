package edu.neu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by haotianm on 16-4-10.
 */
public class TwoSumTest {
    @Test
    public void twoSumTest() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum.twoSum(nums, target);
        assertEquals(res[0], 0);
        assertEquals(res[1], 1);
    }
}
