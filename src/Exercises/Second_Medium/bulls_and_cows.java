package Exercises.Second_Medium;
//299 猜数字游戏

public class bulls_and_cows {
    public String getHint(String secret, String guess) {
        int count_A = 0, count_B = 0;
        int[] nums = new int[10];
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                count_A++;
            }
            else {
                if(nums[guess.charAt(i) - '0']-- > 0){
                    count_B++;
                }
                if(nums[secret.charAt(i) - '0']++ < 0){
                    count_B++;
                }
            }
        }
        return count_A + "A" + count_B + "B";
    }

    public static void main(String[] args) {
        String secret = "011";
        String guess = "110";
        bulls_and_cows bc = new bulls_and_cows();
        String result = bc.getHint(secret, guess);
    }
}
