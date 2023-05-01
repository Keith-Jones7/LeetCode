package Exercises.Third_Hard;
//458 可怜的小猪
public class poor_pigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest){
        return (int)Math.ceil(Math.log(buckets)/Math.log(minutesToTest/minutesToDie + 1));
    }
}
