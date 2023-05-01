package Exercises.Second_Medium;

import java.util.LinkedList;
import java.util.Queue;

//1609 奇偶树
public class even_odd_tree {
    public boolean isEvenOddTree(TreeNode root){
        if(root.val % 2 == 0){
            return false;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2;
        queue1.add(root);
        int depth = 0;
        while(!queue1.isEmpty()){
            queue2 = nextDepth(queue1, depth);
            if(queue2 == null){
                return false;
            }
            queue1.clear();
            depth++;
            if(!queue2.isEmpty()){
                queue1 = nextDepth(queue2, depth);
                if(queue1 == null){
                    return false;
                }
                queue2.clear();
                depth++;
            }

        }
        return true;
    }
    public Queue<TreeNode> nextDepth(Queue<TreeNode> queue1, int depth){
        if(queue1.isEmpty()){
            return null;
        }
        Queue<TreeNode> queue2 = new LinkedList<>();
        TreeNode head = queue1.poll();
        if(head.left != null){
            queue2.add(head.left);
        }
        if(head.right != null){
            queue2.add(head.right);
        }
        int temp1 = head.val;
        if(!isSorted(temp1, depth)){
            return null;
        }
        while (!queue1.isEmpty()){
            TreeNode next = queue1.poll();
            int temp2 = next.val;
            if(!isSorted(temp1, temp2, depth)){
                return null;
            }
            if(next.left != null){
                queue2.add(next.left);
            }
            if(next.right != null){
                queue2.add(next.right);
            }
            temp1 = temp2;
        }
        return queue2;
    }
    public boolean isSorted(int temp1, int temp2, int depth){
        int temp = temp2 - temp1;
        if(depth % 2 == 0 && temp > 0 && temp2 % 2 == 1){
            return true;
        }
        return depth % 2 == 1 && temp < 0 && temp2 % 2 == 0;
    }
    public boolean isSorted(int temp, int depth){
        return (depth + temp) % 2 == 1;
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
