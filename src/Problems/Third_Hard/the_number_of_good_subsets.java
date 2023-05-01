package Problems.Third_Hard;

import java.util.*;

//1994 好子集的数目
public class the_number_of_good_subsets {
    Set<Integer> primeSet = new HashSet<>();
    final int MOD = 1000000000 + 7;
    public int numberOfGoodSunsets(int[] nums){
        primeSet.add(2);
        primeSet.add(3);
        primeSet.add(5);
        primeSet.add(7);
        primeSet.add(11);
        primeSet.add(13);
        primeSet.add(17);
        primeSet.add(19);
        primeSet.add(23);
        primeSet.add(29);
        int[] count = new int[30];
        for(int num : nums){
            count[num - 1]++;
        }
        return 0;
    }
    public int countPrime(int[] nums_count){
        int count = nums_count[0];
        for(int i = 1; i < nums_count.length; i++){
            if(primeSet.contains(i + 1) && nums_count[i] > 0){
                if(count == 0){
                    count = nums_count[i];
                }
                else {
                    count = (count * nums_count[i]) % MOD;
                }
            }
        }
        return count % MOD;
    }
}
