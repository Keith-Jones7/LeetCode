package Exercises.First_Easy;

import Exercises.First_Easy.TreeNode;

//543 二叉树的直径
public class diameter_of_binary_tree {
    private int max;
    public int diameterOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
        depth(root);
        return max;
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left_depth = depth(root.left);
        int right_depth = depth(root.right);
        max = Math.max(left_depth + right_depth, max);
        return Math.max(left_depth, right_depth) + 1;
    }
}
