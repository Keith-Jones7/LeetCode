package Exercises.First_Easy;

//1763 最长的美好子字符串
public class longest_nice_substring {
    public String longestNiceSubstring(String s){
        char[] chars = s.toCharArray();
        int max_len = -1, index1 = 0, index2 = 0;
        for(int i = 0; i < chars.length; i++){
            int upper = 0, lower = 0, len = -1;
            for(int j = i; j < chars.length; j++){
                char temp = chars[j];
                if(Character.isUpperCase(temp)){
                    upper |= (1 << (temp) - 'A');
                }
                else {
                    lower |= (1 << (temp) - 'a');
                }
                if(upper == lower){
                    len = j - i + 1;
                }
                if(len > max_len){
                    max_len = len;
                    index1 = i;
                    index2 = j + 1;
                }
            }
        }
        return s.substring(index1, index2);
    }
}
