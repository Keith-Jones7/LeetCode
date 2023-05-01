package Exercises.Second_Medium;
//556 下一个更大元素3
public class next_greater_element_3 {
    public int nextGreaterElement(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int i = chars.length - 2;
        while (i >= 0 && chars[i + 1] <= chars[i]) {
            i--;
        }

        if(i < 0) {
            return -1;
        }
        int j = chars.length - 1;
        while (j >= 0 && chars[j] <= chars[i]) {
            j--;
        }
        swap(chars, i, j);
        reverse(chars, i + 1);
        try {
            return Integer.parseInt(new String(chars));
        }catch (Exception e) {
            return -1;
        }
    }
    public void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public void reverse(char[] chars, int start) {
        int i = start, j = chars.length - 1;
        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
    }
}