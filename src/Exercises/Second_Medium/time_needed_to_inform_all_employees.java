package Exercises.Second_Medium;
import java.util.*;
//1376 通知所有员工所需的时间
public class time_needed_to_inform_all_employees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        MyTreeNode[] nodes = new MyTreeNode[n];
        for(int i = 0; i < n; i++) {
            nodes[i] = new MyTreeNode(i);
        }
        for(int i = 0; i < n; i++) {
            int parent = manager[i];
            if(parent != -1) {
                List<MyTreeNode> list = nodes[parent].children;
                if(list == null) {
                    list = new ArrayList<>();
                }
                list.add(nodes[i]);
                System.out.println(list.size());
                System.out.println(nodes[parent].children.size());
            }
        }
        int maxTime = 0;
        MyTreeNode root = nodes[headID];
        Queue<MyTreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        System.out.println(root.children);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                MyTreeNode node = queue.poll();
                assert node != null;
                if(node.children != null) {
                    System.out.println("aaa");
                    int time = informTime[node.ID] + node.time;
                    for(MyTreeNode child : node.children) {
                        child.time = time;
                        queue.add(child);
                    }
                    maxTime = Math.max(maxTime, time);
                }
            }
        }
        return maxTime;
    }
}
class MyTreeNode {
    int ID;
    int time;
    List<MyTreeNode> children;
    public MyTreeNode(int ID) {
        this.ID = ID;
    }
}
