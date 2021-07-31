package com.improvement.code;

/**
 * @description: 反转链表
 * @author: Lengjx
 * @date: 2021/7/31 17:18
 */
public class ReverseList {
    /**
     * 迭代方法
     * 1 -> 2 -> 3 -> 4 -> null
     * null <- 1 <- 2 <- 3 <- 4
     *
     * @param head
     * @return
     */
    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
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
