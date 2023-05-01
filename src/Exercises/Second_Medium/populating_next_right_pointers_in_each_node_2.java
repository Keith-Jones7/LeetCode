package Exercises.Second_Medium;

import java.util.*;

//117 填充每个节点的下一个右侧节点指针2
public class populating_next_right_pointers_in_each_node_2 {
    private class Node{
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node(){

        }
        public Node(int _val){
            val = _val;
        }
        public Node(int _val, Node _left, Node _right, Node _next){
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }
        if(root.left != null && root.right != null) {
            root.left.next = root.right;
        }else if(root.left != null)  {
            root.left.next = getNext(root.next);
        }else if(root.right != null) {
            root.right.next = getNext(root.next);
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
    public Node getNext(Node root) {
        if(root == null) {
            return null;
        }
        if(root.left != null) {
            return root.left;
        }
        if(root.right != null) {
            return root.right;
        }
        return getNext(root.next);
    }
}
