package Exercises.Second_Medium;
//622 设计循环队列
public class design_circular_queue {

}
class MyCircularQueue {
    int maxSize;
    int curSize;
    MyListNode head;
    MyListNode tail;
    public MyCircularQueue(int k) {
        maxSize = k;
        curSize = 0;
        head = new MyListNode();
        head.val = -1;
        tail = head;
        head.next = tail;
    }

    public boolean enQueue(int value) {
        if(curSize == maxSize) {
            return false;
        }
        if(curSize == 0) {
            head.val = value;
        }else {
            MyListNode cur = new MyListNode();
            cur.val = value;
            tail.next = cur;
            cur.next = head;
            tail = cur;
        }
        curSize++;
        return true;
    }

    public boolean deQueue() {
        if(curSize == 0) {
            return false;
        }
        if(curSize == 1) {
            head.val = -1;
            head.next = head;
            tail = head;
        }
        tail.next = tail.next.next;
        head = tail.next;
        curSize--;
        return true;
    }

    public int Front() {
        return head.val;
    }

    public int Rear() {
        return tail.val;
    }

    public boolean isEmpty() {
        return curSize == 0;
    }

    public boolean isFull() {
        return curSize == maxSize;
    }
}
class MyListNode {
    int val;
    MyListNode next;
}
