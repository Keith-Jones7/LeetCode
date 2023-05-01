package Exercises.Second_Medium;

//2028 找出缺失的观测数据
public class find_missing_observation {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = mean * (m + n);
        int sum_m = 0;
        for(int num : rolls) {
            sum_m += num;
        }
        int sum_n = sum - sum_m;
        if(sum_n < n || sum_n > 6 * n) {
            return new int[]{};
        }
        int mean_n = sum_n / n;
        int[] arr = new int[n];
        int reminder = sum_n - n * mean_n;
        for(int i = 0; i < arr.length; i++) {
            if(i < reminder) {
                arr[i] = mean_n + 1;
            }else {
                arr[i] = mean_n;
            }
        }
        return arr;
    }
}
