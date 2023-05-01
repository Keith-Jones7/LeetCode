package Exercises.First_Easy;
//1417 重新格式化字符串
public class reformat_the_string {
    public String reformat(String s) {
        char[] chars = s.toCharArray();
        int flag = isValid(chars);
        if (Math.abs(flag) > 1) {
           return "";
        }
        int index_digit = 0;
        int index_letter = 0;
        if (flag == 1) {
            index_letter++;
        }else {
            index_digit++;
        }
        char[] ans = new char[chars.length];
        for (char ch : chars) {
            if(Character.isDigit(ch)) {
                ans[index_digit] = ch;
                index_digit += 2;
            }else {
                ans[index_letter] = ch;
                index_letter += 2;
            }
        }
        return new String(ans);
    }
    public int isValid(char[] chars) {
        int count_digit = 0;
        int count_letter = 0;
        for (char ch : chars) {
            if(Character.isDigit(ch)) {
                count_digit++;
            }else {
                count_letter++;
            }
        }
        return count_digit - count_letter;
    }
}
