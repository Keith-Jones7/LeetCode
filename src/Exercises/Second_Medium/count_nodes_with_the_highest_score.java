package Exercises.Second_Medium;
//2049 统计最高分的节点数目
public class count_nodes_with_the_highest_score {
    public int countHighestScoreNodes(int[] parents) {
        int len = parents.length;
        TreeNode2[] nodes = new TreeNode2[len];
        for(int i = 0; i < len; i++) {
            nodes[i] = new TreeNode2();
        }
        for(int i = 1; i < len; i++) {
            if(nodes[parents[i]].left == null) {
                nodes[parents[i]].left = nodes[i];
            }
            else {
                nodes[parents[i]].right = nodes[i];
            }
        }
        nodes[0].count(nodes[0]);
        long max = -1;
        int count = 0;
        for(int i = 0; i < len; i++) {
            long left = nodes[i].leftCount;
            long right = nodes[i].rightCount;
            long multi = Math.max(1, left) * Math.max(1, right) * Math.max(1, len - left - right - 1);
            if(multi > max) {
                max = multi;
                count = 1;
            }
            else if(multi == max) {
                count++;
            }
        }
        return count;
    }
}
class TreeNode2 {
    TreeNode2 left;
    TreeNode2 right;
    long leftCount;
    long rightCount;
    public TreeNode2() {

    }
    public long count(TreeNode2 root) {
        if(root == null) {
            return 0;
        }
        root.leftCount = count(root.left);
        root.rightCount = count(root.right);
        return root.leftCount + root.rightCount + 1;
    }
}

