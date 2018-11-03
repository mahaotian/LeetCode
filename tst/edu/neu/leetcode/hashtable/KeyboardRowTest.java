package edu.neu.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class KeyboardRowTest {
    private static final String[] STRING_INPUT = {"Hello", "Alaska", "Dad", "Peace"};
    private static final String[] STRING_OUTPUT = {"Alaska", "Dad"};

    @Test
    public void findWordsTest() {
        Assert.assertArrayEquals(KeyboardRow.findWords(STRING_INPUT), STRING_OUTPUT);
    }
}
