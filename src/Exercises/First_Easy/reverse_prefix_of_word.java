package Exercises.First_Easy;
//2000 反转单词前缀
public class reverse_prefix_of_word {
    public String reversePrefix(String word, char ch){
        char[] chars = word.toCharArray();
        boolean flag = false;
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: chars){
            if(flag){
                stringBuilder.append(c);
            }
            else{
                stringBuilder.insert(0, c);
            }
            if(c == ch){
                flag = true;
            }
        }
        if(!flag){
            return word;
        }
        else {
            return stringBuilder.toString();
        }
    }
}
