package Exercises.First_Easy;
//2042 检查句子中的数字是否递增
public class check_if_numbers_are_ascending_in_a_sentence {
    public boolean areNumberAscending(String s) {
        String[] strings = s.split(" ");
        int cur = 0;
        for (String str : strings) {
            if (Character.isDigit(str.charAt(0))) {
                int temp = Integer.parseInt(str);
                if (temp > cur) {
                    cur = temp;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
