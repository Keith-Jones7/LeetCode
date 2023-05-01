package Exercises.Second_Medium;

import java.util.List;

//120 三角形最小路径和
public class triangle {
    public int minimumTotal(List<List<Integer>> triangle){
        int min = Integer.MAX_VALUE;
        int len = triangle.size();
        for(int i = 1; i < len; i++){
            int size = i + 1;
            List<Integer> list1 = triangle.get(i - 1);
            List<Integer> list2 = triangle.get(i);
            list2.set(0, list2.get(0) + list1.get(0));
            for(int j = 1; j < size - 1; j++){
                list2.set(j, Math.min(list1.get(j - 1), list1.get(j)) + list2.get(j));
            }
            list2.set(size - 1, list1.get(size - 2) + list2.get(size - 1));
        }
        List<Integer> list = triangle.get(len - 1);
        for (Integer integer : list) {
            min = Math.min(min, integer);
        }
        return min;
    }
}
