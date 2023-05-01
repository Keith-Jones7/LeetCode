package Exercises.Second_Medium;
//869 重新排序得到2的幂

import java.util.HashSet;

public class reorder_power_of_2 {
    public boolean reorderPowerOf2(int n) {
        int [] table = new int[31];
        for(int i = 0; i<table.length; i++) {
            table[i] = (int)Math.pow(2,i);
        }
        HashSet<String> s = new HashSet<String>();
        for(int t : table) {
            s.add(countNumber(t));
        }
        return s.contains(countNumber(n));

    }
    public String countNumber(int n) {
        char [] num = new char [10];
        while(n > 0) {
            num[n%10]++;
            n = n/10;
        }
        return new String(num);
    }
}
