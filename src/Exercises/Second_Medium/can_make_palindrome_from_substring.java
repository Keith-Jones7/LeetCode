package Exercises.Second_Medium;
import java.util.*;
// 1177 构建回文串检测
public class can_make_palindrome_from_substring {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int[][] count = new int[len + 1][26];
        for (int i = 1; i < len; i++) {
            char ch = chars[i - 1];
            System.arraycopy(count[i - 1], 0, count[i], 0, 26);
            count[i][ch - 'a']++;
        }
        List<Boolean> list = new ArrayList<>();
        for (int[] query : queries) {
            int left = query[0], right = query[1], k = query[2];
            list.add(isValid(count[left], count[right + 1], k));
        }
        return list;
    }

    public boolean isValid(int[] cnt1, int[] cnt2, int k) {
        int[] cnt = new int[26];
        int sum = 0, odd = 0, even = 0;
        for (int i = 0; i < 26; i++) {
            cnt[i] = cnt2[i] - cnt1[i];
            sum += cnt[i];
            if (cnt[i] % 2 == 1) {
                odd++;
            }else if (cnt[i] > 0) {
                even++;
            }
        }
        System.out.println(odd);
        if (sum % 2 == 0 && (odd > 2 * k)) {
            return false;
        }else return odd <= 2 * k + 1;
    }
}
