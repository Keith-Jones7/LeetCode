package Exercises.First_Easy;
//2511 最多可以摧毁的敌人城堡数量
public class maximum_enemy_forts_that_can_be_captured {
    public int captureForts(int[] forts) {
        int max = 0;
        int pre = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1) {
                if (forts[pre] == -1) {
                    max = Math.max(max, i - pre - 1);
                }
                pre = i;
            }else if (forts[i] == -1) {
                if (forts[pre] == 1) {
                    max = Math.max(max, i - pre - 1);
                }
                pre = i;
            }
        }
        return max;
    }
}
