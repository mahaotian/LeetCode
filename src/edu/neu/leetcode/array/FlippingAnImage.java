package edu.neu.leetcode.array;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        reverseRow(A);
        invertImage(A);
        return A;
    }

    private void reverseRow(int[][] A) {
        for (int[] row : A) {
            for (int i = 0; i < row.length / 2; i++) {
                int tmp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = tmp;
            }
        }
    }

    private void invertImage(int[][] A) {
        for (int i =0; i<A.length; i++ ){
            for (int j =0 ; j<A[i].length; j++) {
                A[i][j]= 1-A[i][j];
            }
        }
    }
}
