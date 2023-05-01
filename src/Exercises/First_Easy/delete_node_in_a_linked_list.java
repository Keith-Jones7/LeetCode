package Exercises.First_Easy;
//237 删除链表中的节点
public class delete_node_in_a_linked_list {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int x)
    {
        val = x;
        next = null;
    }
    ListNode(int x, ListNode next){
        val = x;
        this.next = next;
    }
}
