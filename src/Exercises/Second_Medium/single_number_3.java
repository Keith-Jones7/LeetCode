package Exercises.Second_Medium;
//260 只出现一次的数字3
import java.util.HashSet;

public class single_number_3 {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i : nums) {
            if(s.contains(i)) {
                s.remove(i);
            }
            else {
                s.add(i);
            }
        }
        return s.stream().mapToInt(x -> x).toArray();
    }
    public int[] singleNumber2(int[] nums) {
        int or = 0;
        for (int num : nums) {
            or ^= num;
        }
        or = (or & (~or + 1));
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & or) == 1) {
                num1 ^= num;
            }else {
                num2 ^= num;
            }
        }
        return new int[] {num1, num2};
    }
}
