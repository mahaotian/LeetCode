package edu.neu.leetcode.hashtable;

import edu.neu.leetcode.hashtable.JewelsAndStones;
import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {
    @Test
    public void numJewelsInStonesTest() {
        Assert.assertEquals(JewelsAndStones.numJewelsInStones("Aa", "aAAbbbb"), 3);
        Assert.assertEquals(JewelsAndStones.numJewelsInStones("z", "ZZZ"), 0);
    }
}
