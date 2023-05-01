package Exercises.First_Easy;
//1725 可以形成最大正方形的矩形数目
public class number_of_rectangles_that_can_form_the_largest_square {
    public int countRectangles(int[][] rectangles){
        int count = 0, max_side = 0;
        for(int[] side : rectangles){
            int max = Math.min(side[0], side[1]);
            if(max > max_side){
                count = 1;
                max_side = max;
            }
            else if(max_side == max){
                count++;
            }
        }
        return count;
    }
}
