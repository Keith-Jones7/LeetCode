package Exercises.Second_Medium;

import java.util.PriorityQueue;

//1845 座位预约管理系统
public class seat_reservation_manager {
    PriorityQueue<Integer> priorityQueue;
    int index = 1;
    public seat_reservation_manager(int n) {
        priorityQueue = new PriorityQueue<>();
    }
    public int reserve() {
        if(!priorityQueue.isEmpty()) {
            return priorityQueue.poll();
        }else {
            return index++;
        }
    }
    public void unreserve(int seatNumber) {
        priorityQueue.add(seatNumber);
    }
}
