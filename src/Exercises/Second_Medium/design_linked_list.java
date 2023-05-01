package Exercises.Second_Medium;
//707 设计链表
public class design_linked_list {
    ListNode head;
    public design_linked_list(){

    }
    public int get(int index){
        if(index < 0){
            return -1;
        }
        ListNode node = head;
        int count = 0;
        while (count < index){
            if(node == null || node.next == null){
                return -1;
            }
            else {
                node = node.next;
            }
            count++;
        }
        if(node == null){
            return -1;
        }
        return node.val;
    }
    public void addAtHead(int val){
        if(head == null){
            this.head = new ListNode(val);
        }
        else {
            this.head = new ListNode(val, head);
            System.out.println(head.val);
            System.out.println(head.next.val);
        }
    }
    public void addAtTail(int val){
        if (head == null){
            addAtHead(val);
            return;
        }
        ListNode tail = new ListNode(val);
        ListNode node = head;
        while (node.next != null){
            node = node.next;
        }

        node.next = tail;
        System.out.println(head.val);
        System.out.println(head.next.val);
    }
    public void addAtIndex(int index, int val){
        if(index <= 0){
            addAtHead(val);
            return;
        }
        ListNode node = head;
        int count = 1;
        while (count < index){
            if(node == null || node.next == null){
                return;
            }
            else {
                node = node.next;
            }
            count++;
        }
        if(node == null){
            return;
        }
        node.next = new ListNode(val, node.next);
    }
    public void deleteAtIndex(int index){
        if(index == 0){
            head = head.next;
            return;
        }
        ListNode node = head;
        int count = 1;
        while (count < index){
            if(node == null || node.next == null){
                return;
            }
            else {
                System.out.println(node.val);
                node = node.next;
            }
            count++;
        }
        if(node.next == null){
            return;
        }
        node.next = node.next.next;

    }
}
