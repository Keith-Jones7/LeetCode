package Exercises.Second_Medium;
//443 字符串压缩
public class string_compression {
    public int compress(char[] chars) {
        int count_len = 0;
        char present = '就';
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != present) {
                chars[count_len] = chars[i];
                count_len++;
                present = chars[i];
            }
            int count = 0;
            while (i < chars.length && chars[i] == present) {
                i++;
                count++;
            }
            i--;
            if(count > 1) {
                StringBuilder stringBuilder = new StringBuilder();
                while (count > 0) {
                    stringBuilder.append(count % 10);
                    count = count / 10;
                }
                stringBuilder.reverse();
                String s = stringBuilder.toString();
                for(int j = 0; j < s.length(); j++) {
                    chars[count_len++] = s.charAt(j);
                }
            }
        }
        return count_len;
    }
}
