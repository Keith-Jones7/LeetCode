package Exercises.First_Easy;
//1539 第k个缺失的正整数
public class kth_missing_positive_number {
    public int findKthPositive(int[] arr, int k) {
        int num = 1, count = 1, index = 0;
        while (count <= k) {
            if(index < arr.length && num == arr[index]) {
                index++;
                num++;
            }else {
                num++;
                count++;
            }
        }
        return num - 1;
    }
}
