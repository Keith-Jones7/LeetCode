package Exercises.First_Easy;

import java.util.*;

//762 二进制表示中质数个计算置位
public class prime_number_of_set_bits_in_binary_representation {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> prime = new HashSet<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);
        prime.add(11);
        prime.add(13);
        prime.add(17);
        prime.add(19);
        int sum = 0;
        for(int num = left; num <= right; num++) {
            if(prime.contains(countPrime(num))) {
                sum++;
            }
        }
        return sum;
    }
    public int countPrime(int num) {
        int count = 0;
        while (num > 0) {
            if((num % 2) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
