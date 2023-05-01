package Exercises.Second_Medium;

import java.util.Stack;

//173 二叉搜索树迭代器
public class binary_search_tree_iterator {
    Stack<TreeNode> stack;
    public binary_search_tree_iterator(TreeNode root) {
        stack = new Stack<>();
        push(root);
    }
    public int next() {
        TreeNode ans = stack.pop();
        push(ans.right);
        return ans.val;
    }
    public boolean hasNext() {
        return !stack.empty();
    }
    public void push(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}
