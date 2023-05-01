package Exercises.Second_Medium;

import java.util.Stack;

//851 喧闹和富有
public class loud_and_rich {
    boolean[] visit;
    int[] answer;
    int[] min_quiet;
    public int[] loudAndRich(int[][] richer, int[] quiet){
        answer = new int[quiet.length];
        int[][] graph = new int[quiet.length][quiet.length];
        visit = new boolean[quiet.length];
        min_quiet = new int[quiet.length];
        for(int i = 0; i < richer.length; i++){
            graph[richer[i][1]][richer[i][0]] = 1;
        }
        for(int i = 0; i < quiet.length; i++){
            answer[i] = i;
            visit[i] = false;
            min_quiet[i] = quiet[i];
        }
        DFS(graph, quiet);
        return answer;
    }
    public void DFS(int[][] graph, int[] quiet){
        for(int i = 0; i < graph.length; i++){
            if(!visit[i]){
                visit[i] = true;
                Stack<Integer> stack = new Stack<>();
                for(int j = 0; j < graph.length; j++){
                    if(graph[i][j] == 1){
                        if(visit[j]){
                            if(min_quiet[j] < min_quiet[i]){
                                answer[i] = answer[j];
                                min_quiet[i] = min_quiet[j];
                            }
                        }
                        else {
                            stack.push(j);
                        }
                    }
                }

                while (!stack.isEmpty()){
                    int person = stack.pop();
                    if(quiet[person] < min_quiet[i]){
                        answer[i] = person;
                        min_quiet[i] = quiet[person];
                    }
                    for(int k = 0; k < quiet.length; k++){
                        if(!visit[k] && graph[person][k] == 1){
                            stack.push(k);
                        }
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
         loud_and_rich ld = new loud_and_rich();
         int[][] richer = {{0,1},{1,2}};
         int[] quiet = {0,2,1};
         ld.loudAndRich(richer, quiet);
    }
}
