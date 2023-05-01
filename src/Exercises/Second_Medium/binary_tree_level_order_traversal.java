package Exercises.Second_Medium;
import java.util.*;
//102 二叉树的层序遍历
public class binary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                assert cur != null;
                level.add(cur.val);
                if(cur.left != null) {
                    queue.add(cur.left);
                }
                if(cur.right != null) {
                    queue.add(cur.right);
                }
            }
            list.add(level);
        }
        return list;
    }
}
