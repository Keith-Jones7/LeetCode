package Exercises.Third_Hard;

//440 字典序的第k小数字
public class k_smallest_in_lexicographical_order {
    public int findKthNumber(int n, int k) {
        int cur = 1;
        int prefix = 1;
        while (cur < k) {
            int countPrefix = getInterval(n, prefix);
            if(countPrefix + cur > k) {
                prefix *= 10;
                cur++;
            }else {
                prefix++;
                cur += countPrefix;
            }
        }
        return prefix;
    }
    public int getInterval(int n, int prefix) {
        long cur = prefix;
        long next = prefix + 1;
        int count = 0;
        while (cur <= n) {
            count += Math.min(n + 1, next) - cur;
            cur *= 10;
            next *= 10;
        }
        return count;
    }
}
