package Exercises.Second_Medium;

//318 最大单词长度乘积
public class maximum_product_of_word_length {
    public int maxProduct(String[] words){
        int[] count = new int[words.length];
        int max_length = 0;
        for(int i = 0; i < words.length; i++){
            char[] word = words[i].toCharArray();
            for (char c : word) {
                int pow = (int) Math.pow(2, c - 'a');
                if ((count[i] & pow) == 0) {
                    count[i] += pow;
                }
            }
        }
        for(int i = 0; i < words.length; i++){
            for(int k = i + 1; k < words.length; k++){
                if((count[k] & count[i]) == 0){
                    max_length = Math.max(max_length, words[k].length() * words[i].length());
                }
            }
        }
        return max_length;
    }
}
