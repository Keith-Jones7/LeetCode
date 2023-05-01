package Exercises.Second_Medium;
//1447 最简分数
import java.util.*;
public class simplified_fraction {
    public List<String> simplifiedFractions(int n){
        List<String> list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            list.add(1 + "/" + i);
            for(int j = i + 1; j <= n; j++){
                if(gcd(j, i) == 1){
                    list.add(i + "/" + j);
                }
            }
        }
        return list;
    }
    public int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }
}
