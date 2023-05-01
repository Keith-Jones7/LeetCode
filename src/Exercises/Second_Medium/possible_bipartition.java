package Exercises.Second_Medium;
//886 可能的二分法
public class possible_bipartition {
    int[] pre;
    int n;
    public int find(int x) {
        if (pre[x] == x) {
            return x;
        }
        return pre[x] = find(pre[x]);
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        this.n = n;
        pre = new int[n * 2 + 2];
        for (int i = 0; i < pre.length; i++) {
            pre[i] = i;
        }
        for (int[] dislike : dislikes) {
            int x = find(dislike[0]);
            int y = find(dislike[1]);
            if (x == y) {
                return false;
            }
            pre[find(x + n)] = y;
            pre[find(y + n)] = x;
        }
        return true;
    }
}
