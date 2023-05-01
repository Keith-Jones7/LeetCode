package Exercises.First_Easy;
import java.util.*;
//590 N叉树的后序遍历
public class n_ary_tree_postorder_traversal {
    List<Integer> list;
    public List<Integer> postorder(Node root) {
        list = new ArrayList<>();
        post(root);
        return list;
    }
    public void post(Node root) {
        if(root == null) {
            return;
        }
        for(Node child : root.children) {
            post(child);
            list.add(child.val);
        }
        list.add(root.val);
    }
}
