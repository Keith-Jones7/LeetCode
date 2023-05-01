package Exercises.First_Easy;
//942 增减字符串匹配
public class di_string_match {
    public int[] diStringMatch(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int[] ans = new int[len + 1];
        int left = 0, right = len, index = 0;
        for(char ch : chars) {
            if(ch == 'I') {
                ans[index] = left++;
            }else {
                ans[index] = right--;
            }
            index++;
        }
        ans[len] = left;
        return ans;
    }
}
