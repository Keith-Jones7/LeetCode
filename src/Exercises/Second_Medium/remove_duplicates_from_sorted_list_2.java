package Exercises.Second_Medium;
//82 删除排序链表中的重复元素2
public class remove_duplicates_from_sorted_list_2 {
    public ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        if(head.val == next.val){
            while (next != null && head.val == next.val){
                next = next.next;
            }
            head = deleteDuplicates(next);
        }
        else {
            head.next = deleteDuplicates(next);
        }
        return head;
    }
}
