package Exercises.Second_Medium;
import java.util.*;
//515 在每个树行中找最大值
public class find_largest_value_in_each_tree_row {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                max = Math.max(max, node.val);
            }
            ans.add(max);
        }
        return ans;
    }
}
