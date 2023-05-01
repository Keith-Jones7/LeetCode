package Exercises.Second_Medium;
import java.util.*;
//429 N叉树的层序遍历
public class n_ary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue1 = new ArrayDeque<>();
        Queue<Node> queue2 = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        queue1.add(root);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            if(queue1.isEmpty()) {
                while (!queue2.isEmpty()) {
                    Node cur = queue2.poll();
                    level.add(cur.val);
                    queue1.addAll(cur.children);
                }
            }else {
                while (!queue1.isEmpty()) {
                    Node cur = queue1.poll();
                    level.add(cur.val);
                    queue2.addAll(cur.children);
                }
            }
            list.add(level);
        }
        return list;
    }
}
class Node{
    public int val;
    public List<Node> children;
    public Node next;

    public Node() {

    }
    public Node(int val) {
        this.val = val;
    }
    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
