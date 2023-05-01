package Exercises.Second_Medium;

import java.util.*;

//208 实现前缀树
public class implement_rie_prefix_tree {
    class Trie{
        TrieNode root;
        public Trie(){
            root = new TrieNode();
        }
        public void insert(String word){
            TrieNode cur = root;
            for(char ch : word.toCharArray()){
                if(cur.children.get(ch) == null){
                    cur.children.put(ch, new TrieNode());
                }
                cur = cur.children.get(ch);
            }
            cur.end = true;
        }
        public boolean search(String word){
            TrieNode cur = root;
            for(char ch : word.toCharArray()){
                if(cur.children.get(ch) == null){
                    return false;
                }
                cur = cur.children.get(ch);
            }
            return cur.end;
        }
        public boolean startsWith(String prefix){
            TrieNode cur = root;
            for(char ch : prefix.toCharArray()){
                if(cur.children.get(ch) == null){
                    return false;
                }
                cur = cur.children.get(ch);
            }
            return true;
        }
    }
    class TrieNode{
        public Map<Character, TrieNode> children = new HashMap<>();
        boolean end;
    }

}
