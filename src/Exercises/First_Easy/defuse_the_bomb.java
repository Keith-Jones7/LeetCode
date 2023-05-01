package Exercises.First_Easy;
//1652 拆炸弹
public class defuse_the_bomb {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[code.length];
        if (k == 0) {
            return res;
        }
        int abs = Math.abs(k), index = k / abs;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < abs; j++) {
                sum += code[(i + index * (1 + j) + len) % len];
            }
            res[i] = sum;
        }
        return res;

    }
}
