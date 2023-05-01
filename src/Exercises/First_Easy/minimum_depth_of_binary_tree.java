package Exercises.First_Easy;

import java.util.*;

//111 二叉树的最小深度
public class minimum_depth_of_binary_tree {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        int depth = 0;
        if(root == null) {
            return depth;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                assert cur != null;
                if(cur.left == null && cur.right == null) {
                    return depth;
                }
                if(cur.left != null) {
                    queue.add(cur.left);
                }
                if(cur.right != null) {
                    queue.add(cur.right);
                }
            }
        }
        return depth;
    }
}
