package Exercises.First_Easy;
//492 构造矩形
public class construct_the_rectangle {
    public int[] constructRectangle(int area) {
        int [] result = new int[2];
        for (int l= 1,w = area, gap = area; l <= Math.sqrt(area); l++) {
            if (area % l == 0) {
                w = area/l;
                if(Math.abs(l - w) < gap) {
                    result[0] = Math.max(l, w);
                    result[1] = Math.min(l, w);
                    gap = result[0] - result[1];
                }
            }
        }
        return result;
    }
}
