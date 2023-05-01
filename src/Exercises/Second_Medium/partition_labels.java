package Exercises.Second_Medium;

import java.util.*;

//763 划分字母区间
public class partition_labels {
    public List<Integer> partitionLabels(String s){
        int[][] part = new int[26][2];
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            int index = (chars[i] - 'a');
            if(part[index][0] == 0){
                part[index][0] = i;
            }
            part[index][1] = i;
        }
        part[chars[0] - 'a'][0] = 0;
        return merge(part);
    }
    public List<Integer> merge(int[][] part) {
        Arrays.sort(part, Comparator.comparingInt(x -> x[0]));
        List<Integer> list = new ArrayList<>();
        int left = Integer.MAX_VALUE, index = -1;
        int right = -1;
        for (int[] interval : part) {
            if (interval[0] <= right) {
                right = Math.max(right, interval[1]);
                list.set(index, right - left + 1);
            }
            if (interval[0] > right) {
                left = interval[0];
                right = interval[1];
                list.add(right - left + 1);
                index++;
            }
        }
        return list;
    }
}
