package Exercises.Second_Medium;
import java.util.*;
//676 实现一个魔法字典
public class implement_magic_dictionary {
    Map<Integer, Set<char[]>> map;
    public implement_magic_dictionary() {
        map = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {
        for(String word : dictionary) {
            int len = word.length();
            if(map.containsKey(len)) {
                map.get(len).add(word.toCharArray());
            }else {
                Set<char[]> set = new HashSet<>();
                set.add(word.toCharArray());
                map.put(len, set);
            }
        }
    }

    public boolean search(String searchWord) {
        int len = searchWord.length();
        if(!map.containsKey(len)) {
            return false;
        }
        Set<char[]> set = map.get(len);
        for(char[] chars: set) {
            if(countDiff(chars, searchWord.toCharArray(), len) == 1) {
                return true;
            }
        }
        return false;
    }
    public int countDiff(char[] origin, char[] target, int len) {
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(origin[i] != target[i]) {
                count++;
            }
        }
        return count;
    }
}
