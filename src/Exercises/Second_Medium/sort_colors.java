package Exercises.Second_Medium;
//75 颜色排序
public class sort_colors {
    public void sortColors(int[] nums){
        int index1 = 0, index2 = 1, index3 = 2;
        for(int num : nums){
            if(num == 0){
                nums[index3++] = 2;
                nums[index2++] = 1;
                nums[index1++] = 0;
            }
            else if(num == 1){
                nums[index3++] = 2;
                nums[index2++] = 1;
            }
            else {
                nums[index3++] = 2;
            }
        }
    }
}
