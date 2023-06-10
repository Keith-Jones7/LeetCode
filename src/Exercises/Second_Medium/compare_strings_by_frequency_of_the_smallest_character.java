package Exercises.Second_Medium;
//1170 比较字符串最小字母出现频次
public class compare_strings_by_frequency_of_the_smallest_character {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] map = new int[12];
        for (String word : words) {
            map[f(word)]++;
        }
        for (int i = 9; i >= 0; i--) {
            map[i] = map[i] + map[i + 1];
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int cnt = f(queries[i]);
            ans[i] = map[cnt + 1];
        }
        return ans;
    }

    public int f(String word) {
        int cnt = 0, min = Integer.MAX_VALUE, len = word.length();
        for (int i = 0; i < len; i++) {
            int ch = word.charAt(i);
            if (ch < min) {
                cnt = 1;
                min = ch;
            }else if (ch == min){
                cnt++;
            }
        }
        return cnt;
    }
}
