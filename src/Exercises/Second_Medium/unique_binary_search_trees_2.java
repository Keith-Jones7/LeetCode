package Exercises.Second_Medium;
import java.util.*;


//95 不同的二叉搜索树2
public class unique_binary_search_trees_2 {
    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }

    public List<TreeNode> generate(int min, int max) {
        List<TreeNode> list = new ArrayList<>();
        if(min > max) {
            list.add(null);
            return list;
        }
        for(int i = min; i <= max; i++) {
            List<TreeNode> left_list = generate(min, i - 1);
            List<TreeNode> right_list = generate(i + 1, max);
            for(TreeNode left_node : left_list) {
                for(TreeNode right_node : right_list) {
                    TreeNode root = new TreeNode(i);
                    root.left = left_node;
                    root.right = right_node;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
