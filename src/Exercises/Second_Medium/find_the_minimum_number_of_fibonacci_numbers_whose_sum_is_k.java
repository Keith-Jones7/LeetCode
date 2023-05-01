package Exercises.Second_Medium;
//1414 和为k的最少斐波那契数字数目
public class find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k {
    static int[] fibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
            10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578,
            5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437,
            701408733, 1134903170, 1836311903};
    public int findMinFibonacciNumbers(int k){
        if(k == 0){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        int i = 0;
        while (fibonacci[i] < k){
            i++;
        }
        if(fibonacci[i] == k){
            return 1;
        }
        return 1 + findMinFibonacciNumbers(k - fibonacci[i - 1]);
    }
}
