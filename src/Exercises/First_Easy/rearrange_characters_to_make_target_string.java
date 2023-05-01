package Exercises.First_Easy;
//2287 重排字符串形成目标字符串
public class rearrange_characters_to_make_target_string {
    public int rearrangeCharacters(String s, String target) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char ch : s.toCharArray()) {
            count2[ch - 'a']++;
        }
        for (char ch : target.toCharArray()) {
            count1[ch - 'a']++;
        }
        int min = 1000;
        for (int i = 0; i < 26; i++) {
            if (count1[i] != 0) {
                min = Math.min(min, count2[i] / count1[i]);
            }
        }
        return min;
    }
}
