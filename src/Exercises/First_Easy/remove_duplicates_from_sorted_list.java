package Exercises.First_Easy;
//83 删除排序链表中的重复元素
public class remove_duplicates_from_sorted_list {
    public ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        while(node != null && node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}
