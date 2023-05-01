package Exercises.First_Easy;

import java.util.*;

//821 字符的最短距离
public class shortest_distance_to_a_character {
    List<Integer> list = new ArrayList<>();
    int size;
    public int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        int[] distance = new int[chars.length];
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == c) {
                list.add(i);
                distance[i] = 0;
            }
        }
        size = list.size();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != c) {
                distance[i] = binarySearch(i);
            }
        }
        return distance;
    }
    public int binarySearch(int target) {
        if(size == 1) {
            return Math.abs(list.get(0) - target);
        }
        int left = 0, right = size - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            int num = list.get(mid);
            if(target < num) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        System.out.println(list.get(left));
        if(left == 0) {
            return Math.min(Math.abs(list.get(left) - target), Math.abs(list.get(left + 1) - target));
        }else if(left == (size - 1)) {
            return Math.min(Math.abs(list.get(left) - target), Math.abs(list.get(left - 1) - target));
        }
        else {
            return Math.min(Math.min(Math.abs(list.get(left) - target),
                    Math.abs(list.get(left - 1) - target)), Math.abs(list.get(left + 1) - target));
        }
    }
}
