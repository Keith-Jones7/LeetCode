package Exercises.Second_Medium;
//面试题 17.09 第k个数
public class get_kth_magic_number_lcci {
    public int getKthMagicNumber(int k) {
        int[] magic = new int[k];
        magic[0] = 1;
        int p1 = 0, p2 = 0, p3 = 0;
        for (int i = 1; i < k; i++) {
            int num1 = magic[p1] * 3;
            int num2 = magic[p2] * 5;
            int num3 = magic[p3] * 7;
            magic[i] = Math.min(num1, Math.min(num2, num3));
            if (magic[i] == num1) {
                p1++;
            }
            if (magic[i] == num2) {
                p2++;
            }
            if (magic[i] == num3) {
                p3++;
            }
        }
        return magic[k - 1];
    }
}
