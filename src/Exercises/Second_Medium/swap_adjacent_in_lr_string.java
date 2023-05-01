package Exercises.Second_Medium;
//777 在LR字符中交换相邻字符
public class swap_adjacent_in_lr_string {
    public boolean canTransform(String start, String end) {
        char[] chars1 = (start + "M").toCharArray();
        char[] chars2 = (end + "M").toCharArray();
        int index1 = 0, index2 = 0;
        while (index1 < chars1.length && index2 < chars2.length) {
            if (chars1[index1] == 'X') {
                index1++;
                continue;
            }
            if (chars2[index2] == 'X') {
                index2++;
                continue;
            }
            if (chars1[index1] != chars2[index2]) {
                return false;
            }
            if ((chars1[index1] == 'L' && index1 < index2) || ((chars1[index1] == 'R') && index1 > index2)) {
                return false;
            }
            index1++;
            index2++;
        }
        return true;
    }
}
