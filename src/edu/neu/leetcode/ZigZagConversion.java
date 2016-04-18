package edu.neu.leetcode;

/**
 * Created by haotianm on 4/18/16.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        String[] res = new String[numRows];
        for (int i = 0; i < numRows; i++)
            res[i] = "";
        int key = 0;
        while (key < s.length()) {
            for (int j = 0; j < numRows; j++) {
                if (key >= s.length()) break;
                res[j] += s.charAt(key++);
            }
            for (int j = 0; j < numRows - 2; j++) {
                if (key >= s.length()) break;
                res[numRows - j - 2] += s.charAt(key++);
            }
        }
        String zigzag = "";
        for (int i = 0; i < numRows; i++) {
            zigzag += res[i];
        }
        return zigzag;
    }

}
