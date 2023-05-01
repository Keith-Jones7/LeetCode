package Exercises.Second_Medium;
//481 神奇字符串
public class magical_string {

    public int magicalString(int n) {
        int[] chars = new int[2 * n];
        chars[0] = 1;
        chars[1] = 2;
        int fast = 1, slow = 1;
        int add = 1;
        int count = 1;
        while (slow < n) {
            add = 3 - add;
            if (chars[slow] == 2) {
                chars[fast] = add;
                fast++;
                chars[fast] = add;
                fast++;
            }else {
                chars[fast] = add;
                fast++;
                count++;
            }
            System.out.println(chars[slow]);
            slow++;
        }
        return count;
    }
}
