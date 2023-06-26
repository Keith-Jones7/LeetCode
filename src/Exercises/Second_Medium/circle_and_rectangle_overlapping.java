package Exercises.Second_Medium;

public class circle_and_rectangle_overlapping {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if (xCenter >= x1 && xCenter <= x2 && yCenter >= y1 && yCenter <= y2) {
            return true;
        }
        int[] x = {x1, x2};
        int[] y = {y1, y2};
        for (int i = 0; i < 2; i++) {
            if (yCenter >= y1 && yCenter <= y2 && Math.abs(xCenter - x[i]) <= radius) {
                return true;
            }
            if (xCenter >= x1 && xCenter <= x2 && Math.abs(yCenter - y[i]) <= radius) {
                return true;
            }
            for (int j = 0; j < 2; j++) {
                if ((xCenter - x[i]) * (xCenter - x[i]) + (yCenter - y[j]) * (yCenter - y[j]) <= radius * radius) {
                    return true;
                }
            }
        }
        return false;
    }
}
