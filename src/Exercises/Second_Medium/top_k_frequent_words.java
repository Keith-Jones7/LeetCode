package Exercises.Second_Medium;
import java.util.*;
//692 前k个高频单词
public class top_k_frequent_words {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        PriorityQueue<String> priorityQueue = new PriorityQueue<>((x1, x2) -> {
            int cnt1 = map.get(x1);
            int cnt2 = map.get(x2);
            if (cnt1 == cnt2) {
                return x1.compareTo(x2);
            } else {
                return cnt2 - cnt1;
            }
        });
        priorityQueue.addAll(map.keySet());
        for(int i = 0; i < k; i++) {
            list.add(priorityQueue.poll());
        }
        return list;
    }
}
