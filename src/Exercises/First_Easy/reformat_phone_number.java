package Exercises.First_Easy;
//1694 重新格式化电话号码
public class reformat_phone_number {
    public String reformatNumber(String number) {
        char[] chars = number.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (char ch : chars) {
            if (!Character.isDigit(ch)) {
                continue;
            }
            stringBuilder.append(ch);
            count++;
            if (count % 3 == 0) {
                stringBuilder.append('-');
            }
        }
        int len = stringBuilder.length();
        if (count % 3 == 0) {
            stringBuilder.deleteCharAt(len - 1);
        }else if (count % 3 == 1) {
            char temp = stringBuilder.charAt(len - 2);
            stringBuilder.setCharAt(len - 2, stringBuilder.charAt(len - 3));
            stringBuilder.setCharAt(len - 3, temp);
        }
        return stringBuilder.toString();
    }
}
