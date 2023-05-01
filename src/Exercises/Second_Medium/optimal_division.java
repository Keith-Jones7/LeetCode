package Exercises.Second_Medium;
//553 最优除法
public class optimal_division {
    public String optimalDivision(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nums[0]);
        if(nums.length == 1) {
            return stringBuilder.toString();
        }
        if(nums.length == 2) {
            return stringBuilder.append('/').append(nums[1]).toString();
        }
        stringBuilder.append("/(");
        for(int i = 1; i < nums.length; i++) {
            stringBuilder.append(nums[i]);
            stringBuilder.append('/');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
