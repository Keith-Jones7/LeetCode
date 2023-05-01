package Exercises.First_Easy;
//521 最长特殊序列1
public class longest_uncommon_subsequence_1 {
    public int findLUSlength(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if(len1 != len2) {
            return Math.max(len1, len2);
        }
        if(a.equals(b)) {
            return -1;
        }
        return len1;
    }
}
