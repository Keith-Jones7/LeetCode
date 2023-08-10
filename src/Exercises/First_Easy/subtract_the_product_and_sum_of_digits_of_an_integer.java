package Exercises.First_Easy;
//1281 整数的各位积和之差
public class subtract_the_product_and_sum_of_digits_of_an_integer {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            product *= num;
            sum += num;
            n /= 10;
        }
        return product - sum;
    }
}
