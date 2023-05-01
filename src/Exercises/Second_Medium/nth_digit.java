package Exercises.Second_Medium;
//400 第N位数字
public class nth_digit {
    static long[] group = new long[12];
    public static int findNthDigit(int n){
        int figure = findKthGroup(n);
        if(figure == 1){
            return n;
        }
        int k_nth = n - (int)group[figure - 1];
        int count = k_nth/figure;
        int mod = k_nth % figure;
        if(mod == 0){
            return ((int)Math.pow(10, figure) - 1 + count)%10;
        }
        return (((int)Math.pow(10, figure - 1) + count)/(int)Math.pow(10, figure - mod)) % 10;
    }
    public static int findKthGroup(int n){
        group[0] = 0;
        for(int i = 1; i < group.length; i++){
            group[i] = group[i - 1] + (i) * (long)Math.pow(10, i - 1) * 9;
            if(n > group[i]){
                continue;
            }
            if(n <= group[i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 100000000;
        System.out.println(findNthDigit(n));
    }
}
