package Exercises.Third_Hard;
//23 合并K个升序链表
public class merge_k_sorted_lists {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len == 0) {
            return null;
        }
        if(len == 1) {
            return lists[0];
        }
        if(len == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }
        int mid = len / 2;
        ListNode[] midLists1 = new ListNode[mid];
        System.arraycopy(lists, 0, midLists1, 0, mid);
        ListNode[] midLists2 = new ListNode[len - mid];
        System.arraycopy(lists, mid, midLists2, 0, len - mid);
        return mergeTwoLists(mergeKLists(midLists1), mergeKLists(midLists2));
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        int val1 = list1.val;
        int val2 = list2.val;
        ListNode head;
        if(val1 > val2) {
            head = list2;
            head.next = mergeTwoLists(list1, list2.next);
        } else {
            head = list1;
            head.next = mergeTwoLists(list1.next, list2);
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
}
