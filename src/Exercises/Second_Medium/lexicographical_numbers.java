package Exercises.Second_Medium;
import java.util.*;
//386 字典序排数
public class lexicographical_numbers {
    List<Integer> list = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        for(int i = 1; i <= 9; i++) {
            DFS(i, n);
        }
        return list;
    }
    public void DFS(int cur, int n) {
        if(cur > n) {
            return;
        }
        list.add(cur);
        for(int i = 1; i <= 9; i++) {
            DFS(cur * 10 + i, n);
        }
    }
}
