package Exercises.Third_Hard;
//41 缺失的第一个正数
//题解： 考虑到数组长度为n的未排序数组，最多只能容纳n个数字，则缺失的最小正整数，最大也只能是n+1，其余全部在1到n范围内出现
//考虑构造一个长度为n的数组，只把1-n内的数字放进去，然后判断缺失的是哪个
public class first_missing_positive {
    public int firstMissingPositive(int[] nums) {
        int[] position = new int[nums.length + 1];
        for(int num:nums) {
            if(num < 0||num >= position.length) {
                continue;
            }
            position[num] = num;
        }
        for(int i = 1; i < position.length; i++) {
            if(position[i] == 0) {
                return i;
            }
        }
        return position.length;
    }
}
