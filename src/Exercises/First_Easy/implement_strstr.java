package Exercises.First_Easy;
//28 实现strStr()
public class implement_strstr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        if(haystack.length() == 0) {
            return -1;
        }
        char[] ch = haystack.toCharArray();
        char[] cn = needle.toCharArray();
        int[] next = new int[cn.length];
        int index = 0, cur = -1;
        while (index < next.length - 1) {
            if(cur == -1 || cn[index] == cn[cur]) {
                cur++;
                index++;
                next[index] = cur;
            }else {
                cur = next[cur];
            }
        }
        int index1 = 0, index2 = -1;
        while (index1 < ch.length && index2 < cn.length) {
            if(index2 == -1 || ch[index1] == cn[index2]) {
                index1++;
                index2++;
            }else {
                index2 = next[index2];
            }
        }
        if(index2 == cn.length) {
            return index1 - index2;
        }else {
            return -1;
        }

    }
}
