package Exercises.Second_Medium;
//1145 二叉树着色游戏
public class binary_tree_coloring_game {
    TreeNode cur;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        preOrder(root, x);
        int left_count = countSubTree(cur.left);
        int right_count = countSubTree(cur.right);
        int parent_count = n - left_count - right_count - 1;
        return Math.max(Math.max(left_count, right_count), parent_count) > n / 2;
    }

    public void preOrder(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        if (root.val == target) {
            cur = root;
        }else {
            preOrder(root.left, target);
            preOrder(root.right, target);
        }
    }

    public int countSubTree(TreeNode root) {
        if (root == null) {
            return 0;
        }else {
            return 1 + countSubTree(root.left) + countSubTree(root.right);
        }
    }
}
