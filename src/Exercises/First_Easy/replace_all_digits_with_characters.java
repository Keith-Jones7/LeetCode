package Exercises.First_Easy;
//1844 将所有数字用字符替换
public class replace_all_digits_with_characters {
    public String replaceDigits(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 1; i < chars.length; i = i + 2) {
            stringBuilder.append(chars[i - 1]);
            stringBuilder.append((char) (chars[i - 1] + chars[i] - 48));
        }
        if(chars.length % 2 == 1) {
            stringBuilder.append(chars[chars.length - 1]);
        }
        return stringBuilder.toString();
    }
}
