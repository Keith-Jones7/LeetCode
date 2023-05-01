package Exercises.Second_Medium;
import java.util.*;
//211 添加与搜索单词-数据结构设计
public class design_add_and_search_words_data_structure {
    TreeNodeWord head;
    public design_add_and_search_words_data_structure() {
        head = new TreeNodeWord();
    }

    public void addWord(String word) {
        TreeNodeWord node = head;
        char[] chars = word.toCharArray();
        for (char ch : chars) {
            if(node.next == null) {
                node.next = new TreeNodeWord[26];
            }
            if (node.next[ch - 'a'] == null) {
                node.next[ch - 'a'] = new TreeNodeWord();
            }
            node = node.next[ch - 'a'];
        }
        node.end = true;
    }

    public boolean search(String word) {
        return DFS(word.toCharArray(), 0, head);
    }
    public boolean DFS(char[] chars, int index, TreeNodeWord node) {
        if(index == chars.length) {
            return node == null || node.end;
        }
        if(node == null || node.next == null) {
            return false;
        }
        if(chars[index] == '.') {
            boolean flag = false;
            for(int i = 0; i < 26; i++) {
                if(node.next[i] != null) {
                    flag |= DFS(chars, index + 1, node.next[i]);
                }
            }
            return flag;
        }else {
            return node.next[chars[index] - 'a'] != null && DFS(chars, index + 1, node.next[chars[index] - 'a']);
        }
    }
}
class TreeNodeWord {
    boolean end = false;
    TreeNodeWord[] next;
}
