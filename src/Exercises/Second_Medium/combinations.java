package Exercises.Second_Medium;
//77 组合
import java.util.*;
public class combinations {
    public List<List<Integer>> combine(int n, int k) {
        if(k == 0 || k > n) {
            return new ArrayList<>();
        }
        if(k == 1) {
            List<List<Integer>> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                List<Integer> sub_list = new ArrayList<>();
                sub_list.add(i + 1);
                list.add(sub_list);
            }
            return list;
        }
        if(k == n) {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> sub_list = new ArrayList<>();
            for(int i = 0 ; i < n; i++) {
                sub_list.add(i + 1);
            }
            list.add(sub_list);
            return list;
        }
        List<List<Integer>> list = combine(n-1, k);
        for(List sublist: combine(n - 1, k - 1)) {
            sublist.add(n);
            list.add(sublist);
        }
        return list;
    }
}
