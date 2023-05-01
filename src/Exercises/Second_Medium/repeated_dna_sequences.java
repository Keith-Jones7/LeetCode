package Exercises.Second_Medium;
import java.util.*;
//187 重复的DNA序列
public class repeated_dna_sequences {
    public List<String> findRepeatedDnaSequences(String s){
        if(s.length() < 10 || s.length() > 10000){
            return List.of();
        }
        Set<String> set = new HashSet<>(), result = new HashSet<>();
        for(int i = 0; i <= s.length() - 10; i++){
            String str = s.substring(i, i + 10);
            if(!set.add(str)){
                result.add(str);
            }
        }
        return new ArrayList<>(result);
    }
}
