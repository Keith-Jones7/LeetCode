package Exercises.Second_Medium;
import java.util.*;
//380 O(1)时间插入、删除和获取随机元素
public class insert_delete_getrandom_o1 {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random random;
    public insert_delete_getrandom_o1() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }else {
            int size = list.size();
            map.put(val, size);
            list.add(val);
            return true;
        }
    }
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }else {
            int indices = map.get(val);
            int num = list.get(list.size() - 1);
            map.put(num, indices);
            list.set(indices, num);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
    }
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
