package Exercises.First_Easy;
//1791 找出星型图的中心节点
public class find_center_of_star_graph {
    public int findCenter(int[][] edges){
        return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) ? edges[0][0] : edges[0][1];
    }
}
