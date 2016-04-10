package edu.neu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by haotianm on 16-4-10.
 */
public class SolutionTest {
    @Test
    public void twoSumTest() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = solution.twoSum(nums, target);
        assertEquals(res[0], 0);
        assertEquals(res[1], 1);
    }
}
