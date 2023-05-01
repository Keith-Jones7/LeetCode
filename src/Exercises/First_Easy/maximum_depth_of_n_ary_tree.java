package Exercises.First_Easy;
//559 N叉树的最大深度
import java.util.*;
public class maximum_depth_of_n_ary_tree {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int max = 0;
        for(Node child: root.children){
            max = Math.max(maxDepth(child), max);
        }
        return 1 + max;
    }
}
class Node{
    public int val;
    public List<Node> children;
    public Node(){

    }
    public Node(int _val){
        val = _val;
    }
    public Node(int _val, List<Node> _children){
        val = _val;
        children = _children;
    }
}
