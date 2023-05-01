package Exercises.Second_Medium;
import java.util.*;
//648 单词替换
public class replace_words {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        WordNode head = generateTree(dictionary);
        StringBuilder stringBuilder = new StringBuilder();
        for(String word : words) {
            int index = hasRoot(head, word);
            if(index != -1) {
                stringBuilder.append(dictionary.get(index));
            }else {
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
    public WordNode generateTree(List<String> dictionary) {
        WordNode head = new WordNode();
        WordNode cur;
        int index = 0;
        for(String dict : dictionary) {
            cur = head;
            for(char ch : dict.toCharArray()) {
                if(cur.next == null) {
                    cur.next = new WordNode[26];
                }
                if(cur.next[ch - 'a'] == null) {
                    cur.next[ch - 'a'] = new WordNode();
                }
                cur = cur.next[ch - 'a'];
            }
            cur.isLeaf = true;
            if(cur.index == -1) {
                cur.index = index++;
            }
        }
        return head;
    }
    public int hasRoot(WordNode head, String word) {
        WordNode cur = head;
        for(char ch : word.toCharArray()) {
            if(cur.next == null || cur.next[ch - 'a'] == null) {
                break;
            }
            cur = cur.next[ch - 'a'];
            if(cur.isLeaf) {
                break;
            }
        }
        return cur.index;
    }
}
class WordNode {
    int index = -1;
    WordNode[] next;
    boolean isLeaf = false;
}