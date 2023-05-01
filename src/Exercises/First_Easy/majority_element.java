package Exercises.First_Easy;
//169 多数元素
public class majority_element {
    public int majorityElement(int[] nums){
        int count = 1, index = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == index){
                count++;
            }
            else {
                count--;
            }
            if(count == 0){
                count = 1;
                index = nums[i];
            }
        }
        return index;
    }
}
