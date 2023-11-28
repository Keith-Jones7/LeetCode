package Exercises.Second_Medium;
import java.util.*;
//1670 设计前中后队列
public class design_front_middle_back_queue {

}
class FrontMiddleBackQueue {
    List<Integer> list;
    int size = 0;
    public FrontMiddleBackQueue() {
        list = new ArrayList<>();
    }

    public void pushFront(int val) {
        list.add(0, val);
        size++;
    }

    public void pushMiddle(int val) {
        list.add(size / 2, val);
        size++;
    }

    public void pushBack(int val) {
        list.add(val);
        size++;
    }

    public int popFront() {
        if (size == 0) {
            return -1;
        }
        size--;
        return list.remove(0);
    }

    public int popMiddle() {
        if (size == 0) {
            return -1;
        }
        System.out.println(list);
        return list.remove((size--) / 2);
    }

    public int popBack() {
        if (size == 0) {
            return -1;
        }
        return list.remove((size--) - 1);
    }
}
