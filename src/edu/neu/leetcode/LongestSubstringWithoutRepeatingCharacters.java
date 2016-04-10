package edu.neu.leetcode;

import java.util.Hashtable;

/**
 * Created by haotianm on 16-4-10.
 *
 * My solution is use Hashtable to record the beginning and end of the string. When clear the Hashtable, I will move back the index. Which will cause some extra time for the algorithm.
 * There is a better way to use array to record the beginning and end of the substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int count = 0;
        Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            if (hashtable.get(new Character(schar)) == null) {
                count++;
                hashtable.put(new Character(schar), new Integer(i));
            } else {
                i = hashtable.get(new Character(schar)).intValue();
                hashtable.clear();
                if (res < count) res = count;
                count = 0;
            }
        }
        if (res < count) res = count;
        return res;
    }
}
