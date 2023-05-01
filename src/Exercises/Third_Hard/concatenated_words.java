package Exercises.Third_Hard;
import java.util.*;
//472 连接词
public class concatenated_words {
    public List<String> findAllConcatenatedWordsInADict(String[] words){
        Trie trie = new Trie();
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int len1 = s1.length(), len2 = s2.length();
                if(len1 == len2){
                    return 0;
                }
                if(len1 < len2){
                    return -1;
                }
                return 1;
            }
        });
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(word.length() == 0){
                continue;
            }
            if(trie.search(word)){
                list.add(word);
            }
            else {
                trie.insert(word);
            }
        }
        return list;
    }
    class Trie{
        TrieNode root;
        public Trie(){
            root = new TrieNode();
        }
        public void insert(String word){
            TrieNode cur = root;
            for(char ch : word.toCharArray()){
                if(cur.children[ch - 'a'] == null){
                    cur.children[ch - 'a'] = new TrieNode();
                }
                cur = cur.children[ch - 'a'];
            }
            cur.end = true;
        }
        public boolean search(String word){
            int count = 0;
            if(word.length() == 0){
                return true;
            }
            TrieNode cur = root;
            for(char ch : word.toCharArray()){
                if(cur.children[ch - 'a'] == null){
                    return false;
                }
                if(cur.children[ch - 'a'].end){
                    if(search(word.substring(count + 1))){
                        return true;
                    }
                }
                count++;
                cur = cur.children[ch - 'a'];
            }
            return false;
        }
    }
    class TrieNode{
        public TrieNode[] children = new TrieNode[26];
        boolean end = false;
    }
}
