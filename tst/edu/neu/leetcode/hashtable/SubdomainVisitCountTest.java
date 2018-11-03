package edu.neu.leetcode.hashtable;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubdomainVisitCountTest {
    private static final String[] TEST_INPUT_1 = {"9001 discuss.leetcode.com"};
    private static final String[] TEST_INPUT_2 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

    private static final List<String> TEST_OUTPUT_1 = Arrays.asList("9001 discuss.leetcode.com",
            "9001 leetcode.com", "9001 com");
    private static final List<String> TEST_OUTPUT_2 = Arrays.asList("901 mail.com",
            "50 yahoo.com",
            "900 google.mail.com",
            "5 wiki.org","5 org",
            "1 intel.mail.com",
            "951 com");

    @Test
    public void subdomainVisitsTest() {
//        List<String> res1 = SubdomainVisitCount.subdomainVisits(TEST_INPUT_1);
//        Collections.sort(res1);
//        Collections.sort(TEST_OUTPUT_1);
//        Assert.assertEquals(res1, TEST_OUTPUT_1);
        List<String> res2 = SubdomainVisitCount.subdomainVisits(TEST_INPUT_2);
        Collections.sort(res2);
        Collections.sort(TEST_OUTPUT_2);
        Assert.assertEquals(res2, TEST_OUTPUT_2);
    }
}
