package Exercises.First_Easy;
//2591 将钱分给最多的儿童
public class distribute_money_to_maximum_children {
    public int distMoney(int money, int children) {
        money -= children;
        if (money < 0) {
            return -1;
        }
        int ans = money / 7;
        int mod = money % 7;
        if (ans == 0) {
            return 0;
        }
        if (mod == 0 && children == ans) {
            return ans;
        }
        if (ans < children) {
            if (mod == 3 && children - ans == 1) {
                return ans - 1;
            }
            return ans;
        }
        return children - 1;
    }
}
