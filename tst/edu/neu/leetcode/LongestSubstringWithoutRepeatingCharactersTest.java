package edu.neu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by haotianm on 16-4-10.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstringTest() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String s1 = "abcabcbb";
        int res1 = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s1);
        assertEquals(res1, 3);
        String s2 = "pwwkew";
        int res2 = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s2);
        assertEquals(res2, 3);
        String s3 = "dvdf";
        int res3 = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s3);
        assertEquals(res3, 3);
    }
}
