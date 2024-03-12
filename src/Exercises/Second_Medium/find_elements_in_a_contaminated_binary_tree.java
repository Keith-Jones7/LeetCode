package Exercises.Second_Medium;

import java.util.*;
//1261 在受污染的二叉树中查找元素
public class find_elements_in_a_contaminated_binary_tree {
}
class FindElements {
    Set<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
        dfs(root, 0);
    }

    public void dfs(TreeNode node, int val) {
        if (node == null) {
            return;
        }
        node.val = val;
        set.add(val);
        dfs(node.left, 2 * val + 1);
        dfs(node.right, 2 * val + 2);
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}
