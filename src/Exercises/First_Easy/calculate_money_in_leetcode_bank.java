package Exercises.First_Easy;
//1716 计算力扣银行的钱
public class calculate_money_in_leetcode_bank {
    public int totalMoney(int n){
        int week = n / 7;
        int day = n - week * 7;
        int count_week = sum(7) * sum(week);
        int count_day = week * day * sum(day);
        return count_day + count_week;
    }
    public int sum(int m){
        if(m % 2 == 0){
            return m / 2 * (1 + m);
        }
        else {
            return (1 + m) / 2 * m;
        }
    }
}
