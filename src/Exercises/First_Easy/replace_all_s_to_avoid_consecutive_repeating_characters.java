package Exercises.First_Easy;

//1576 替换所有的问号
public class replace_all_s_to_avoid_consecutive_repeating_characters {
    public String modifyString(String s){
        char[] chars = s.toCharArray();
        if(chars[0] == '?'){
            chars[0] = 'a';
        }
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == '?'){
                chars[i] = (char)('a' +  (chars[i - 1] - 'a' + 1) % 26);
            }
            else if(chars[i] == chars[i - 1]){
                chars[i - 1] = (char)('a' +  (chars[i - 1] - 'a' + 1) % 26);
            }
        }
        return new String(chars);
    }
}
