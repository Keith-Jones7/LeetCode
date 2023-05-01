package Exercises.Third_Hard;


//76 最小覆盖子串
public class minimum_window_substring {
    public String minWindow(String s, String t) {
        int[] count_t = new int[58];
        char[] chars_t = t.toCharArray();
        char[] chars_s = s.toCharArray();
        if(chars_t.length > chars_s.length) {
            return "";
        }
        for(char ch : chars_t) {
            count_t[ch - 'A']++;
        }
        int[] count_window = new int[58];
        int left = 0, right = 0;
        int start = 0, minLen = chars_s.length + 1;
        while (left < chars_s.length) {
            while (right < chars_s.length && arrayCompare(count_window, count_t) < 0 || left > right) {
                count_window[chars_s[right] - 'A']++;
                right++;
            }
            if(arrayCompare(count_window, count_t) >= 0) {
                if(right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
            }
            count_window[chars_s[left] - 'A']--;
            left++;

        }
        if(minLen < chars_s.length + 1) {
            return s.substring(start, start + minLen);
        }else {
            return "";
        }
    }
    public int arrayCompare(int[] arr1, int[] arr2) {
        int comp = 0;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] < arr2[i]) {
                return -1;
            }else if(arr1[i] > arr2[i]){
                comp = 1;
            }
        }
        return comp;
    }
}
