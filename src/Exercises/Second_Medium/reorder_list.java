package Exercises.Second_Medium;

import java.util.*;

//143 重排链表
public class reorder_list {
    public void reorderList(ListNode head){
        if(head.next == null){
            return;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null){
            list.add(node);
            node = node.next;
        }
        int left = 0, right = list.size() - 1;
        while (left < right){
            list.get(left).next = list.get(right);
            left++;
            if(left == right){
                break;
            }
            list.get(right).next = list.get(left);
            right--;
        }
        list.get(left).next = null;
    }

}
