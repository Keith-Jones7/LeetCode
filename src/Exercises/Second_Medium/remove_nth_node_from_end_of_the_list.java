package Exercises.Second_Medium;
//19 删除链表的倒数第n个节点
public class remove_nth_node_from_end_of_the_list {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode node1 = head;
        ListNode node2 = head;
        for(int i = 0; i < n; i++){
            node1 = node1.next;
        }
        if(node1 == null){
            assert head != null;
            return head.next;
        }
        while (node1.next != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        node2.next = node2.next.next;
        return head;
    }
}
