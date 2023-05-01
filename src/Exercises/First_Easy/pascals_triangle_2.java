package Exercises.First_Easy;
//119 杨辉三角2
import java.util.*;
public class pascals_triangle_2 {
    public List<Integer> getRow(int rowIndex){
        int[][] nums = new int[rowIndex + 1][rowIndex + 1];
        for(int i = 0; i <= rowIndex; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    nums[i][j] = 1;
                }
                else{
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums[rowIndex]){
            list.add(num);
        }
        return list;
    }

}
