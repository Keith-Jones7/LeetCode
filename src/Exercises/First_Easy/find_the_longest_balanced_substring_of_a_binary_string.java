package Exercises.First_Easy;
//2609 最长平衡子字符串
public class find_the_longest_balanced_substring_of_a_binary_string {
    public int findTheLongestBalancedSubstring(String s) {
        int max = s.length() / 2;
        while (max >= 0) {
            String sub = generateBalancedString(max);
            if (s.contains(sub)) {
                return max;
            }
            max--;
        }
        return max;
    }
    public String generateBalancedString(int len) {
        return "0".repeat(len) + "1".repeat(len);
    }
}
