package Exercises.First_Easy;

import java.util.*;

//506 相对名次
public class relative_ranks {
    public static String[] findRelativeRanks(int[] score){
        String[] results = new String[score.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < score.length; i++){
            map.put(score[i], i);
        }
        Arrays.sort(score);
        for(int i = score.length - 1; i >= 0; i--){
            if(i == score.length - 1){
                results[map.get(score[i])] = "Gold Medal";
                continue;
            }
            if(i == score.length - 2){
                results[map.get(score[i])] = "Silver Medal";
                continue;
            }
            if(i == score.length - 3){
                results[map.get(score[i])] = "Bronze Medal";
                continue;
            }
            results[map.get(score[i])] = (score.length - i) + "";
        }
        return results;
    }

    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        findRelativeRanks(score);
    }
}
