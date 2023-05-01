package Exercises.Third_Hard;
//1220 统计元音字母序列的数目
public class count_vowels_permutation {
    public int countVowelPermutation(int n){
        if(n == 1){
            return 5;
        }
        long[][] dp_count = new long[2][5];
        long mod = 1000000007;
        for(int i = 0; i < 5; i++){
            dp_count[0][i] = 1;
        }
        int i = 1;
        while (i < n) {
            dp_count[1][0] = (dp_count[0][1] + dp_count[0][2] + dp_count[0][4]) % mod;
            dp_count[1][1] = (dp_count[0][0] + dp_count[0][2]) % mod;
            dp_count[1][2] = (dp_count[0][1] + dp_count[0][3]) % mod;
            dp_count[1][3] = (dp_count[0][2]) % mod;
            dp_count[1][4] = (dp_count[0][2] + dp_count[0][3]) % mod;
            System.arraycopy(dp_count[1], 0, dp_count[0], 0, 5);
            i++;
        }
        long ans = 0;
        for (int j = 0; j < 5; j++){
            ans = (ans + dp_count[1][j]) % mod;
        }
        return (int)(ans % mod);
    }
}
