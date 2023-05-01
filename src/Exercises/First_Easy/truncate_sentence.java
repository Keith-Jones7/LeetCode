package Exercises.First_Easy;
//1816 截断句子
public class truncate_sentence {
    public String truncateSentence(String s, int k){
        int index = 0;
        int count_space = 0;
        for(int i = 0; i < s.length()&&count_space < k; i++){
            if(s.charAt(i) == ' '){
                count_space++;
                index = i;
            }
        }
        if(count_space < k){
            return s;
        }
        return s.substring(0, index);
    }
}
