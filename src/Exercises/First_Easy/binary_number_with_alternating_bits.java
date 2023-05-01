package Exercises.First_Easy;
//693 交替位二进制数
public class binary_number_with_alternating_bits {
    public boolean hasAlternatingBits(int n) {
        int pre = n % 2;
        while (n > 0) {
            n = n >> 1;
            int temp = n % 2;
            if(pre == temp) {
                return false;
            }
            pre = temp;
        }
        return true;
    }
}
