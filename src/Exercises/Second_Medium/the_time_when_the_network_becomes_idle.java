package Exercises.Second_Medium;

import java.util.*;

//2039 网络空闲的时刻
public class the_time_when_the_network_becomes_idle {
    public int networkBecomesIdle(int[][] edges, int[] patience) {
        int len = patience.length;
        MapNode[] mapNodes = new MapNode[len];
        int max = -1;
        for(int[] edge : edges) {
            int index1 = edge[0];
            int index2 = edge[1];
            if(mapNodes[index1] == null) {
                mapNodes[index1] = new MapNode(index1);
            }
            if(mapNodes[index2] == null) {
                mapNodes[index2] = new MapNode(index2);
            }
            mapNodes[index1].add(index2);
            mapNodes[index2].add(index1);
        }
        int[] distance = getDistance(mapNodes, len);
        for(int i = 1; i < len; i++) {
            max = Math.max(max, getTotal(2 * distance[i], patience[i]));
        }
        return max;
    }
    public int[] getDistance(MapNode[] mapNodes, int n) {
        int[] distance = new int[n];
        boolean[] visit = new boolean[n];
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        visit[0] = true;
        distance[0] = 0;
        for(int index : mapNodes[0].next) {
            if(!visit[index]) {
                queue1.add(index);
            }
        }
        int deep = 0;
        while (!(queue1.isEmpty() && queue2.isEmpty())) {
            if(queue1.isEmpty()) {
                deep++;
                while (!queue2.isEmpty()) {
                    int index = queue2.poll();
                    if(!visit[index]) {
                        for(int next : mapNodes[index].next) {
                            if(!visit[next]) {
                                queue1.add(next);
                            }
                        }
                        distance[index] = deep;
                        visit[index] = true;
                    }
                }
            }
            else {
                deep++;
                while (!queue1.isEmpty()) {
                    int index = queue1.poll();
                    if(!visit[index]) {
                        for(int next : mapNodes[index].next) {
                            if(!visit[next]) {
                                queue2.add(next);
                            }
                        }
                        distance[index] = deep;
                        visit[index] = true;
                    }
                }
            }
        }
        return distance;
    }
    public int getTotal(int distance, int patience) {
        if(patience > distance) {
            return distance + 1;
        }
        if((distance - 1) % patience == 0) {
            return distance * 2;
        }
        return ((distance - 1) / patience) * patience + distance + 1;
    }
}
class MapNode {
    int val;
    ArrayList<Integer> next;
    public MapNode(int val) {
        this.val = val;
        next = new ArrayList<>();
    }
    public void add(int val) {
        next.add(val);
    }
}
