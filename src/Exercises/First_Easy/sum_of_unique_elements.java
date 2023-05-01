package Exercises.First_Easy;
//1748 唯一元素的和
public class sum_of_unique_elements {
    public int sumOfUnique(int[] nums){
        int[] count = new int[100];
        for(int num: nums){
            count[num - 1]++;
        }
        int sum = 0;
        for(int i = 0; i < 100; i++){
            if(count[i] == 1){
                sum += (i + 1);
            }
        }
        return sum;
    }
}
