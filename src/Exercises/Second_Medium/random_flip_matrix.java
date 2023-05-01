package Exercises.Second_Medium;

import java.util.*;

public class random_flip_matrix {
    private int m, n, total;
    private Map<Integer, Integer> map = new HashMap<>();
    private Random random;

    public random_flip_matrix(int m, int n) {
        this.m = m;
        this.n = n;
        total = m * n - 1;
        map = new HashMap<>();
        random = new Random();
    }

    public int[] flip() {
        int r = random.nextInt(total + 1);
        int idx = map.getOrDefault(r, r);
        map.put(r, map.getOrDefault(total, total));
        total--;
        return new int[]{idx / n, idx % n};
    }

    public void reset() {
        total = m * n - 1;
        map = new HashMap<>();
    }
}
