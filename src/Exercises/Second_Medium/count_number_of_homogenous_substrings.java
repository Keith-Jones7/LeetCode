package Exercises.Second_Medium;
//1759 统计同构子字符串的数目
public class count_number_of_homogenous_substrings {
    public int countHomogenous(String s) {
        int MOD = 1000000007;
        char[] chars = (s + "A").toCharArray();
        char cur = 'B';
        long count = 1, ans = 0;
        for (char ch : chars) {
            if (ch == cur) {
                count++;
            }else {
                count = ((count) * (count + 1) / 2) % MOD;
                ans = (ans + count) % MOD;
                count = 1;
                cur = ch;
            }
        }
        ans--;
        return (int) ans;
    }
    
}
