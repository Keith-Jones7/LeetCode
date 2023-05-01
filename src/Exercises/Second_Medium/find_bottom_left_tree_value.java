package Exercises.Second_Medium;
import java.util.*;
//513 找树左下角的值
public class find_bottom_left_tree_value {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode left = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean flag = false;
            TreeNode temp = queue.peek();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                if(node.left != null) {
                    flag = true;
                    queue.add(node.left);
                }
                if(node.right != null) {
                    flag = true;
                    queue.add(node.right);
                }
            }
            if(flag) {
                left = temp;
            }
        }
        assert left != null;
        return left.val;
    }
}
