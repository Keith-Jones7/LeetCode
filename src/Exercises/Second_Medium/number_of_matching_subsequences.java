package Exercises.Second_Medium;
//792 匹配子序列的单词数
public class number_of_matching_subsequences {
    public int numMatchingSubseq(String s, String[] words) {
        char[] chars = s.toCharArray();
        int len = chars.length, count = 0;
        int[][] map = new int[chars.length][26];
        for (int i = 0; i < 26; i++) {
            map[len - 1][i] = -1;
        }
        map[len - 1][chars[len - 1] - 'a'] = len - 1;
        for (int i = 1; i < chars.length; i++) {
            int index = len - i - 1;
            char ch = chars[index];
            System.arraycopy(map[index + 1], 0, map[index], 0, 26);
            map[index][ch - 'a'] = index;
        }
        for (String word : words) {
            char[] chars1 = word.toCharArray();
            int index1 = 0, index = 0;
            boolean flag = true;
            while (index1 < chars1.length) {
                char ch = chars1[index1];
                if (index == chars.length || map[index][ch - 'a'] == -1) {
                    flag = false;
                    break;
                }
                if (chars1[index1] == chars[index]) {
                    index1++;
                    index++;
                }else {
                    index = map[index][ch - 'a'];
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
