package Exercises.Second_Medium;
//2100 适合打劫银行的日子
import java.util.*;
public class find_good_days_to_rob_the_bank {

    public List<Integer> goodDaysToRobBank(int [] security, int num) {
        int len = security.length;
        int[] left = new int[len];
        int[] right = new int[len];
        for(int i = 1; i < len; i++) {
            if(security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
            if(security[len - i - 1] <= security[len - i]) {
                right[len - i] = right[len - i - 1] + 1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = num; i < len - num; i++) {
            if(left[i] >= num && right[i] >= num) {
                list.add(i);
            }
        }
        return list;
    }



    public static void main(String[] args) {
        int[] security = {5,3,3,3,5,6,2};
        int num = 2;
        find_good_days_to_rob_the_bank test = new find_good_days_to_rob_the_bank();
        test.goodDaysToRobBank(security, num);
    }
}
