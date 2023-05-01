package Exercises.First_Easy;

//953 验证外星语词典
public class verifying_an_alien_dictionary {
    int[] dict = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        char[] orders = order.toCharArray();
        for(int i = 0; i < orders.length; i++) {
            dict[orders[i] - 'a'] = i;
        }
        for(int i = 1; i < words.length; i++) {
            if(compareWords(words[i], words[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }
    public int compareWords(String word1, String word2) {
        int index1 = 0, index2 = 0;
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        while(index1 < chars1.length || index2 < chars2.length) {
            if(index1 == chars1.length) {
                return -1;
            }
            if(index2 == chars2.length) {
                return 1;
            }
            int val1 = dict[chars1[index1++] - 'a'];
            int val2 = dict[chars2[index2++] - 'a'];
            if(val1 < val2) {
                return -1;
            }else if(val1 > val2) {
                return 1;
            }
        }
        return 0;
    }
}
