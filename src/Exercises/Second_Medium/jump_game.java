package Exercises.Second_Medium;
//55 跳跃游戏
public class jump_game {
    public boolean canJump(int[] nums){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if( i <= max){
                max = Math.max(max, nums[i] + i);
            }
        }
        return max >= nums.length - 1;
    }
}
