package Exercises.Second_Medium;
import java.util.*;
//954 二倍数对数组
public class array_of_double_pairs {
    public boolean canReorderDoubled(int[] arr) {
        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        int count_zero = 0;
        for(int num : arr) {
            if(num > 0) {
                positive.add(num);
            } else if(num < 0) {
                negative.add(-num);
            } else {
                count_zero++;
            }
        }
        if(count_zero % 2 != 0) {
            return false;
        }
        return canReorder(negative) && canReorder(positive);
    }
    public boolean canReorder(List<Integer> list) {
        int len = list.size();
        if(len % 2 != 0) {
            return false;
        }
        Collections.sort(list);
        int[] arr1 = new int[len / 2];
        int index = 0, index1 = 0, index2 = 0;
        while (index < len) {
            int num = list.get(index++);
            if(index1 == len / 2) {
                if(num % 2 != 0) {
                    return false;
                }
                if(2 * arr1[index2] != num) {
                    return false;
                }
                index2++;
                continue;
            }
            if(num % 2 != 0) {
                arr1[index1++] = num;
            }else {
                if(num == 2 * arr1[index2]) {
                    index2++;
                }else {
                    arr1[index1++] = num;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, 2, -4};
        array_of_double_pairs test = new array_of_double_pairs();
        test.canReorderDoubled(arr);
    }
}
