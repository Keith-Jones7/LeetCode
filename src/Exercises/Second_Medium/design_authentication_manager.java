package Exercises.Second_Medium;

import java.util.*;
import java.util.PriorityQueue;

//1797 设计一个验证系统
public class design_authentication_manager {

}
class AuthenticationManager {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    Map<String, Integer> map = new HashMap<>();
    int time;
    public AuthenticationManager(int timeToLive) {
        time = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime);
        priorityQueue.add(currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        if (map.containsKey(tokenId)) {
            int cur = map.get(tokenId);
            if (currentTime - cur < time) {
                map.put(tokenId, currentTime);
                priorityQueue.remove(cur);
                priorityQueue.add(currentTime);
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        while (!priorityQueue.isEmpty()) {
            if (currentTime - priorityQueue.peek() >= time) {
                priorityQueue.poll();
            }else {
                return priorityQueue.size();
            }
        }
        return 0;
    }
}
