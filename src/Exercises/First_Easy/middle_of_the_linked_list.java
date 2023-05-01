package Exercises.First_Easy;
//876 链表的中间节点
public class middle_of_the_linked_list {
    public ListNode middleNode(ListNode head){
        ListNode node1 = head;
        ListNode node2 = head;
        while (node1 != null && node1.next != null){
            node1 = node1.next.next;
            node2 = node2.next;
        }
        return node2;
    }
}
