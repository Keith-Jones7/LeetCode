package Exercises.First_Easy;
//389 找不同
public class find_the_difference {
    public char findTheDifference(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int ans = 0;
        for(int i = 0; i < chars1.length; i++) {
            ans ^= chars1[i] ^ chars2[i];
        }
        ans ^= chars2[chars2.length - 1];
        return (char) ans;
    }
}
