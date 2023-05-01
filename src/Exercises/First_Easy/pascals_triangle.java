package Exercises.First_Easy;
//118 杨辉三角
import java.util.*;
public class pascals_triangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i = 1 ; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    list.add(1);
                }
                else {
                    list.add(pascal.get(i - 2).get(j - 1) + pascal.get(i - 2).get(j - 2));
                }
            }
            pascal.add(list);
        }
        return pascal;
    }

    public static void main(String[] args) {
        int numRows = 5;
        generate(numRows);
    }
}
