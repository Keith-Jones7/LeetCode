package Exercises.First_Easy;
//1629 按键持续时间最长的键
public class slowest_ley {
    public char slowestKey(int[] releaseTimes, String keysPressed){
        int n = releaseTimes.length;
        char[] chars = keysPressed.toCharArray();
        int max_time = releaseTimes[0];
        char key = chars[0];
        for(int i = 1; i < n; i++){
            char temp_key = chars[i];
            int temp_time = (releaseTimes[i] - releaseTimes[i - 1]);
            if(temp_time > max_time || (temp_time == max_time && temp_key > key)){
                max_time = temp_time;
                key = temp_key;
            }
        }
        return key;
    }
}
