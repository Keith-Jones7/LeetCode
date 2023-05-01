package Exercises.First_Easy;

import java.util.Arrays;

//455 分发饼干
public class assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        while (index2 < s.length && index1 < g.length) {
            if(g[index1] <= s[index2]) {
                count++;
                index1++;
            }
            index2++;
        }
        return count;
    }
}
