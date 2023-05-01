package Exercises.Third_Hard;

import java.util.*;

//432 全O(1)的数据结构
public class all_oone_data_structure {
    TSNode head;
    Map<String, TSNode> map;
    public all_oone_data_structure() {
        map = new HashMap<>();
        head = new TSNode();
        head.left = head;
        head.right = head;
    }
    public void inc(String key) {
        if(map.containsKey(key)) {
            TSNode node = map.get(key);
            TSNode right = node.right;
            if(right == head || right.val > node.val + 1) {
                map.put(key, node.insert(new TSNode(key, node.val + 1)));
            } else {
                right.stringList.add(key);
                map.put(key, right);
            }
            node.stringList.remove(key);
            if(node.stringList.isEmpty()) {
                node.remove();
            }
        } else {
            if(head.right == head || head.right.val > 1) {
                map.put(key, head.insert(new TSNode(key, 1)));
            } else {
                head.right.stringList.add(key);
                map.put(key, head.right);
            }
        }
    }
    public void dec(String key) {
        TSNode node = map.get(key);
        if(node.val == 1) {
            map.remove(key);
        }else {
            TSNode left = node.left;
            if(left == head || left.val + 1 < node.val) {
                map.put(key, node.left.insert(new TSNode(key, node.val - 1)));
            } else {
                left.stringList.add(key);
                map.put(key, left);
            }
        }
        node.stringList.remove(key);
        if(node.stringList.isEmpty()) {
            node.remove();
        }
    }
    public String getMaxKey() {
        return head.left != null ? head.left.stringList.iterator().next() : "";
    }
    public String getMinKey() {
        return head.right != null ? head.right.stringList.iterator().next() : "";
    }
}
class TSNode{
    TSNode left;
    TSNode right;
    Set<String> stringList;
    int val;
    public TSNode() {
        this("", 0);
    }
    public TSNode(String key, int count) {
        this.val = count;
        stringList = new HashSet<>();
        stringList.add(key);
    }
    public TSNode insert(TSNode node) {
        node.left = this;
        node.right = this.right;
        node.left.right = node;
        node.right.left = node;
        return node;
    }
    public void remove() {
        this.left.right = this.right;
        this.right.left = this.left;
    }
}