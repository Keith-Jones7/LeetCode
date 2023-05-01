package Exercises.First_Easy;

import java.util.PriorityQueue;

//703 数据流中的第K大元素
public class kth_largest_element_in_a_stream {
    PriorityQueue<Integer> priorityQueue;
    int K;
    public kth_largest_element_in_a_stream(int k, int[] nums) {
        K = k;
        priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.offer(num);
            if(priorityQueue.size() > K) {
                priorityQueue.poll();
            }
        }
    }
    public int add(int val) {
        priorityQueue.offer(val);
        if(priorityQueue.size() > K) {
            priorityQueue.poll();
        }
        assert !priorityQueue.isEmpty();
        return priorityQueue.peek();
    }
}
