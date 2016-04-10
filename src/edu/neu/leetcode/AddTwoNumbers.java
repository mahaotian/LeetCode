package edu.neu.leetcode;

/**
 * Created by haotianm on 16-4-10.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int nextnum = 0;
        ListNode res = new ListNode(0);
        ListNode it = res;
        while (l1 != null && l2 != null) {
            int itVal = (l1.val + l2.val + nextnum) % 10;
            it.next = new ListNode(itVal);
            nextnum = (l1.val + l2.val + nextnum) / 10;
            l1 = l1.next;
            l2 = l2.next;
            it = it.next;
        }

        if (l1 != null) {
            calRest(it, l1, nextnum);
        } else if (l2 != null) {
            calRest(it, l2, nextnum);
        } else if (nextnum != 0) {
            it.next = new ListNode(nextnum);
            it = it.next;
            it.next = null;
        }
        return res.next;
    }

    private void calRest(ListNode res, ListNode ln, int nextnum) {
        while (ln != null) {
            int itVal = (ln.val + nextnum) % 10;
            nextnum = (ln.val + nextnum) / 10;
            res.next = new ListNode(itVal);
            res = res.next;
            ln = ln.next;
        }
        if (nextnum != 0) {
            res.next = new ListNode(nextnum);
            res = res.next;
            res.next = null;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
