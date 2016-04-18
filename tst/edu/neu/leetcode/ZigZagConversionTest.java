package edu.neu.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by haotianm on 4/18/16.
 */
public class ZigZagConversionTest {
    @Test
    public void convertTest(){
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        int rownum = 3;
        String zigzag = zigZagConversion.convert(s,rownum);
        assertEquals(zigzag,"PAHNAPLSIIGYIR");
    }

    @Test
    public void convertTestA(){
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "A";
        int rownum = 1;
        String zigzag = zigZagConversion.convert(s,rownum);
        assertEquals(zigzag,"A");
    }

    @Test
    public void convertTestEmpty(){
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "";
        int rownum = 1;
        String zigzag = zigZagConversion.convert(s,rownum);
        assertEquals(zigzag,"");
    }
}
