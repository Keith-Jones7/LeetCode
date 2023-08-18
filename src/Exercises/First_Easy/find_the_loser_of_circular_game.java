package Exercises.First_Easy;
//2682 找出转圈游戏输家
public class find_the_loser_of_circular_game {
    public int[] circularGameLoser(int n, int k) {
        int[] flag = new int[n];
        int index = 0, i = 1;
        while (flag[index] != 1) {
            flag[index]++;
            index += i * k;
            i++;
            index %= n;
        }
        int[] ans = new int[n - i];
        index = 0;
        for (int j = 0; j < n; j++) {
            if (flag[j] == 0) {
                ans[index++] = j + 1;
            }
        }
        return ans;
    }
}
