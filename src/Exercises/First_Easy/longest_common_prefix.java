package Exercises.First_Easy;
//14 最长公共前缀
public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            if(common(strs, i)) {
                stringBuilder.append(strs[0].charAt(i));
            }
            else {
                break;
            }
        }
        return stringBuilder.toString();
    }
    public boolean common(String[] strs, int index) {
        char ch = strs[0].charAt(index);
        for(String str : strs) {
            if(str.length() <= index) {
                return false;
            }
            if(str.charAt(index) != ch) {
                return false;
            }
        }
        return true;
    }
}
