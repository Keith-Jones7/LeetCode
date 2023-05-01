package Exercises.Third_Hard;
import java.util.*;
//1622 奇妙序列
public class fancy_sequence {
    List<Integer> multi_add;
    List<Long> sequence;
    List<Integer> getIndex;
    HashMap<Integer, Integer> map = new HashMap<>();
    long MOD = 1000000007;
    public fancy_sequence() {
        multi_add = new ArrayList<>();
        sequence = new LinkedList<>();
        getIndex = new ArrayList<>();
    }
    public void append(int val) {
        sequence.add((long)val);
        getIndex.add(multi_add.size());
    }
    public void addAll(int inc) {
        multi_add.add(-inc);
        map.clear();
    }
    public void multAll(int m) {
        multi_add.add(m);
        map.clear();
    }
    public int getIndex(int idx) {
        if(idx >= sequence.size()) {
            return -1;
        }
        if(map.containsKey(idx)) {
            return map.get(idx);
        }
        long num = sequence.get(idx);
        for(int i = getIndex.get(idx); i < multi_add.size(); i++) {
            int e = multi_add.get(i);
            if(e < 0) {
                num = (num - e);
            }else {
                num = (num * e) % MOD;
            }
        }
        map.put(idx, (int)num);
        return (int)num;
    }
}
