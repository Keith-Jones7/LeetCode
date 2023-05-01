package Exercises.Third_Hard;

import java.util.*;

//1345 跳跃游戏4
public class jump_game_4 {
    public int minJumps(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        if(len == 1){
            return 0;
        }
        int[] dp = new int[len];
        map.put(arr[0], 0);
        dp[0] = 0;
        boolean change;
        do{
            change = true;
            for(int i = 1; i < len - 1; i++){
                int num = arr[i];
                if(!map.containsKey(num)){
                    if(dp[i + 1] == 0){
                        dp[i] = dp[i - 1] + 1;
                    }
                    else {
                        dp[i] = Math.min(dp[i - 1], dp[i + 1]) + 1;
                    }
                    map.put(num, dp[i]);
                    change = false;
                }
                else {
                    int temp = dp[i];
                    dp[i] = Math.min(Math.min(map.get(num) + 1, dp[i - 1] + 1),
                            Math.min(dp[i] == 0 ? Integer.MAX_VALUE : dp[i], dp[i + 1] == 0 ? Integer.MAX_VALUE : (dp[i + 1] + 1)));
                    if(temp != dp[i]){
                        change = false;
                    }
                    map.put(num, Math.min(map.get(num), dp[i]));
                }
            }
        }
        while (!change);
        return Math.min(dp[len - 2], map.getOrDefault(arr[len - 1], Integer.MAX_VALUE)) + 1;
    }
}
