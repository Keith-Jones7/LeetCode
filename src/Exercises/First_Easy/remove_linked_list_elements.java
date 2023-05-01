package Exercises.First_Easy;
//203 移除链表元素
public class remove_linked_list_elements {
    public ListNode removeElements(ListNode head, int val){
        if(head == null){
            return null;
        }
        head.next = removeElements(head.next, val);
        if(head.val == val){
            return head.next;
        }
        else {
            return head;
        }
    }
}
