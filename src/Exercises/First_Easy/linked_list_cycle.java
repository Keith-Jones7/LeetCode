package Exercises.First_Easy;
import java.util.*;
//141 环形链表
public class linked_list_cycle {
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        while(head.next != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
    public boolean hasCycle2(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast!= null){
            if(fast.next == null){
                return false;
            }
            if(fast.next.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
