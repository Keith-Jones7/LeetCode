package Exercises.Second_Medium;

import java.util.*;

//522 最长特殊序列2
public class longest_uncommon_subsequence_2 {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, (Comparator.comparingInt(String::length)));
        HashMap<String, Integer> count = new HashMap<>();
        for(String str : strs) {
            count.put(str, count.getOrDefault(str, 0) + 1);
        }
        for(int i = strs.length - 1; i >= 0; i--) {
            if(count.get(strs[i]) == 1) {
                boolean isSub = false;
                for(int j = strs.length - 1; j > i; j--) {
                    if(isSubSequence(strs[i], strs[j])) {
                        isSub = true;
                        break;
                    }
                }
                if(!isSub) {
                    return strs[i].length();
                }
            }
        }
        return -1;
    }
    public boolean isSubSequence(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int index1 = 0, index2 = 0;
        while (index1 < chars1.length && index2 < chars2.length) {
            if(chars1[index1] == chars2[index2]) {
                index1++;
            }
            index2++;
        }
        return index1 == chars1.length;
    }

}
