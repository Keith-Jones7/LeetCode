package Exercises.Second_Medium;
//1448 统计二叉树中好节点的数目
public class count_good_nodes_in_binary_tree {
    int cnt;
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return cnt;
    }

    public void dfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        max = Math.max(max, root.val);
        if (root.val >= max) {
            cnt++;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }
}
