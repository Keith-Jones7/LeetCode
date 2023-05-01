package Exercises.Second_Medium;
import java.util.*;
//49 字母异位词分组
public class group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<Integer, Integer> map = new HashMap<>();
        List<List<String>> lists = new ArrayList<>();
        int index = 0;
        for(String str : strs){
            int code = anagramsCode(str);
            if(!map.containsKey(code)){
                map.put(code, index++);
                List<String> list = new ArrayList<>();
                list.add(str);
                lists.add(list);
            }
            else {
                List<String> list = lists.get(map.get(code));
                list.add(str);
            }
        }
        return lists;
    }
    public int anagramsCode(String str){
        char[] chars = str.toCharArray();
        int[] count = new int[26];
        for(char ch : chars){
            count[ch - 'a']++;
        }
        return Arrays.hashCode(count);
    }
}
