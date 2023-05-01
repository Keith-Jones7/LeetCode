package Exercises.First_Easy;
//160 相交链表
public class intersection_of_two_linked_lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2){
            node1 = node1 == null ? headB : node1.next;
            node2 = node2 == null ? headA : node2.next;
        }
        return node1;
    }
}
