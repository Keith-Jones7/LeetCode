package Exercises.First_Easy;
//415 字符串相加
public class add_string {
    public String addStrings(String num1, String num2){
        StringBuilder stringBuilder  = new StringBuilder();
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int index1 = chars1.length - 1;
        int index2 = chars2.length - 1;
        int add = 0;
        while (index1 >= 0 || index2 >= 0){
            int index;
            if(index1 < 0){
                index = (chars2[index2--] - 48) + add;
            }
            else if(index2 < 0){
                index = (chars1[index1--] - 48) + add;
            }
            else {
                index = (chars1[index1--] - 48 + chars2[index2--] - 48) + add;
            }
            if(index > 9){
                add = 1;
                index -= 10;
            }
            else {
                add = 0;
            }
            stringBuilder.append(index);
        }
        if(add > 0){
            stringBuilder.append(add);
        }
        return stringBuilder.reverse().toString();
    }
}
