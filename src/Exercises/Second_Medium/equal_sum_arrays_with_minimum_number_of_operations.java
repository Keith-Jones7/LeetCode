package Exercises.Second_Medium;
//1775 通过最少操作次数使数组的和相等
public class equal_sum_arrays_with_minimum_number_of_operations {
    public int minOperations(int[] nums1, int[] nums2) {
        int[] count1 = new int[6];
        int[] count2 = new int[6];
        int sum1 = 0, sum2 = 0;
        for (int j : nums1) {
            count1[j - 1]++;
            sum1 += j;
        }
        for (int j : nums2) {
            count2[j - 1]++;
            sum2 += j;
        }
        if (sum1 == sum2) {
            return 0;
        }
        if (sum1 > sum2) {
            return countOperationsNum(count1, count2, sum1 - sum2);
        }else {
            return countOperationsNum(count2, count1, sum2 - sum1);
        }
    }
    public int countOperationsNum (int[] count1, int[] count2, int diff) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (diff < (count1[i] * (5 - i))) {
                count += (diff / (5 - i));
                diff -= (diff / (5 - i) * (5 - i));
                if (diff > 0) {
                    count++;
                }
                return count;
            }else {
                count += count1[i];
                diff -= (count1[i] * (5 - i));
                count1[i] = 0;
            }
            if (diff < (count2[5 - i]) * (5 - i)) {
                count += (diff / (5 - i));
                diff -= (diff / (5 - i) * (5 - i));
                if (diff > 0) {
                    count++;
                }
                return count;
            }else {
                count += count2[5 - i];
                diff -= (count2[5 - i] * (6 - i - 1));
                count2[5 - i] = 0;
            }
        }
        if (diff == 0) {
            return count;
        }
        return -1;
    }
}
