package Exercises.Second_Medium;
//面试题 17.11. 单词距离
public class find_closest_lcci {
    public int findClosest(String[] words, String word1, String word2) {
        int index1 = -1, index2 = -1, gap = words.length;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(word1)) {
                index1 = i;
                if(index2 >= 0) {
                    gap = Math.min(gap, (Math.abs(index2 - index1)));
                }
                if(gap == 1) {
                    return 1;
                }
            }else if(words[i].equals(word2)) {
                index2 = i;
                if(index1 >= 0) {
                    gap = Math.min(gap, (Math.abs(index2 - index1)));
                }
                if(gap == 1) {
                    return 1;
                }
            }
        }
        return gap;
    }
}
