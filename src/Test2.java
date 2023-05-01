import java.util.*;
public class Test2 {
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else {
                if (stack.empty()) {
                    return false;
                }
                char left = stack.pop();
                if (!((left == '(' && ch == ')') || (left == '[' && ch == ']') || (left == '{'&& ch == '}'))) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int cnt0 = 0;
        int index = 0, len = nums.length;
        for (; index < len - 1; index++) {
            if (nums[index] == 0) {
                cnt0++;
            }else if (nums[index] == nums[index + 1]) {
                return false;
            }
        }
        return nums[4] - nums[cnt0] < 5;
    }
    public String minNumber(int[] nums) {
        int len = nums.length;
        String[] strs = new String[len];
        for (int i = 0; i < len; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (a, b) -> ((a + b).compareTo(b + a)));
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
    public int findMinimumTime(int[][] tasks) {
        int len = tasks.length;
        int[][] times = new int[2000][2];
        for (int i = 0; i < times.length; i++) {
            times[i][1] = i;
        }
        for (int[] task : tasks) {
            int start = task[0];
            int end = task[1];
            for (int i = start; i <= end; i++) {
                times[i][0]++;
            }
        }
        Arrays.sort(times, (a, b) -> (b[0] - a[0]));
        int count = 0, count_time = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(times[i][1]);
        }
        for (int[] time : times) {
            if (time[0] == 0 || count == len) {
                break;
            }
            int index = time[1];
            count_time++;
            for (int[] task : tasks) {
                int start = task[0];
                int end = task[1];
                int dur = task[2];
                if ((start <= index && end >= index) && dur > 0) {
                    dur--;
                    if (dur == 0) {
                        System.out.println(count);
                        count++;
                    }
                }
            }
        }
        return count_time;
    }
    public static void main(String[] args) {
        String s = "[][][](){})))";
        System.out.println(isValid(s));
    }
}
