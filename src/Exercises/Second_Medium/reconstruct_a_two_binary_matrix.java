package Exercises.Second_Medium;
import java.util.*;
//1253 重构2行二进制矩阵
public class reconstruct_a_two_binary_matrix {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : colsum) {
            if (num == 2) {
                if (upper == 0 || lower == 0) {
                    return ans;
                }
                upper--;
                lower--;
            }
        }
        for (int num : colsum) {
            if (num == 2) {
                list1.add(1);
                list2.add(1);
            } else if (num == 0) {
                list1.add(0);
                list2.add(0);
            } else {
                if (upper == 0 && lower == 0) {
                    return ans;
                } else if (upper == 0) {
                    list1.add(0);
                    list2.add(1);
                    lower--;
                } else {
                    list1.add(1);
                    list2.add(0);
                    upper--;
                }
            }
        }
        if (upper != 0 || lower != 0) {
            return ans;
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}
