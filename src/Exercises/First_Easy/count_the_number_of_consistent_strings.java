package Exercises.First_Easy;


//1684 统计一致字符串的数目
public class count_the_number_of_consistent_strings {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean[26];
        for (char ch : allowed.toCharArray()) {
            allow[ch - 'a'] = true;
        }
        int count = 0;
        for (String word : words) {
            boolean flag = true;
            for (char ch : word.toCharArray()) {
                if (!allow[ch - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
