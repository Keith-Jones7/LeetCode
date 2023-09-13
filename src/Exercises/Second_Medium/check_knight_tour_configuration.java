package Exercises.Second_Medium;
//2596 检查骑士巡视方案
public class check_knight_tour_configuration {
    public boolean checkValidGrid(int[][] grid) {
        int len = grid.length;
        GridNode[] nodes = new GridNode[len * len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                nodes[grid[i][j]] = new GridNode(i, j);
            }
        }
        if (nodes[0].x != 0 || nodes[0].y != 0) {
            return false;
        }
        int prex = 0, prey = 0;
        for (int i = 1; i < nodes.length; i++) {
            int x = nodes[i].x;
            int y = nodes[i].y;
            if (x == prex || y == prey || (Math.abs(x - prex) + Math.abs(y - prey) != 3)) {
                return false;
            }
            prex = x;
            prey = y;
        }
        return true;
    }
}
class GridNode {
    int x;
    int y;
    public GridNode(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
