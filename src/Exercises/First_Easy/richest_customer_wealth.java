package Exercises.First_Easy;
//1672 最富有的客户的资产总量
public class richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int max = -1;
        for(int[] account : accounts) {
            int sum = 0;
            for(int acc : account) {
                sum += acc;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
