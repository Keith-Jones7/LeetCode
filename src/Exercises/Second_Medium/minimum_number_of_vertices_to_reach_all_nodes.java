package Exercises.Second_Medium;
import java.util.*;
//1557 可以到达所有点的最少点数目
public class minimum_number_of_vertices_to_reach_all_nodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges){
        int[] count = new int[n];
        for(List<Integer> edge : edges){
            count[edge.get(1)]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(count[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}
