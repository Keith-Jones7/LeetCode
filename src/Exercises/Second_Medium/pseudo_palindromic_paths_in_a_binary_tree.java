package Exercises.Second_Medium;
import java.util.*;
//1457 二叉树中的伪回文路径
public class pseudo_palindromic_paths_in_a_binary_tree {
    int cnt = 0;
    public int pseudoPalindromicPaths(TreeNode root) {
        dfs(root, 0);
        return cnt;
    }
    public void dfs(TreeNode root, int flag) {
        int val = root.val;
        int tempFlag = flag ^ (1 << val);
        if (root.left == null && root.right == null) {
            if ((tempFlag & (tempFlag - 1)) == 0) {
                cnt++;
            }
        }else if (root.left == null) {
            dfs(root.right, tempFlag);
        }else if (root.right == null) {
            dfs(root.left, tempFlag);
        }else {
            dfs(root.left, tempFlag);
            dfs(root.right, tempFlag);
        }
    }
}
