package Exercises.First_Easy;
//2331 计算布尔二叉树的值
public class evaluate_boolean_binary_tree {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {
            return root.val == 1;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        }else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
