package Exercises.First_Easy;
//997 小镇的法官
public class find_the_town_judge {
    public int findJudge(int n, int [][] trust){
        if(n == 1 && trust.length == 0){
            return 1;
        }
        if(trust.length == 0 || (n == 1 && trust.length > 0)){
            return -1;
        }
        int[] in_Degree = new int[n];
        int[] out_Degree = new int[n];
        for(int[] link : trust){
            int in = link[1] - 1;
            int out = link[0] - 1;
            in_Degree[in]++;
            out_Degree[out]++;
        }
        for(int i = 0; i < n; i++){
            if(out_Degree[i] == 0 && in_Degree[i] == n - 1){
                return i + 1;
            }
        }
        return -1;
    }
}
