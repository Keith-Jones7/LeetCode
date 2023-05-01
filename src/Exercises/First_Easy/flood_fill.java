package Exercises.First_Easy;
//773 图像渲染
public class flood_fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        int row = image.length, col = image[0].length;
        int[] stack = new int[row * col];
        int stack_index = 0, oldColor = image[sr][sc];
        if(oldColor == newColor){
            return image;
        }
        stack[0] = sr + sc * 100;
        while (stack_index >= 0){
            int x = stack[stack_index] % 100;
            int y = stack[stack_index] / 100;
            image[x][y] = newColor;
            stack_index--;
            if((x + 1) < row && image[x + 1][y] == oldColor){
                stack[++stack_index] = (x + 1) + y * 100;
            }
            if((x - 1) >= 0 && image[x - 1][y] == oldColor){
                stack[++stack_index] = (x - 1) + y * 100;
            }
            if((y + 1) < col && image[x][y + 1] == oldColor){
                stack[++stack_index] = x + (y + 1) * 100;
            }
            if((y - 1) >= 0 && image[x][y - 1] == oldColor){
                stack[++stack_index] = x + (y - 1) * 100;
            }
        }
        return image;
    }
}
