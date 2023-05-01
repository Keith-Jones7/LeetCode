package Exercises.First_Easy;
//1688 比赛的次数
public class count_of_matches_in_tournament {
    public int numberOfMatches(int n){
        if(n <= 2){
            return n - 1;
        }
        if(n % 2 == 0){
            return n / 2 + numberOfMatches(n / 2);
        }
        return (n / 2) + numberOfMatches((n + 1) / 2);
    }
    public int numberOfMatches2(int n){
        return n - 1;
    }
}
