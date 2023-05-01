package Exercises.First_Easy;
//1022 从根到叶的二进制数之和
public class sum_of_root_to_leaf_binary_numbers {
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        traversal(root, 0);
        return sum;
    }
    public void traversal(TreeNode root, int val) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            sum += (val * 2 + root.val);
        }
        val = (val * 2 + root.val);
        traversal(root.left, val);
        traversal(root.right, val);
    }
}
