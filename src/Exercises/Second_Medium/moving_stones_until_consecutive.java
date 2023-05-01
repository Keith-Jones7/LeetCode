package Exercises.Second_Medium;
//1033 移动石子直到连续
public class moving_stones_until_consecutive {
    public int[] numMovesStones(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - max - min;
        int[] ans = new int[2];
        ans[1] = max - min - 2;
        if (max - mid <= 2 || mid - min <= 2) {
            ans[0] = 1;
        }else {
            ans[0] = 2;
        }
        if (ans[0] > ans[1]) {
            ans[0] = ans[1];
        }
        return ans;
    }
}
