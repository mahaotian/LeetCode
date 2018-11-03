package edu.neu.leetcode.hashtable;

public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) >= 0) {
                res++;
            }
        }
        return res;
    }
}
