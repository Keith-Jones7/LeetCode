package Exercises.Second_Medium;

import java.util.HashMap;

//138 复制带随机指针的链表
public class copy_list_with_random_pointer {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            Node temp = new Node(cur.val);
            map.put(cur, temp);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            Node temp = map.get(cur);
            temp.next = map.getOrDefault(cur.next, null);
            temp.random = map.getOrDefault(cur.random, null);
            cur = cur.next;
        }
        return map.get(head);
    }
    class Node {
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
