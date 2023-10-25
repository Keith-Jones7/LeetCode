package Exercises.Second_Medium;
//2698 求一个整数的惩罚数
public class find_the_punishment_number_of_an_integer {

    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (isPunish(i * i, i)) {
                ans += (i * i);
            }
        }
        return ans;
    }

    public boolean isPunish(int s, int i) {
        if (s == i) {
            return true;
        }
        int MOD = 10;
        while (s >= MOD && s % MOD <= i) {
            int val1 = s / MOD;
            int val2 = s % MOD;
            if (isPunish(val1, i - val2)) {
                return true;
            }
            MOD *= 10;
        }
        return false;
    }
}
