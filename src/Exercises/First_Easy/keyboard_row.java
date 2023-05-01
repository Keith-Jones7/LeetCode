package Exercises.First_Easy;
//500 键盘行
import java.util.ArrayList;
import java.util.Hashtable;

public class keyboard_row {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
        String[] s = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        for(int i = 0; i < s[0].length(); i++) {
            table.put(s[0].charAt(i), 1);
            if(i < s[1].length())   table.put(s[1].charAt(i), 2);
            if(i < s[2].length())   table.put(s[2].charAt(i), 3);
        }
        for(int i = 0; i < words.length; i++) {
            boolean judge = true;
            int key = 0;
            for(int j = 0; j < words[i].length() - 1; j++) {
                judge = judge & (table.get(words[i].charAt(j)) == table.get(words[i].charAt(j + 1)));
            }
            if(judge)   result.add(words[i]);
        }
        return result.toArray(new String[0]);
    }
}
