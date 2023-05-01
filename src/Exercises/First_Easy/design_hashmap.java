package Exercises.First_Easy;

import java.util.Arrays;

//706 设计哈希映射
public class design_hashmap {
    int[] map = new int[1000000];
    public design_hashmap(){
        Arrays.fill(map, -1);
    }
    public void put(int key, int value){
        map[key] = value;
    }
    public int get(int key){
        return map[key];
    }
    public void remove(int key){
        map[key] = -1;
    }
}
