package edu.neu.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class ComplexNumberMultiplicationTest {
    private static final ComplexNumberMultiplication COMPLEX_NUMBER_MULTIPLICATION = new ComplexNumberMultiplication();

    @Test
    public void complexNumberMultiplyTest() {
        Assert.assertEquals(COMPLEX_NUMBER_MULTIPLICATION.complexNumberMultiply("1+1i", "1+1i"), "0+2i");
        Assert.assertEquals(COMPLEX_NUMBER_MULTIPLICATION.complexNumberMultiply("1+-1i", "1+-1i"), "0+-2i");
    }
}
