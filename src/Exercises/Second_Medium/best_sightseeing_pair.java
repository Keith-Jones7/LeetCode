package Exercises.Second_Medium;
//1014 最佳观光组合
public class best_sightseeing_pair {
    public static int maxScoreSightseeingPair(int[] values){
        if(values.length == 2){
            return values[0] + values[1] - 1;
        }
        int max_value_1 = values[0];
        int dp = 0;
        int max = 0;
        for(int i = 1; i < values.length; i++){
            dp = max_value_1 + values[i] - i;
            max_value_1 = Math.max(max_value_1, values[i] + i);
            max = Math.max(dp, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] values = {8,1,5,2,6};
        maxScoreSightseeingPair(values);
    }
}
