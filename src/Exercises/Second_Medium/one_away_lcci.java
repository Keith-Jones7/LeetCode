package Exercises.Second_Medium;
//面试题 01.05. 一次编辑
public class one_away_lcci {
    public boolean oneEditAway(String first, String second) {
        char[] chars1 = (first + " ").toCharArray();
        char[] chars2 = (second + " ").toCharArray();
        if(Math.abs(chars1.length - chars2.length) > 1) {
            return false;
        }
        if(chars1.length < chars2.length) {
            return oneAway(chars1, chars2);
        }else {
            return oneAway(chars2, chars1);
        }
    }
    public boolean oneAway(char[] short_string, char[] long_string) {
        int count = 0;
        int index1 = 0, index2 = 0;
        while (index1 < short_string.length && index2 < long_string.length) {
            if(count > 1) {
                return false;
            }
            if(short_string[index1] != long_string[index2]) {
                count++;
                if(short_string.length == long_string.length) {
                    index1++;
                }
            }else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
