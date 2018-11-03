package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest {
    private static final int[] TEST_INPUT_1 = {7, 1, 5, 3, 6, 4};
    private static final int[] TEST_INPUT_2 = {1, 2, 3, 4, 5};
    private static final int[] TEST_INPUT_3 = {7, 6, 4, 3, 1};

    @Test
    public void maxProfitTest() {
        Assert.assertEquals(BestTimeToBuyAndSellStockII.maxProfit(TEST_INPUT_1), 7);
        Assert.assertEquals(BestTimeToBuyAndSellStockII.maxProfit(TEST_INPUT_2), 4);
        Assert.assertEquals(BestTimeToBuyAndSellStockII.maxProfit(TEST_INPUT_3), 0);
    }
}
