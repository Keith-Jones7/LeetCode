package Exercises.Second_Medium;

import java.util.*;

//1054 距离相等的条形码
public class distant_barcodes {
    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> (o2[1] - o1[1]));
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : barcodes) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int index = 0;
        while (priorityQueue.peek()[1] > 0) {
            int[] arr1 = priorityQueue.poll();
            int[] arr2 = priorityQueue.poll();
            if (arr2 == null || arr2[1] == 0) {
                barcodes[index] = arr1[0];
                break;
            }
            barcodes[index++] = arr1[0];
            barcodes[index++] = arr2[0];
            arr1[1]--;
            arr2[1]--;
            priorityQueue.add(arr1);
            priorityQueue.add(arr2);
        }
        return barcodes;
    }
}
