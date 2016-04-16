package edu.neu.leetcode;

import edu.neu.leetcode.AddTwoNumbers.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by haotianm on 16-4-10.
 */
public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbersTest() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l1.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;
        l13.next = null;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l2.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;
        l23.next = null;
        ListNode res = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(res.val, 7);
        assertEquals(res.next.val, 0);
        assertEquals(res.next.next.val, 8);
        assertEquals(res.next.next.next, null);
    }

    @Test
    public void addTwoNumbersWithOneTest() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(8);
        l1.next = l12;
        l12.next = null;
        ListNode l2 = new ListNode(0);
        l2.next = null;
        ListNode res = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(res.val, 1);
        assertEquals(res.next.val, 8);
        assertEquals(res.next.next, null);
    }

    @Test
    public void addTwoNumbersWithAnotherOneTest() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(1);
        l1.next = null;
        ListNode l2 = new ListNode(9);
        ListNode l22 = new ListNode(9);
        l2.next = l22;
        l22.next = null;
        ListNode res = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(res.val, 0);
        assertEquals(res.next.val, 0);
        assertEquals(res.next.next.val, 1);
        assertEquals(res.next.next.next, null);
    }

    @Test
    public void addTwoNumbersWith201Test() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(3);
        ListNode l12 = new ListNode(7);
        l1.next = l12;
        l12.next = null;
        ListNode l2 = new ListNode(9);
        ListNode l22 = new ListNode(2);
        l2.next = l22;
        l22.next = null;
        ListNode res = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(res.val, 2);
        assertEquals(res.next.val, 0);
        assertEquals(res.next.next.val, 1);
        assertEquals(res.next.next.next, null);
    }
}
