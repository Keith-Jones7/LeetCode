package Exercises.First_Easy;

//67 二进制求和
public class add_binary {
    public String addBinary(String a, String b) {
        if(a.length() == 0) {
            return b;
        }
        if(b.length() == 0) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        int index1 = chars1.length - 1;
        int index2 = chars2.length - 1;
        int add = 0, sum, add1, add2;
        while (index1 >= 0 || index2 >= 0) {
            if(index1 < 0) {
                add2 = chars2[index2--] - 48;
                sum = (add2 + add) % 2;
                add = (add2 + add) / 2;
                stringBuilder.append(sum);
            }else if(index2 < 0) {
                add1 = chars1[index1--] - 48;
                sum = (add1 + add) % 2;
                add = (add1 + add) / 2;
                stringBuilder.append(sum);
            }else {
                add1 = chars1[index1--] - 48;
                add2 = chars2[index2--] - 48;
                sum = (add1 + add2 + add) % 2;
                add = (add1 + add2 + add) / 2;
                stringBuilder.append(sum);
            }
        }
        if(add == 1) {
            stringBuilder.append(add);
        }
        return stringBuilder.reverse().toString();
    }
}
