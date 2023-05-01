package Exercises.Second_Medium;

import Exercises.Second_Medium.TreeNode;

import java.util.*;

//450 删除二叉搜索树中的节点
public class delete_node_in_a_bst {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        }
        if(root.val == key) {
            if(root.left == null && root.right == null) {
                return null;
            }
            if(root.left == null) {
                TreeNode right = searchRight(root.right);
                root.val = right.val;
                root.right = deleteNode(root.right, right.val);
            }else{
                TreeNode left = searchLeft(root.left);
                root.val = left.val;
                root.left = deleteNode(root.left, left.val);
            }
        }else if(root.val < key) {
            root.right = deleteNode(root.right, key);
        }else {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }
    public TreeNode searchRight(TreeNode root) {
        if(root.left == null) {
            return root;
        }
        return searchRight(root.left);
    }
    public TreeNode searchLeft(TreeNode root) {
        if(root.right == null) {
            return root;
        }
        return searchLeft(root.right);
    }
}
