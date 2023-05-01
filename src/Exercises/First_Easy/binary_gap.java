package Exercises.First_Easy;
//868 二进制间距
public class binary_gap {
    public int binaryGap(int n) {
        if((n & (n - 1)) == 0) {
            return 0;
        }
        int gap = 0;
        int index = 0;
        while (index < 32 && (((n >> index) & 1) == 0)) {
            index++;
        }
        int right = index, left = index;
        for(;index < 32; index++) {
            left++;
            if(((n >> index) & 1) == 1) {
                gap = Math.max(gap, left - right);
                right = left;
            }
        }
        return gap;
    }
}
