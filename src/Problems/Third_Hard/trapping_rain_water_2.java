package Problems.Third_Hard;
//407 接雨水2
public class trapping_rain_water_2 {
    public int trapRainWater(int[][] heightMap)
    {
        int count = 0;
        if(heightMap.length < 3 || heightMap[0].length < 3)
            return 0;
        int m = heightMap.length;
        int n = heightMap[0].length;
        int[][] water = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    water[i][j] = heightMap[i][j];
                }
            }
        }
        for(int i = 1; i < m - 1; i++) {
            for(int j = 1; j < n - 1; j++) {
                water[i][j] = Math.max(heightMap[i][j], Math.min(Math.min(water[i - 1][j], water[i + 1][j]), Math.min(water[i][j - 1], water[i][j+1])));
                count = count + (water[i][j] - heightMap[i][j]);
            }
        }
        return count;
    }
}
