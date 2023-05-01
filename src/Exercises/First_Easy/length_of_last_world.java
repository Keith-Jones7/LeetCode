package Exercises.First_Easy;
//58 最后一个单词的长度
public class length_of_last_world {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = 0;
        int index = chars.length - 1;
        while (!Character.isLetter(chars[index])) {
            index--;
        }
        for(int i = index; i >= 0; i--) {
            if(!Character.isLetter(chars[i])) {
                break;
            }
            len++;
        }
        return len;
    }
}
