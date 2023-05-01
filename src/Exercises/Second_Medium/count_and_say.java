package Exercises.Second_Medium;
//38 外观数列
public class count_and_say {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }
        if(n == 2) {
            return "11";
        }
        char[] chars = countAndSay(n - 1).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1, index = 1;
        char cur = chars[0];
        while (index < chars.length) {
            if(chars[index] == cur) {
                count++;
            }else {
                stringBuilder.append(count);
                stringBuilder.append(cur);
                cur = chars[index];
                count = 1;
            }
            index++;
        }
        stringBuilder.append(count);
        stringBuilder.append(cur);
        return stringBuilder.toString();
    }
}
