package Exercises.First_Easy;
//2047 句子中的有效单词数
public class number_of_valid_words_in_a_sentence {
    public int countValidWords(String sentence){
        String[] words = sentence.split(" ");
        int count = 0;
        for(String word : words){
            if(validWords(word)){
                System.out.println(word);
                count++;
            }
        }
        return count;
    }
    public boolean validWords(String word){
        char[] chars = word.toCharArray();
        int len = chars.length, count = 0;
        if(len == 0){
            return false;
        }
        if(chars[0] == '-'){
            return false;
        }
        if((chars[0] == '!' || chars[0] == ',' || chars[0] == '.' ||Character.isDigit(chars[0])) && len > 1){
            return false;
        }
        if(chars[len - 1] == '-' || Character.isDigit(chars[len - 1])){
            return false;
        }
        for(int i = 1; i < len - 1; i++){
            if(Character.isDigit(chars[i])){
                return false;
            }
            if((chars[i] == '!' || chars[i] == ',' || chars[i] == '.' )){
                return false;
            }
            if(chars[i] == '-'){
                count++;
                if(count > 1){
                    return false;
                }
                if((!Character.isLetter(chars[i - 1]) || !Character.isLetter(chars[i + 1]))){
                    return false;
                }
            }
        }
        return true;
    }
}
