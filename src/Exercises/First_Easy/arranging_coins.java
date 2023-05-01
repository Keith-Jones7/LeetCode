package Exercises.First_Easy;
//441 排列硬币
public class arranging_coins {
    public int arrangeCoins(int n) {
        int left = 1, right = (int)Math.sqrt(n) * 2, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if(Fn(mid) == n) {
                return mid;
            }else if(Fn(mid) > 0 && Fn(mid) < n) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        int k = Fn(left);
        System.out.println(k);
        if(k > 0 && k <= n) {
            return left;
        }else {
            return left - 1;
        }
    }
    public int Fn(int n) {
        if(n % 2 == 0) {
            return n / 2 * (n + 1);
        }else {
            return (n + 1) / 2 * n;
        }
    }
}
