package Exercises.Second_Medium;
//116 填充每个节点的下一个右侧节点指针
public class populating_next_right_pointers_in_each_node {
    private class Node{
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node(){

        }
        public Node(int _val){
            val = _val;
        }
        public Node(int _val, Node _left, Node _right, Node _next){
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root){
        if(root == null){
            return null;
        }
        if(root.left == null){
            return root;
        }
        root.left.next = root.right;
        if(root.next != null){
            root.right.next = root.next.left;
        }
        root.left = connect(root.left);
        root.right = connect(root.right);
        return root;
    }
}

