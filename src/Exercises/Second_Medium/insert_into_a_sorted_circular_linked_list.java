package Exercises.Second_Medium;
//708 循环有序列表的插入
public class insert_into_a_sorted_circular_linked_list {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    public Node insert(Node head, int insertVal) {
        if(head == null) {
            Node node = new Node(insertVal);
            node.next = node;
            return node;
        }
        if(head.next == head) {
            Node node = new Node(insertVal);
            node.next = head;
            head.next = node;
            return head;
        }
        traverse(head);
        System.out.println(min + "   " + max);
        if(insertVal == min || insertVal == max) {
            return insert_head(head, insertVal);
        }
        return insert_mid(head, insertVal);

    }
    public void traverse(Node head) {
        Node cur = head.next;
        min = head.val;
        max = head.val;
        while (cur != head) {
            min = Math.min(min, cur.val);
            max = Math.max(max, cur.val);
            cur = cur.next;
        }
    }
    public Node insert_head(Node head, int insertVal) {
        if(head.val == max && head.next.val == min) {
            Node node = new Node(insertVal);
            node.next = head.next;
            head.next = node;
        }else {
            head.next = insert_mid(head.next, insertVal);
        }
        return head;
    }
    public Node insert_mid(Node head, int insertVal) {
        if(head.val <= insertVal && head.next.val >= insertVal) {
            Node node = new Node(insertVal);
            node.next = head.next;
            head.next = node;
        }else {
            head.next = insert_mid(head.next, insertVal);
        }
        return head;
    }
}
