package Exercises.Second_Medium;
//45 跳跃游戏2
public class jump_game_2 {
    public int jump(int[] nums){
        int[] count = new int[nums.length];
        count[0] = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; (j <= (i + nums[i])) && j < nums.length; j++){
                if(count[j] == 0){
                    count[j] = count[i] + 1;
                }
                else {
                    count[j] = Math.min(count[i] + 1, count[j]);
                }
            }
        }
        return count[nums.length - 1];
    }
}
