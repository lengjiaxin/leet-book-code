package com.improvement.code;

/**
 * @description: 反转链表
 * @author: Lengjx
 * @date: 2021/7/31 17:18
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        // 后继节点
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
