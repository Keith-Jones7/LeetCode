package Exercises.Second_Medium;

import java.util.Stack;
import java.util.stream.IntStream;

//207 课程表
public class course_schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        TempNode[] nodes = new TempNode[numCourses];
        int[] Degrees = new int[numCourses];
        for(int i = 0; i < nodes.length; i++){
            nodes[i] = new TempNode(i);
        }
        IntStream.range(0, prerequisites.length).forEach(i -> {
            int pre = prerequisites[i][1];
            int after = prerequisites[i][0];
            Degrees[after]++;
            TempNode node = new TempNode(after);
            nodes[pre].add(nodes[pre], node);
        });
        return hasCycle(nodes, Degrees);
    }
    public boolean hasCycle(TempNode[] nodes, int[] Degrees){
        Stack<TempNode> stack = new Stack<>();
        for(int i = 0; i < nodes.length; i++){
            if(Degrees[i] == 0 && nodes[i] != null){
                stack.push(nodes[i]);
            }
        }
        int count = 0;
        while (!stack.isEmpty()){
            TempNode node = stack.pop();
            count++;
            while(node.next != null){
                node = node.next;
                int next = node.val;
                Degrees[next]--;
                if(Degrees[next] == 0){
                    stack.push(nodes[next]);
                }
            }
        }
        return count >= nodes.length;
    }
}
class TempNode{
    int val;
    TempNode next;
    TempNode(int val){
        this.val = val;
    }

    public void add(TempNode head, TempNode node){
        TempNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
}

