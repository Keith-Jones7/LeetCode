package Exercises.Second_Medium;
import java.util.*;
//919 完全二叉树插入器
public class complete_binary_tree_inserter {
    public TreeNode root;
    public Queue<TreeNode> queue;
    public TreeNode cur;
    public complete_binary_tree_inserter(TreeNode root) {
        this.root = root;
        Queue<TreeNode> temp = new ArrayDeque<>();
        queue = new ArrayDeque<>();
        temp.add(root);
        while (!temp.isEmpty()) {
            int size = temp.size();
            for(int i = 0; i < size; i++) {
                cur = temp.poll();
                assert cur != null;
                if(cur.left != null) {
                    temp.add(cur.left);
                }
                if(cur.right != null) {
                    temp.add(cur.right);
                }
                if(cur.left == null || cur.right == null) {
                    queue.add(cur);
                }
            }
        }
    }
    public int insert(int val) {
        cur = queue.peek();
        assert cur != null;
        TreeNode node = new TreeNode(val);
        if(cur.left == null) {
            cur.left = node;
        }else if(cur.right == null) {
            cur.right = node;
            queue.poll();
        }
        queue.add(node);
        return cur.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
