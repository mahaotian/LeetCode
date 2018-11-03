package edu.neu.leetcode.array;

public class BeautifulArrangementII {
    public static int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int frontKey = 1, endKey = n;
        for (int i = 0; i < k - 1; i++) {
            if (i % 2 == 0) {
                res[i] = frontKey++;
            } else {
                res[i] = endKey--;
            }
        }
        for (int i = k - 1; i < n; i++) {
            if (k % 2 == 0) {
                res[i] = frontKey++;
            } else {
                res[i] = endKey--;
            }
        }
        return res;
    }
}
