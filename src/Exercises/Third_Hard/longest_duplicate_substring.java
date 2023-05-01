package Exercises.Third_Hard;

import java.util.HashSet;
import java.util.Set;

//1044 最长重复子串
public class longest_duplicate_substring {

    long[] hash_M, hash_P;
    int P = 1311;
    public String longestDupSubstring(String s){

        int len = s.length();
        hash_M = new long[len + 10];
        hash_P = new long[len + 10];
        hash_P[0] = 1;
        for(int i = 1; i <= len; i++){
            hash_M[i] = (s.charAt(i - 1) - 'a' + 1) + hash_M[i - 1] * P;
            hash_P[i] = hash_P[i - 1] * P;
        }
        int left = 0;
        int right = len - 1;
        int[] ans = new int[2];
        while(left < right){
            int mid = (left + right + 1)/2;
            int[] temp = findDuplicateSubstring(s, mid);
            if(temp[0] + temp[1] == 0){
                right = mid - 1;
            }
            else {
                left = mid;
            }
            ans = (ans[1] - ans[0] > temp[1] - temp[0]) ? ans : temp;
        }
        return s.substring(ans[0], ans[1]);
    }
    public int[] findDuplicateSubstring(String s, int len){
        int[] result = {0 ,0};
        Set<Long> set = new HashSet<>();
        for(int i = 1; i <= s.length() - len + 1; i++){
            int j = i + len - 1;
            long hashcode = hash_M[j] - hash_M[i - 1] * hash_P[j - i + 1];
            if(set.contains(hashcode)){
                return new int[]{i - 1, j};
            }
            set.add(hashcode);
        }
        return result;
    }
    public static void main(String[] args){
        longest_duplicate_substring lds = new longest_duplicate_substring();
        String s = "banana";
        lds.longestDupSubstring(s);
    }
}
