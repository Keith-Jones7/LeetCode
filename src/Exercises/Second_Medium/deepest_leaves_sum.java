package Exercises.Second_Medium;
import java.util.*;
//1302 层数最深叶子节点的和
public class deepest_leaves_sum {
    int maxDepth = 1;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        bfs(root, 1);
        return sum;
    }
    public void bfs(TreeNode root, int depth) {
        if (root == null) {
           return;
        }
        bfs(root.left, depth + 1);
        bfs(root.right, depth + 1);
        if (depth > maxDepth) {
            maxDepth = depth;
            sum = root.val;
        }else if(depth == maxDepth) {
            sum += root.val;
        }
    }
}
