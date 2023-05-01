package Exercises.First_Easy;

import java.util.PriorityQueue;

//1046 最后一块石头的重量
public class last_stone_weight {
    public int lastStoneWeight(int[] stream) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x1, x2) -> (x2 - x1));
        for(int num : stream) {
            priorityQueue.add(num);
        }
        return simulate(priorityQueue);
    }

    public int simulate(PriorityQueue<Integer> stream) {
        if(stream.size() == 0) {
            return 0;
        }
        if(stream.size() == 1) {
            return stream.poll();
        }
        int num1 = stream.poll();
        int num2 = stream.poll();
        if(num1 == num2) {
            return simulate(stream);
        }
        stream.add(num1 - num2);
        return simulate(stream);
    }
}
