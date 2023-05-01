package Exercises.Second_Medium;

import java.util.Arrays;
import java.util.Comparator;

//646 最长数对链
public class maximum_length_of_pair_chain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));
        int cur = Integer.MIN_VALUE, count = 0;
        for (int[] pair : pairs) {
            if (cur < pair[0]) {
                cur = pair[1];
                count++;
            }
        }
        return count;
    }
}
