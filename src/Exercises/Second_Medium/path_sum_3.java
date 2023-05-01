package Exercises.Second_Medium;
//437 路径总和3
public class path_sum_3 {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        dfs2(root, targetSum);
        return count;
    }
    public void dfs1(TreeNode root, long targetSum) {
        if(root == null) {
            return;
        }
        if(root.val == targetSum) {
            count++;
        }
        dfs1(root.left, targetSum - root.val);
        dfs1(root.right, targetSum - root.val);
    }
    public void dfs2(TreeNode root, int targetSum) {
        if(root == null) {
            return;
        }
        dfs1(root, targetSum);
        dfs2(root.left, targetSum);
        dfs2(root.right, targetSum);
    }
}
