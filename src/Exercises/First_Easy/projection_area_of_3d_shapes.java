package Exercises.First_Easy;
//883 三维形体投影面积
public class projection_area_of_3d_shapes {
    public int projectionArea(int[][] grid) {
        int areaX = 0;
        int areaY = 0;
        int areaZ = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxY = -1;
            int maxX = -1;
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] > 0) {
                    areaZ++;
                }
                if(grid[i][j] > maxY) {
                    maxY = grid[i][j];
                }
                if(grid[j][i] > maxX) {
                    maxX = grid[j][i];
                }
            }
            areaY += maxY;
            areaX += maxX;
        }
        return areaX + areaY + areaZ;
    }
}
