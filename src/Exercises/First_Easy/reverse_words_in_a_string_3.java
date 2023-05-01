package Exercises.First_Easy;

//577 反转字符串中的单词
public class reverse_words_in_a_string_3 {
    public String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        ans.append(new StringBuffer().append(words[0]).reverse());
        for(int i = 1; i < words.length; i++){
            StringBuilder append = new StringBuilder();
            append.append(words[i]).append(" ");
            append.reverse();
            ans.append(append);
        }
        return ans.toString();
    }

}
