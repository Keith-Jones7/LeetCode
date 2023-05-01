package Exercises.First_Easy;
//1374 生成每种字符都是奇数个的字符串
public class generate_a_string_with_characters_that_have_odd_counts {
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if((n & 1) == 0) {
            stringBuilder.append("a".repeat(Math.max(0, n - 1)));
            stringBuilder.append("b");
        }else {
            stringBuilder.append("a".repeat(Math.max(0, n)));
        }
        return stringBuilder.toString();
    }

}
