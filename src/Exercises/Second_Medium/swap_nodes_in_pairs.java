package Exercises.Second_Medium;
//24 两两交换链表中的节点
public class swap_nodes_in_pairs {
    public ListNode swapPairs(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;
        return node;
    }
}
