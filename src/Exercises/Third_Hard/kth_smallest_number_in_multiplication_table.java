package Exercises.Third_Hard;
//668 乘法表中第k小的数
public class kth_smallest_number_in_multiplication_table {
    public int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;
        int count, mid;
        while (left < right) {
            count = 0;
            mid = left + (right - left) / 2;
            for(int i = 1; i <= m && i <= mid; i++) {
                count += Math.min(mid / i, n);
            }
            if(count >= k) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

}
