package Exercises.First_Easy;
//2582 递枕头
public class pass_the_pillow {
    public int passThePillow(int n, int time) {
        int val = time / (n - 1);
        int mod = time % (n - 1);
        if (val % 2 == 0) {
            return mod + 1;
        }else {
            return n - mod;
        }
    }
}
