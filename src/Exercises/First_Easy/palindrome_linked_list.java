package Exercises.First_Easy;

import java.util.List;

//234 回文链表
public class palindrome_linked_list {
    public boolean isPalindrome(ListNode head) {
        int len = lenOfList(head), index = 0;
        int[] stack = new int[len / 2];
        ListNode cur = head;
        while (index < stack.length) {
            stack[index++] = cur.val;
            cur = cur.next;
        }
        if((len & 1) == 1) {
            cur = cur.next;
        }
        while (cur != null) {
            if(cur.val != stack[index - 1]) {
                return false;
            }
            cur = cur.next;
            index--;
        }
        return true;
    }
    public int lenOfList(ListNode head) {
        ListNode node = head;
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
