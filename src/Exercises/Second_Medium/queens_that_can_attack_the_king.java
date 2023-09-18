package Exercises.Second_Medium;
import java.util.*;
//1222 可以攻击国王的皇后
public class queens_that_can_attack_the_king {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        Set<Integer> set = new HashSet<>();
        for (int[] queen : queens) {
            int x = queen[0];
            int y = queen[1];
            set.add(x * 10 + y);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == j) {
                    continue;
                }
                int index = 0;
                int x = king[0];
                int y = king[1];
                while (x >= 0 && y >= 0 && x < 8 && y < 8) {
                    if (set.contains(x * 10 + y)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(x);
                        list.add(y);
                        ans.add(list);
                        break;
                    }
                    x = king[0] + index * i;
                    y = king[1] + index * j;
                    index++;
                }
            }
        }
        return ans;
    }

}
