package Exercises.First_Easy;
//504 七进制数
public class base_7 {
    public String convertToBase7(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int absNum = Math.abs(num);
        while (absNum > 0) {
            int mod = absNum % 7;
            stringBuilder.append(mod);
            absNum = absNum / 7;
        }
        if(num < 0) {
            stringBuilder.append('-');
        }
        else if(num == 0) {
            return "0";
        }
        return stringBuilder.reverse().toString();
    }
}
