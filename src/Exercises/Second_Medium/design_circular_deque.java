package Exercises.Second_Medium;
//641 设计循环双端队列
public class design_circular_deque {

}
class MyCircularDeque {
    int size;
    int maxSize;
    qNode head;
    qNode tail;
    public MyCircularDeque(int k) {
        this.maxSize = k;
        size = 0;
    }

    public boolean insertFront(int value) {
        if(size == maxSize) {
            return false;
        }
        qNode node = new qNode(value);
        if (size == 0) {
            tail = node;
        }else {
            head.pre = node;
            node.next = head;
        }
        head = node;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == maxSize) {
            return false;
        }
        qNode node = new qNode(value);
        if (size == 0) {
            head = node;
        }else {
            tail.next = node;
            node.pre = tail;
        }
        tail = node;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }
        if (size == 1) {
            tail = null;
            head = null;
        }else {
            head = head.next;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        if (size == 1) {
            head = null;
            tail = null;
        }else {
            tail = tail.pre;
        }
        size--;
        return true;
    }

    public int getFront() {
        return head == null ? -1 : head.val;
    }

    public int getRear() {
        return tail == null ? -1 : tail.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }
}
class qNode {
    int val;
    qNode pre;
    qNode next;
    public qNode(int val) {
        this.val = val;
    }
}