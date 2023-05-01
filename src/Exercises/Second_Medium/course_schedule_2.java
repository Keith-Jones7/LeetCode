package Exercises.Second_Medium;


import java.util.Stack;
import java.util.stream.IntStream;

//210 课程表2
public class course_schedule_2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        TempNode[] nodes = new TempNode[numCourses];
        int[] Degrees = new int[numCourses];
        for(int i = 0; i < nodes.length; i++){
            nodes[i] = new TempNode(i);
        }
        IntStream.range(0, prerequisites.length).forEach(i -> {
            int pre = prerequisites[i][0];
            int after = prerequisites[i][1];
            Degrees[after]++;
            TempNode node = new TempNode(after);
            nodes[pre].add(nodes[pre], node);
        });
        return order(nodes, Degrees);
    }
    public int[] order(TempNode[] nodes, int[] Degrees){
        int[] Order = new int[nodes.length];
        Stack<TempNode> stack = new Stack<>();
        for(int i = 0; i < nodes.length; i++){
            if(Degrees[i] == 0 && nodes[i] != null){
                stack.push(nodes[i]);
            }
        }
        int count = 0;
        while (!stack.isEmpty()){
            TempNode node = stack.pop();
            Order[count] = node.val;
            while(node.next != null){
                node = node.next;
                int next = node.val;
                Degrees[next]--;
                if(Degrees[next] == 0){
                    stack.push(nodes[next]);
                }
            }
            count++;
        }
        if(count != nodes.length){
            return new int[]{ };
        }
        else {
            return Order;
        }
    }
}
