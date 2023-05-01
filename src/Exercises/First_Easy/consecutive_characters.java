package Exercises.First_Easy;

//1446 连续字符
public class consecutive_characters {
    public static int maxPower(String s){
        char[] chs = s.toCharArray();
        int max = 1, local_max = 1;
        for(int i = 1; i < chs.length; i++){
            if(chs[i] == chs[i - 1]){
                local_max++;
            }
            else {
                local_max = 1;
            }
            max = Math.max(max, local_max);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
