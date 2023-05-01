package Exercises.Second_Medium;
import Exercises.First_Easy.add_string;
//43 字符串相乘
public class multiply_strings {
    add_string add = new add_string();
    public String multiply(String num1, String num2){
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int index1 = chars1.length - 1;
        int index2 = chars2.length - 1;
        String[] strings = new String[chars1.length];
        for(int i = index1; i >= 0; i--){
            int add = 0;
            int multi1 = chars1[i] - '0';
            if(multi1 == 0){
                strings[i] = "0";
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = index2; j >= 0; j--){
                int multi2 = chars2[j] - '0';
                int multi = multi1 * multi2 + add;
                add = multi / 10;
                System.out.println(add + "   " + multi);
                stringBuilder.append(multi % 10);
            }
            if(add > 0){
                stringBuilder.append(add);
            }
            stringBuilder.reverse();
            if(!stringBuilder.toString().equals("0")){
                stringBuilder.append("0".repeat(Math.max(0, index1 - i)));
            }
            strings[i] = stringBuilder.toString();
        }
        String ans = "0";
        for(String str : strings){
            ans = add.addStrings(ans, str);
        }
        return ans;
    }

}
