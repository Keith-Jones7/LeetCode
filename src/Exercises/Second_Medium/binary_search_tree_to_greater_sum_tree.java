package Exercises.Second_Medium;

import java.util.*;
import java.util.Arrays;

//1038 从二叉搜索树到更大和数
public class binary_search_tree_to_greater_sum_tree {
    int tempSum;
    public TreeNode bstToGst(TreeNode root) {
        tempSum = 0;
        inOrder(root);
        return root;
    }
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.right);
        tempSum += root.val;
        root.val = tempSum;
        inOrder(root.left);
    }
}
