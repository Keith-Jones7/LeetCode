package Exercises.Second_Medium;
//526 优美的排列
public class beautiful_arrangement {
    public int countArrangement(int n) {
        boolean[] used = new boolean[n + 1];
        return backTracking(used, 1, n);
    }
    public int backTracking(boolean[] used, int index, int n) {
        if (index == n + 1) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!used[i] && (i % index == 0 || index % i == 0)) {
                used[i] = true;
                count += backTracking(used, index + 1, n);
                used[i] = false;
            }
        }
        return count;
    }
}
