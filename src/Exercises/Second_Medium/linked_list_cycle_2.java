package Exercises.Second_Medium;

import java.util.HashSet;

//142 环形链表2
public class linked_list_cycle_2 {
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                while (cur != slow) {
                    slow = slow.next;
                    cur = cur.next;
                }
                return cur;
            }
        }
        return null;
    }
}
