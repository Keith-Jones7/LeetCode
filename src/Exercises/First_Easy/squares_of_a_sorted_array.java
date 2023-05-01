package Exercises.First_Easy;
//977 有序数组的平方
public class squares_of_a_sorted_array {
    public int[] sortedSquares(int[] nums){
        int length = nums.length;
        int[] square = new int[length];
        int left = 0, right = length - 1, index = length - 1;
        while (left < right){
            int left_square = nums[left] * nums[left];
            int right_square = nums[right] * nums[right];
            if(right_square > left_square){
                square[index--] = right_square;
                right--;
            }
            else {
                square[index--] = left_square;
                left++;
            }
        }
        square[index] = nums[left] * nums[left];
        return square;
    }
}
