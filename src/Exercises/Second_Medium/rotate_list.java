package Exercises.Second_Medium;
//61 旋转链表
public class rotate_list {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        int length = 1;
        while (node.next != null) {
            node = node.next;
            length++;
        }
        k = k % length;
        node.next = head;
        ListNode temp = head;
        for(int i = 1; i < length - k; i++) {
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;
    }
}
