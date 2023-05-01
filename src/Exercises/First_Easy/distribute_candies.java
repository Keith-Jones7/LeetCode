package Exercises.First_Easy;
//575 分糖果
import java.util.HashSet;

public class distribute_candies {
    public int distributeCandies(int [] candyType) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:candyType){
            set.add(i);
        }
        return Math.min(candyType.length/2, set.size());
    }
}
