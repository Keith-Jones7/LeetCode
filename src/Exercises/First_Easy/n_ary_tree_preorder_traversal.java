package Exercises.First_Easy;
//589 N叉树的前序遍历
import java.util.*;
public class n_ary_tree_preorder_traversal {
    List<Integer> ans;
    public List<Integer> preorder(Node root) {
        ans = new ArrayList<>();
        preOrder(root);
        return ans;
    }
    public void preOrder(Node root) {
        if(root == null) {
            return;
        }
        ans.add(root.val);
        for(Node node : root.children) {
            preOrder(node);
        }
    }
}
