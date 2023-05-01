package Exercises.Second_Medium;
//784 字母大小写全排列
import java.util.*;
public class letter_case_permutation {
    public List<String> letterCasePermutation(String s){
        char[] chars = s.toCharArray();
        int count = 0;
        for(char ch : chars){
            if(Character.isLetter(ch)){
                count++;
            }
        }
        int max = 1 << count;
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < max; i++){
            int b = 0;
            StringBuilder stringBuilder = new StringBuilder();
            for(char ch : chars){
                if(Character.isLetter(ch)){
                    if(((i >> b++) & 1) == 1){
                        stringBuilder.append(Character.toLowerCase(ch));
                    }
                    else {
                        stringBuilder.append(Character.toUpperCase(ch));
                    }
                }
                else {
                    stringBuilder.append(ch);
                }
            }
            ans.add(stringBuilder.toString());
        }
        return ans;
    }

}
