package Exercises.Second_Medium;
import java.util.*;
//677 键值映射
public class map_sum_pairs {

}
class MapSum {
    Map<String, Integer> map_origin;
    Map<String, Integer> map_insert;
    public MapSum() {
        this.map_origin = new HashMap<>();
        this.map_insert = new HashMap<>();
    }

    public void insert(String key, int val) {
        if(key.length() == 0){
            return;
        }
        int val_2 = this.map_origin.getOrDefault(key, 0);
        this.map_origin.put(key, val);
        for(int i = 0; i < key.length(); i++){
            String sub = key.substring(0, i + 1);
            this.map_insert.put(sub, this.map_insert.getOrDefault(sub, 0) + val - val_2);
        }
    }

    public int sum(String prefix) {
        return this.map_insert.getOrDefault(prefix, 0);
    }
}
