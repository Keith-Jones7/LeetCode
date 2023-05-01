package Exercises.First_Easy;
//2027 转换字符串的最少操作次数
public class minimum_moves_to_convert_string {
    public int minimumMoves(String s) {
        char[] chars = s.toCharArray();
        int count = 0, index = 0;
        while (index < chars.length) {
            if (chars[index] == 'X') {
                count++;
                index += 3;
            }else {
                index++;
            }
        }
        return count;
    }
}
