package Exercises.First_Easy;
//796 旋转字符串
public class rotate_string {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        char[] chars1 = (s + s).toCharArray();
        char[] chars2 = goal.toCharArray();
        int[] next = new int[chars2.length];
        next[0] = -1;
        int index = 0, cur = -1;
        while (index < chars2.length - 1) {
            if(cur == -1 || chars2[index] == chars2[cur]) {
                next[++index] = ++cur;
            }else {
                cur = next[cur];
            }
        }
        int index1 = 0, index2 = 0;
        while (index1 < chars1.length && index2 < chars2.length) {
            if(index2 == -1 || chars1[index1] == chars2[index2]) {
                index1++;
                index2++;
            }else {
                index2 = next[index2];
            }
        }
        return index2 == chars2.length;
    }
}
