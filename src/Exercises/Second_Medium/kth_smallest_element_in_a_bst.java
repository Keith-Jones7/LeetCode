package Exercises.Second_Medium;

import java.util.*;

//230 二叉搜索树中的第K小的元素
public class kth_smallest_element_in_a_bst {
    Stack<Integer> stack = new Stack<>();
    int K;
    public int kthSmallest(TreeNode root, int k) {
        K = k;
        inOrder(root);
        return stack.peek();
    }
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        if(stack.size() == K) {
            return;
        }
        stack.push(root.val);

        inOrder(root.right);
    }
}
