package Exercises.Second_Medium;
//779 第k个语法符号
public class k_th_symbol_in_grammar {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            if (k == 1) {
                return 0;
            }else {
                return 1;
            }
        }
        if (k % 2 == 0) {
            return 1 - kthGrammar(n - 1, k / 2);
        }else {
            return kthGrammar(n - 1, (k + 1) / 2);
        }
    }
}
