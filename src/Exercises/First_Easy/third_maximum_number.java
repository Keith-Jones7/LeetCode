package Exercises.First_Easy;
//414 第三大的数
public class third_maximum_number {
    public int thirdMax(int[] nums) {
        long[] max ={Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int num : nums) {
            if (num > max[0]) {
                max[0] = num;
            }
        }
        boolean flag = false;
        for (int num : nums) {
            if (num < max[0] && num > max[1]) {
                max[1] = num;
                flag = true;
            }
        }
        if(!flag) {
            return (int)max[0];
        }
        flag = false;
        for (int num : nums) {
            if(num < max[1] && num > max[2]) {
                max[2] = num;
                flag = true;
            }
        }
        if(!flag) {
            return (int)max[0];
        }
        return (int)max[2];
    }
}
